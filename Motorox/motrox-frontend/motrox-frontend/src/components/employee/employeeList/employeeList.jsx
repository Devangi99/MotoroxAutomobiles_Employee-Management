import React, { Component } from 'react';
import styles from "./employeeList.module.css";
import employeeService from "../../../Services/employeeService";
import swal from 'sweetalert';

class employeeList extends Component {
    constructor(props){
        super(props)

        this.state = {
            employees: [],
            searchEmployeeName : ""
        }
        this.addEmployee = this.addEmployee.bind(this);
        this.editEmployee = this.editEmployee.bind(this);
        this.deleteEmployee = this.deleteEmployee.bind(this);

        this.searchEmployeeName = this.searchEmployeeName.bind(this);
        this.onChangesearchEmployeeName = this.onChangesearchEmployeeName.bind(this);
        this.generateReport = this.generateReport.bind(this);
      
    }

    deleteEmployee(id){

        swal({
            title: "Are you sure?",
            text: "Once deleted, this cannot be recovered!",
            icon: "warning",
            buttons: true,
            dangerMode: true, }).then((willDelete) => {
            if (willDelete) {
              swal("Successfully deleted", {
                icon: "success",
              });
    


        employeeService.deleteEmployee(id).then( res => {
            this.setState({employees: this.state.employees.filter(employee => employee.employeeId !== id)});
        });    
        
    } else {
        swal("Cancelled!");
      }
    });
    }

    viewEmployee(id){
        this.props.history.push(`/view-employee/${id}`);
    }

    editEmployee(id){
        this.props.history.push(`/add-employee/${id}`);
    }

    componentDidMount(){
        employeeService.getEmployees().then((res) => {
            this.setState({employees: res.data});
        });
    }

    addEmployee(){
        this.props.history.push('/add-employee/_add');
    }


    searchEmployeeName(){
        employeeService.findByEmployeeName(this.state.searchEmployeeName)
        .then(response => {
            this.setState({
                employees: response.data
        });
        console.log(response.data);
    })
    .catch(e => {
        console.log(e);
    });
}

    onChangesearchEmployeeName(e){
        const searchEmployeeName = e.target.value;

        this.setState({
            searchEmployeeName: searchEmployeeName
        });
    }

    generateReport(){
        employeeService.generateEmployeeReport();
        swal("Report is generated", "", "success")
    }

    render() {
        const{searchEmployeeName} = this.state
        return (
            <div><br/>
                <h2 className = "text-left">Employee List</h2>
                <br/>
                <button 
                style = {{width:'150px', height:'40px', float:'left'}}
                className = "btn btn-primary" onClick={this.addEmployee}>Add employee</button>

            <div style = {{float:'center', paddingTop:'0%', paddingLeft:'600px'}}>
                <input
                style = {{width:'300px', height:'40px'}} 
                type="text"
                className="form-control"
                placeholder="Search by name"
                value={searchEmployeeName}
                onChange={this.onChangesearchEmployeeName}
                />
        
            <button
             className="input-group-append"
             style = {{width: '150px', height: '40px', marginBottom: '5px'}}
            className="btn btn-info"
                type="button"
                onClick={this.searchEmployeeName}>
                    Search
                </button>
            </div>

            <button
            style = {{width: '150px', height: '40px', float:'left'}}
            onClick ={ () => this.generateReport()} 
            className = "btn btn-secondary">Report</button>
<br/><br/><br/>
                <div className = "row">
                <table className = "table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>Name</th>  
                            <th>Phone</th>
                           
                            <th>Type</th>
                            <th>Category</th>
                            <th>Actions</th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.employees.map(
                                employee => 
                                <tr key = {employee.employeeId}>
                                    <td className = {styles.aligning}>{employee.employeeName}</td>
                                   
                                    <td className = {styles.aligning}>{employee.employeePhone}</td>
                                    
                                    <td className = {styles.aligning}>{employee.employeeType}</td>
                                    <td className = {styles.aligning}>{employee.employeeCategory}</td>
                                    <td className = {styles.actions}>
                                       
                                        <button onClick ={ () => this.editEmployee(employee.employeeId)} className = "btn btn-info btn-sm">Update</button>&emsp;
                                        <button onClick ={ () => this.viewEmployee(employee.employeeId)} className = "btn btn-warning btn-sm">View</button>&emsp;
                                        <button onClick ={ () => this.deleteEmployee(employee.employeeId)} className = "btn btn-danger btn-sm">Delete</button>&emsp;
                                      
                                    </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
                </div>
            </div>
        );
    }
}

export default employeeList;
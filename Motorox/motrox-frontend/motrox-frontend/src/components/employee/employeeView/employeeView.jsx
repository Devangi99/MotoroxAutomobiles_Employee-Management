import React, { Component } from 'react';
import styles from "./employeeView.module.css";
import employeeService from "../../../Services/employeeService";

class employeeView extends Component {
    constructor(props){
        super(props)

        this.state = {
            employeeId: this.props.match.params.id, //id to employeeId
            employee: {}
        }
    }

    componentDidMount(){
        employeeService.getEmployeeById(this.state.employeeId).then( res => {
            this.setState({employee: res.data});
        });
    }

    render() { //lables edited
        return (
            <div>
                <br/>
         
                    <h3 className = "text-center">View employee details</h3>

                    <br/>
             
                        <div className = {styles.dcard}>

                        <table className = {styles.details}>

                        <tr>
                            <td>Name:</td>
                            <td>{this.state.employee.employeeName}</td>
                        </tr>
                        <tr>
                            <td>NIC:</td>
                            <td>{this.state.employee.employeeNIC}</td>
                        </tr>
                        <tr>
                            <td>Address :</td>
                            <td>{this.state.employee.employeeAddress}</td>
                        </tr>
                        <tr>
                            <td>Phone :</td>
                            <td>{this.state.employee.employeePhone}</td>
                        </tr>
                        <tr>
                            <td>Email :</td>
                            <td>{this.state.employee.employeeEmail}</td>
                        </tr>
                        <tr>
                            <td>Join Date :</td>
                            <td>{this.state.employee.employeeJoinDate}</td>
                        </tr>
                        <tr>
                            <td>Basic Salary :</td>
                            <td> {this.state.employee.basicSalary}</td>
                        </tr>
                        <tr>
                            <td>Type :</td>
                            <td>{this.state.employee.employeeType}</td>
                        </tr>
                        <tr>
                            <td>Category :</td>
                            <td> {this.state.employee.employeeCategory}</td>
                        </tr>

                            </table>

                        </div>
                    </div>
            
        );
    }
}

export default employeeView;
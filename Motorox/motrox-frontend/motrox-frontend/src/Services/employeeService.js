import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/v1/employees";
class employeeService{

    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL);
    }

    createEmployee(employee){
        return axios.post(EMPLOYEE_API_BASE_URL, employee);
    }

    getEmployeeById(employeeId){
        return axios.get(EMPLOYEE_API_BASE_URL + '/' + employeeId);
    }

    updateEmployee(employee, employeeId){
        return axios.put(EMPLOYEE_API_BASE_URL + '/' + employeeId, employee);
    }

    deleteEmployee(employeeId){
        return axios.delete(EMPLOYEE_API_BASE_URL + '/' + employeeId);

    }

    findByEmployeeName(employeeName){
        return axios.get(EMPLOYEE_API_BASE_URL + '?employeeName=' + employeeName);
    }

    generateEmployeeReport(){
        return axios.get(EMPLOYEE_API_BASE_URL + '/report/pdf');
    }

}

export default new employeeService()
import axios from "axios";

const JOBSHEET_API_BASE_URL = "http://localhost:8080/api/v1/jobSheets";

class JobSheetService{
    getJobSheets(){
        return axios.get(JOBSHEET_API_BASE_URL);
    }

    createJobSheet(jobSheet){
        return axios.post(JOBSHEET_API_BASE_URL,jobSheet);
    }

    getJobSheetById(jobSheetid){
        return axios.get(JOBSHEET_API_BASE_URL + '/' + jobSheetid);
    }

    updateJobSheet(jobSheet,jobSheetId){
        return axios.put(JOBSHEET_API_BASE_URL + '/' + jobSheetId,jobSheet);
    }

    deleteJobSheet(jobSheetId){
        return axios.delete(JOBSHEET_API_BASE_URL + '/' + jobSheetId);
    }
}

export default new JobSheetService()
import axios from "axios";

const baseURL = "http://localhost:8080/api/mock_data/"

class MockDataService {
    getMockData() {
        return axios.get(baseURL);
    }

    getValues(column, isUnique) {
        return axios.get(`${baseURL}${column}`, {params: {unique: isUnique}})
    }
}

export default new MockDataService();
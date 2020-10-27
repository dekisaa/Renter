import axios from "axios";

const RenterAxios = axios.create({
    baseURL: 'http://localhost:8080/api/'
});

export default RenterAxios;
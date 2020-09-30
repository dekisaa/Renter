import axios from 'axios';

var RenterAxios = axios.create({
  baseURL: 'http://localhost:8080/api',
  /* other custom settings */
});

export default RenterAxios;
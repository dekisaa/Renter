import RenterAxios from '../apis/RenterAxios';

export const login = async function (credentials) {
  try {
    let response = await RenterAxios.post("/users/login", credentials);
    let token = response.data;

    console.log(token);
    window.localStorage.setItem("token", token);

    window.location.reload();
  } catch (error) {
    alert("Could not log in.");
  }
};

export const logout = function(){
    window.localStorage.removeItem("token");
    window.location.reload();
}

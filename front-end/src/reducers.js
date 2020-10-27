import {combineReducers} from "redux";
import apartmentReducer from "./apartment/ApartmentReducer";

export default combineReducers({
    apartmentState: apartmentReducer
});
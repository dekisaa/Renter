import {GET_APARTMENTS} from "./ApartmentReducer";
import {ApiGetApartments} from "./ApartmentsApi";

let GetApartments = function (startDate, endDate, location, numberOfGuests) {
    return async  function (dispatch, getState){
        try{
            let apartments = await ApiGetApartments(startDate, endDate, location, numberOfGuests);
            dispatch({type: GET_APARTMENTS, payload: apartments})
        }catch (e){
            dispatch({type: GET_APARTMENTS, payload: [] })
        }
    }
}

export default GetApartments;
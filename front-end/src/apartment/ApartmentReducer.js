export const GET_APARTMENTS = "GET_APARTMENTS";

export const initialApartmentsState = {
    apartments: []
}

const apartmentReducer = function (state = initialApartmentsState, action){
    switch (action.type) {
        case GET_APARTMENTS:
            return Object.assign({}, state, {
                apartments: action.payload
            })
        default:
            return state;
    }
}

export default  apartmentReducer;
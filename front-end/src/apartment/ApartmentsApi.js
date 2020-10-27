import RenterAxios from "../axios/RenterAxios";

export const ApiGetApartments = async (startDate, endDate, location, numberOfGuest) => {
    try{
        let response = await RenterAxios.get('apartments', {
            params:{
                startDate: startDate,
                endDate: endDate,
                location: location,
                numberOfGuest: numberOfGuest
            }
        })
    }catch (e){
        console.log(e);
        return null;
    }
}
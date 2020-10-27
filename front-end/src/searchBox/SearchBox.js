import React from 'react';
import {DateRangePicker} from 'react-dates';
import 'react-dates/lib/css/_datepicker.css';
import GetApartments from "../apartment/ApartmentsActions";
import {connect} from "react-redux";

class SearchBox extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            startDate: null,
            endDate: null
        }
    }

    submitSearch() {
        console.log(this.state.startDate.format('YYYY-MM-DD'))
        console.log(this.state.endDate)
        this.props.getApartments()

    }

    render() {
        return (
            <div className="container">
                <form action="#" method="post" noValidate="novalidate">
                    <div className="row">
                        <div className="col-lg-12">
                            <div className="row">
                                <div className="col-lg-3 col-md-3 col-sm-12 p-0">
                                    <input type="text" className="form-control search-slt"
                                           placeholder="Location"/>
                                </div>
                                <div className="col-lg-auto col-md-auto col-sm-auto p-0">
                                <DateRangePicker
                                    startDate={this.state.startDate} // momentPropTypes.momentObj or null,
                                    startDateId="your_unique_start_date_id" // PropTypes.string.isRequired,
                                    endDate={this.state.endDate} // momentPropTypes.momentObj or null,
                                    endDateId="your_unique_end_date_id" // PropTypes.string.isRequired,
                                    onDatesChange={({startDate, endDate}) => this.setState({
                                        startDate,
                                        endDate
                                    })} // PropTypes.func.isRequired,
                                    focusedInput={this.state.focusedInput} // PropTypes.oneOf([START_DATE, END_DATE]) or null,
                                    onFocusChange={focusedInput => this.setState({focusedInput})} // PropTypes.func.isRequired,
                                />
                                </div>
                                <div className="col-lg-3 col-md-3 col-sm-12 p-0">
                                    <input type="text" className="form-control search-slt"
                                           placeholder="Number of guests"/>
                                </div>
                                <div className="col-lg-auto col-md-auto col-sm-auto p-0">
                                    <button type="button" className="btn btn-danger wrn-btn"
                                            onClick={(e) => this.submitSearch(e)}>Search
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        );
    }
}

const mapStateToProps = (state) => {
    return {
        apartments: state.apartmentState
    };
}

const mapDispatchToProps = (dispatch) => {
    return {
        getApartments: (startDate, endDate, location, numberOfGuests) => dispatch(GetApartments(startDate, endDate, location, numberOfGuests))
    }
}

const Container = connect(mapStateToProps, mapDispatchToProps)(SearchBox);

export default Container;
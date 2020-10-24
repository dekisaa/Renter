import React from 'react';
import './App.css';
import 'react-dates/initialize';
import {
    Route,
    Link,
    HashRouter as Router,
    Switch,
    Redirect,
} from "react-router-dom";
import Home from "./home/Home";
import {NotificationContainer, NotificationManager} from "react-notifications";

class App extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <Router>
                    <Switch>
                        <Route path='/' exact={true} component={Home}/>
                    </Switch>
                </Router>
                <NotificationContainer/>
            </div>
        );
    }
}

export default App;

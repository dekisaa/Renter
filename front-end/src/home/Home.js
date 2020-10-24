import React from 'react';
import {Col, Container} from 'reactstrap';
import AppNavbar from "../navbar/AppNavbar";

class Home extends React.Component {
    render() {
        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <Col className="text-center">
                        <p>
                        </p>
                    </Col>
                </Container>
            </div>
        );
    }
}

export default Home;
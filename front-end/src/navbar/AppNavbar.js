import React, {Component} from 'react';
import '../App.css';
import {Link} from 'react-router-dom';
import {Collapse, Nav, Navbar, NavbarBrand, NavItem, NavLink, NavbarToggler} from 'reactstrap';

export default class AppNavbar extends Component {

    render() {
        return <Navbar color="dark" dark expand="md">
            <NavbarBrand tag={Link} to="/">Home</NavbarBrand>
                <Nav className="ml-auto" navbar>
                    <NavItem>
                        <NavLink href="">GitLab</NavLink>
                    </NavItem>
                </Nav>
        </Navbar>;
    }
}
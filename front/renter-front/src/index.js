import React from "react";
import ReactDOM from "react-dom";
import {  Route,  Link,  HashRouter as Router,  Switch,  Redirect,} from "react-router-dom";
import Home from "./components/home/Home";
import NotFound from "./components/home/NotFound";
import { Container, Navbar, Nav, Button } from "react-bootstrap";
import Login from "./components/authentication/Login";
import { logout } from "./services/auth";

class App extends React.Component {
  //TODO: dodati RB Navbar
  //TODO: Zaštititi putanje
  render() {
    let token = window.localStorage.getItem("token");

    if (token) {
      return (
        <div>
          <Router>
            <Navbar bg="dark" variant="dark" expand>
              <Navbar.Brand as={Link} to="/">
                JWD
              </Navbar.Brand>
              <Nav>
                <Nav.Link as={Link} to="/users">
                  Users
                </Nav.Link>
                <Nav.Link as={Link} to="/activities">
                  Activities
                </Nav.Link>
                <Nav.Link as={Link} to="/records">
                  Records
                </Nav.Link>
              </Nav>
              <Button
                onClick={() => {
                  logout();
                }}
                variant="outline-info"
              >
                Log Out
              </Button>
            </Navbar>

            <Container>
              <Switch>
                <Route exact path="/" component={Home} />
                <Route exact path="/login">
                  <Redirect to="/"></Redirect>
                </Route>
                <Route component={NotFound} />
              </Switch>
            </Container>
          </Router>
        </div>
      );
    } else {
      return (
        <Router>
          <Container>
            <Switch>
              <Route exact path="/login" component={Login}></Route>
              <Route path="/">
                <Redirect to="/login"></Redirect>
              </Route>
            </Switch>
          </Container>
        </Router>
      );
    }
  }
}

ReactDOM.render(<App />, document.querySelector("#root"));

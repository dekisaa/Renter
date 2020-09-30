import React from "react";
import ReactDOM from "react-dom";
import {
  Route,
  Link,
  HashRouter as Router,
  Switch,
  Redirect,
} from "react-router-dom";
import Home from "./components/Home";
import NotFound from "./components/NotFound";
import Activities from "./components/activities/Activities";
import AddActivity from "./components/activities/AddActivity";
import EditActivity from "./components/activities/EditActivity";
import Records from "./components/records/Records";
import AddRecord from "./components/records/AddRecord";
import EditRecord from "./components/records/EditRecord";
import { Container, Navbar, Nav, Button } from "react-bootstrap";
import Login from "./components/authentication/Login";
import { logout } from "./services/auth";
import Zadaci from "./components/zadaci/Zadaci";

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
                <Nav.Link as={Link} to="/zadaci">
                  Zadaci
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
                <Route exact path="/activities" component={Activities} />
                <Route exact path="/activities/add" component={AddActivity} />
                <Route
                  exact
                  path="/activities/edit/:id"
                  component={EditActivity}
                />
                <Route exact path="/zadaci" component={Zadaci} />
                <Route exact path="/records/add" component={AddRecord} />
                <Route exact path="/records/edit/:id" component={EditRecord} />
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

import React, { Component } from 'react';
import { BrowserRouter as Router, Route, NavLink } from "react-router-dom";
import User from './User.js';
import axios from 'axios';
import './App.css';
import ComboCreator from './ComboCreator.js';
import ComboViewer from './ComboViewer.js';
import Main from './Main.js';
import AddGame from './AddGame.js';
import AddPlayer from './AddPlayer.js';
import AddCombo from './AddCombo.js';



// export default RoutePage;


class Routeth extends Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      password: ''
    }
  }


  logOut = () => {
    this.props.logOut();
  }

  render() {
    return (
      <div className="body">
        <Router>
          <div className="container">
            <div className="row">
              <div className="col-2">
                <div className="text-center">
                  <NavLink to="/">Home</NavLink>
                </div>
              </div>
              <div className="col-2">
                <div className="text-center">
                  <NavLink to="/AddGame">Add Game</NavLink>
                </div>
              </div>
              <div className="col-2">
                <div className="text-center">
                  <NavLink to="/AddPlayer">Add Character</NavLink>
                </div>
              </div>
              <div className="col-2">
                <div className="text-center">
                  <NavLink to="/AddCombo">Add Combo</NavLink>
                </div>
              </div>
              <div className="col-2">
                <div className="text-center">
                  <NavLink to="/ComboViewer">View EVERYTHING</NavLink>
                </div>
              </div>
            </div>

            <Route exact path="/" component={Main}></Route>
            <Route path="/AddGame" component={AddGame}></Route>
            <Route path="/AddPlayer" component={AddPlayer}></Route>
            <Route path="/AddCombo" component={AddCombo}></Route>
            <Route path="/ComboViewer" component={ComboViewer}></Route>
          </div>
        </Router>
      </div>

    );
  }
}

export default Routeth;
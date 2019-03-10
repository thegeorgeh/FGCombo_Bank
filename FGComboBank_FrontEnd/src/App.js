import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

// import logo from './logo.svg';
// import RouterFunction from './Router.js';
// import ComboCreator from './ComboCreator.js'; 
import User from './User.js';
import './App.css';
import RouterFunction from './Router.js';
import Routeth from './Routing.js';
import AddGame from './AddGame.js';
import AddPlayer from './AddPlayer.js';
//import AddCombo from './AddCombo.js';
import ComboViewer from './ComboViewer';




// import Panel from './Panel';

// import ListOfGames from './ListOfGames';
// import Panel from './Panel';

class App extends Component {
  render() {
    return (
    <div>
      {/* <RouterFunction></RouterFunction> */}
      {/* <ComboCreator/> */}
      {/* <User/> */}
      {/* <ComboViewer/>  */}
      <Routeth></Routeth>
    {/* <AddGame/> */}
    {/* <AddPlayer/> */}
    </div>
    );
  }
}

export default App;


import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

import './App.css';
import Routeth from './Routing.js';

class App extends Component {
  render() {
    return (
    <div>
      <Routeth></Routeth>
    </div>
    );
  }
}

export default App;


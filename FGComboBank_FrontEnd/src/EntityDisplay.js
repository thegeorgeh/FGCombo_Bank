import React, { Component } from 'react';
import DisplayGamePlayerCombos from './DisplayGamePlayerCombos.js';
import './App.css';

class EntityDisplay extends Component {
    render() {
        return (
            <div>
                <li>
                    <a> {this.props.gameID} {this.props.gameName}  <DisplayGamePlayerCombos gameID={this.props.gameID}/></a>
                </li>
            </div>
        )
    }
}

export default EntityDisplay;
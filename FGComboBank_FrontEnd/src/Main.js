import React, { Component } from 'react';
import GamesListMake from './GamesListMake';
import axios from 'axios';
import './App.css';
import GameList from './GameList';
import EntityDisplay from './EntityDisplay.js';
// import LoopFunction from './LoopFunction';

class Main extends Component {
    constructor(props) {
        super(props);
        this.state = {

        }
    }

    render() {
        return (
            <div className="body">
                <br />
                <div className="container">
                    <div className="row">
                        
                            <div className="col-12">
                            <div className="text-center">
                                <label>
                                    <h1 id="Main">COMBO MASTER</h1>
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );

    }
}

export default Main;
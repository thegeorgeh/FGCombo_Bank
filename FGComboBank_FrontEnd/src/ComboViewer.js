import React, { Component } from 'react';
import GamesListMake from './GamesListMake';
import axios from 'axios';
import './App.css';
import GameList from './GameList';
import EntityDisplay from './EntityDisplay.js';

class ComboViewer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            games: [],

        }
    }

    getAll = () => {
        axios.get('/getAllGames').then(r => { this.setState({ games: r.data }) });
    }


    render() {

        let games = this.state.games.map(g => <EntityDisplay gameName={g.gameName} gameID={g.gameID}  />)

        return (
            <div className="body">  
                <div className="container">
                    <br />
                    <div className="row">
                        <div className="col-12">
                            <label>
                                <h1>COMBO VIEWER</h1>
                            </label> 
                            <div> 
                                {games}
                            </div>
                        </div>
                    </div>
                    <br />
                    <button onClick={this.getAll}>get all games</button>


                </div>
                
            </div>
        );

    }
}

export default ComboViewer;
import React, { Component } from 'react';
import Routing from './Routing.js';
import axios from 'axios';
import './App.css';

class ComboCreator extends Component {
    constructor(props) {
        super(props);
        this.state = {
            gameName: '',
            playerName: '',
            comboName: '',
            comboInput: '',
            combo: '',
            games: [],
            players: []

        }
    }

    pushRequest = () => {
        var nameGame = document.getElementById('nameGame').value;
        var nameCharacter = document.getElementById('nameCharacter').value;
        var nameCombo = document.getElementById('nameCombo').value;
        var inputCombo = document.getElementById('inputCombo').value;

        axios.post(`/addGame/${this.state.gameName}`);
        // axios.post(`/addPlayer/${this.state.games[this.state.games.length - 1].gameID}/${this.state.playerName}`);
        // axios.post(`/addCombo/${this.state.players[this.state.players.length -1 ].playerID}/${this.state.comboName}/${this.state.comboInput}`);
    }


    setStates = (event) => {
        this.setState({ [event.target.name]: event.target.value });
    }

    handleSubmit = (event) => {
        console.log('A game name was submitted: ' + this.state.gameName);
        console.log('A player name was submitted: ' + this.state.playerName);
        console.log('A combo name was submitted: ' + this.state.comboName);
        console.log('A combo was submitted: ' + this.state.comboInput);
        event.preventDefault();
    }



    render() {
        return (
            <div className="body">
                <form onSubmit={this.handleSubmit} className="form-inline">
                    <div className="container">
                        <br />
                        <div className="row">
                            <div className="col-12">
                                <label>
                                    <h1 id="TekkenFont">Combo Creator</h1>
                                </label>
                            </div>
                        </div>
                        <br />
                        <div className="row">
                            <div className="col-6">
                                <label>
                                    <input type="text" name="gameName" target='one' className="form-control inputArea" onChange={this.setStates} gameName={this.state.gameName} id="nameGame" placeholder="Game *"></input>
                                </label>
                            </div>
                        
                        <br />
                        
                            <div className="col-6">
                                <label>
                                    <input type="text" name="playerName" target='one' className="form-control inputArea" onChange={this.setStates} playerName={this.state.playerName} id="nameCharacter" placeholder="Character *"></input>
                                </label>
                            </div>
                        </div>
                        <br />
                        <div className="row">
                            <div className="col-6">
                                <label>
                                    <input type="text" name="comboName" target='one' className="form-control inputArea" onChange={this.setStates} comboName={this.state.combo} id="nameCombo" placeholder="Combo Name *"></input>
                                </label>
                            </div>
                        
                        <br />
                        
                            <div className="col-6">
                                <label>
                                    <input type="text" name="comboInput" target='one' className="form-control inputArea" onChange={this.setStates} comboInput={this.state.combo} id="inputCombo" placeholder="Combo Input *"></input>
                                </label>
                            </div>
                        </div>
                        <br />
                        <div className="row">
                            <div className="col-12">
                                <label>
                                    <input type="submit" value="Submit" onClick={this.pushRequest} />
                                </label>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        );
    }
}

export default ComboCreator;
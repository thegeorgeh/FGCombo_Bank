import React, { Component } from 'react';
import GamesListMake from './GamesListMake';
import axios from 'axios';
import './App.css';
import GameList from './GameList';
import EntityDisplay from './EntityDisplay.js';
// import LoopFunction from './LoopFunction';

class ComboViewer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            games: [],

        }
    }


    // pushRequest = () => {
    //     var nameGame = document.getElementById('nameGame').value;
    //     var nameCharacter = document.getElementById('nameCharacter').value;
    //     var nameCombo = document.getElementById('nameCombo').value;
    //     var inputCombo = document.getElementById('inputCombo').value;

    //     axios.post(`/addGame/${this.state.userName}/${this.state.gameName}/${this.state.player}`);
    //     axios.post(`/addPlayer/${this.state.playerName}`);
    //     axios.post(`/addCombo/${this.state.comboName}/${this.state.comboInput}`);
    // }


    // setStates = (event) => {
    //     this.setState({ [event.target.name]: event.target.value });
    // }

    // handleSubmit = (event) => {
    //     console.log('A game name was submitted: ' + this.state.gameName);
    //     console.log('A player name was submitted: ' + this.state.playerName);
    //     console.log('A combo name was submitted: ' + this.state.comboName);
    //     console.log('A combo was submitted: ' + this.state.comboInput);
    //     event.preventDefault();
    // }

    getAll = () => {
        axios.get('/getAllGames').then(r => { this.setState({ games: r.data }) });
    }


    // getRequest = () => {
    //     axios.get(`/getGame/1`).then(r => { this.setState({ games: r.data }) });
    // }

    // isCharacterChecked = () => {axios.get('/getAllPlayers').then(r => { this.setState({ players: r.data }) });}








    // let combos = this.state.combos.map(c => <GamesListMake comboName={c.comboName} />)
    // let players = this.state.players.map(p => <GamesListMake playerName={p.playerName} />)
    // let games = this.state.games.map(g => <GamesListMake gameName={g.gameName} />)
    // let gameIDs = this.state.games.map(g => <GamesListMake gameID={g.gameID} />)
    // let all;

    // for (let i = 0; i < this.state.games.length; i++) {
    //     for (let j = 0; j < this.state.players.length; j++) {
    //         for (let k = 0; k < this.state.combos.length; k++) {
    //             all = this.state.users.map(u => <GamesListMake gameID={gameIDs[i]} gameName={games[i]} playerName={players[j]} comboName={combos[k]} />)

    //         }
    //     }

    // }
    render() {

        let games = this.state.games.map(g => <EntityDisplay gameName={g.gameName} gameID={g.gameID}  />)

        return (
            <div className="body">

                {/* <form onSubmit={this.handleSubmit} className="form-inline"> */}
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

                    {/* <div>{games}</div> */}
                    <button onClick={this.getAll}>get all games</button>

                    {/* <div className="row">
                            <div className="col-12">
                                <label>
                                    <input type="radio" name="SearchBy" target='one' className="form-control inputArea"   gameName={this.state.gameName} id="All" placeholder="Game *" checked/>All
                                </label>
                            </div>
                        </div>
                        <br />
                        <div className="row">
                            <div className="col-12">
                                <label>
                                    <input type="radio" name="SearchBy" target='one' className="form-control inputArea" onChange={this.setStates} playerName={this.state.playerName} id="Games" placeholder="Character *"  />Games
                                </label>
                            </div>
                        </div>
                        <br />
                        <div className="row">
                            <div className="col-12">
                                <label>
                                    <input type="radio" name="SearchBy" target='one' className="form-control inputArea" onChange={this.setStates} comboName={this.state.combo} id="SearchBy" placeholder="Combo Name *" />Characters
                                </label>
                            </div>
                        </div>
                        <br />
                        <div className="row">
                            <div className="col-12">
                                <label>
                                    <input type="radio" name="SearchBy" target='one' className="form-control inputArea" onClick={this.isComboChecked()} comboInput={this.state.combo} id="SearchBy" placeholder="Combo Input *" />Combos
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
                        <p>{this.state.games}</p>
                        <p>{this.state.players}</p>
                        <p>{this.state.combos}</p> */}
                </div>
                {/* </form> */}
            </div>
        );

    }
}

export default ComboViewer;
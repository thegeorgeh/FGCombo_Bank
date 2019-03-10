import React, { Component } from 'react';
import Routing from './Routing.js';
import axios from 'axios';
import './App.css';

class AddPlayer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            gameID: null,
            playerName: '',
            playerID: null,
            players: []
        }
    }

    pushRequest = () => {
        var namePlayer = document.getElementById('namePlayer').value;
        axios.post(`/addPlayer/${this.state.gameID}/${this.state.playerName}`);
    }

    editRequest = () => {
        axios.put(`/updatePlayer/${this.state.playerID}/${this.state.playerName}`);
    }

    deleteRequest = () => {
        axios.delete(`/removePlayer/${this.state.playerID}`);
    }

    setStates = (event) => {
        this.setState({ [event.target.name]: event.target.value });
    }

    handleSubmit = (event) => {
        console.log('A player name was submitted: ' + this.state.playerName);
        event.preventDefault();
    }

    render() {
        return (
            <div>
                {/* <form onSubmit={this.handleSubmit} className="form-inline"> */}
                <div className="container">
                    <br />
                    <br/>
                    <div className="row">
                        <div className="col-12">
                            <label>
                                <h1>PLAYER CREATOR</h1>
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                    <div className="col-4">
                            <label>
                                <input type="text" name="gameID" target='one' className="form-control inputArea" onChange={this.setStates} gameID={this.state.gameID} id="gameID" placeholder="Game ID *"></input>
                            </label>
                        </div>
                        <div className="col-4">
                            <label>
                                <input type="text" name="playerName" target='one' className="form-control inputArea" onChange={this.setStates} playerName={this.state.playerName} id="namePlayer" placeholder="Player *"></input>
                            </label>
                        </div>
                        <div className="col-4">
                            <label>
                                <input type="submit" value="Submit" onClick={this.pushRequest} />
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-4">
                            <label>
                                <input type="text" name="playerID" target='one' className="form-control inputArea" onChange={this.setStates} playerName={this.state.playerID} id="playerID" placeholder="Player ID *"></input>
                            </label>
                        </div>
                        <div className="col-4">
                            <label>
                                <input type="text" name="playerName" target='one' className="form-control inputArea" onChange={this.setStates} playerName={this.state.playerName} id="namePlayer" placeholder="New Player Name *"></input>
                            </label>
                        </div>
                        <div className="col-4">
                            <label>
                                <input type="submit" value="Submit" onClick={this.editRequest} />
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-8">
                            <label>
                                <input type="text" name="playerID" target='one' className="form-control inputArea" onChange={this.setStates} playerID={this.state.playerID} id="playerID" placeholder="Player ID *"></input>
                            </label>
                        </div>
                        <div className="col-4">
                            <label>
                                <input type="submit" value="Submit" onClick={this.deleteRequest} />
                            </label>
                        </div>
                    </div>
                </div>




                {/* </form> */}
            </div >
        );
    }
}

export default AddPlayer;
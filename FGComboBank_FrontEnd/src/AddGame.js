import React, { Component } from 'react';
import Routing from './Routing.js';
import axios from 'axios';
import './App.css';

class AddGame extends Component {
    constructor(props) {
        super(props);
        this.state = {
            gameName: '',
            gameID: null,
            games: []
        }
    }

    pushRequest = () => {
        var nameGame = document.getElementById('nameGame').value;
        axios.post(`/addGame/${this.state.gameName}`);
    }

    editRequest = () => {
        axios.put(`/updateGame/${this.state.gameID}/${this.state.gameName}`);
    }

    deleteRequest = () => {
        axios.delete(`/removeGame/${this.state.gameID}`);
    }

    setStates = (event) => {
        this.setState({ [event.target.name]: event.target.value });
    }

    handleSubmit = (event) => {
        console.log('A game name was submitted: ' + this.state.gameName);
        event.preventDefault();
    }

    render() {
        return (
            <div>
                {/* <form onSubmit={this.handleSubmit} className="form-inline"> */}
                <div className="container">
                    <br />
                    <br />
                    <div className="row">
                        <div className="col-12">
                            <label>
                                <h1>GAME CREATOR</h1>
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-8">
                            <label>
                                <input type="text" name="gameName" target='one' className="form-control inputArea" onChange={this.setStates} gameName={this.state.gameName} id="nameGame" placeholder="Game *"></input>
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
                                <input type="text" name="gameID" target='one' className="form-control inputArea" onChange={this.setStates} gameName={this.state.gameID} id="gameID" placeholder="Game ID *"></input>
                            </label>
                        </div>
                        <div className="col-4">
                            <label>
                                <input type="text" name="gameName" target='one' className="form-control inputArea" onChange={this.setStates} gameName={this.state.gameName} id="nameGame" placeholder="New Game Name *"></input>
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
                                <input type="text" name="gameID" target='one' className="form-control inputArea" onChange={this.setStates} gameID={this.state.gameID} id="gameID" placeholder="Game ID *"></input>
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

export default AddGame;
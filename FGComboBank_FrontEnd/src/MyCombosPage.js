import React, { Component } from 'react';
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
            combo: ''
        }
    }

    

    pushRequest = () => {
        var nameGame = document.getElementById('nameGame').value;
        var nameCharacter = document.getElementById('nameCharacter').value;
        var nameCombo = document.getElementById('nameCombo').value;
        var inputCombo = document.getElementById('inputCombo').value;

        axios.post(`/addGame/${this.state.gameName}`);
        axios.post(`/addPlayer/${this.state.playerName}`);
        axios.post(`/addCombo/${this.state.comboName}/${this.state.comboInput}`);
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
            <div>
                <form onSubmit={this.handleSubmit} className="form-inline">
                    <div className="container">


                    </div>
                </form>
            </div>
        );
    }
}

export default ComboCreator;
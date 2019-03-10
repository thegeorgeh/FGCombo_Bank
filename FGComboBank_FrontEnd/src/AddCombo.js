import React, { Component } from 'react';
import Routing from './Routing.js';
import axios from 'axios';
import './App.css';

class AddCombo extends Component {
    constructor(props) {
        super(props);
        this.state = {
            comboName: '',
            comboID: null,
            combos: []
        }
    }

    pushRequest = () => {
        var nameCombo = document.getElementById('nameCombo').value;
        axios.post(`/addCombo/${this.state.comboName}`);
    }

    editRequest = () => {
        axios.put(`/updateCombo/${this.state.playerID}/${this.state.comboName}`);
    }

    deleteRequest = () => {
        axios.delete(`/removeCombo/${this.state.comboID}`);
    }

    setStates = (event) => {
        this.setState({ [event.target.name]: event.target.value });
    }

    handleSubmit = (event) => {
        console.log('A combo name was submitted: ' + this.state.comboName);
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
                                <h1>COMBO CREATOR</h1>
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-3">
                            <label>
                                <input type="text" name="playerID" target='one' className="form-control inputArea" onChange={this.setStates} playerID={this.state.playerID} id="playerID" placeholder="Character ID *"></input>
                            </label>
                        </div>
                        <div className="col-3">
                            <label>
                                <input type="text" name="comboName" target='one' className="form-control inputArea" onChange={this.setStates} comboName={this.state.comboName} id="nameCombo" placeholder="Combo *"></input>
                            </label>
                        </div>
                        <div className="col-3">
                            <label>
                                <input type="text" name="comboInput" target='one' className="form-control inputArea" onChange={this.setStates} comboInput={this.state.comboInput} id="inputCombo" placeholder="Combo Input *"></input>
                            </label>
                        </div>
                        <div className="col-3">
                            <label>
                                <input type="submit" value="Submit" onClick={this.pushRequest} />
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-3">
                            <label>
                                <input type="text" name="comboID" target='one' className="form-control inputArea" onChange={this.setStates} comboName={this.state.comboID} id="comboID" placeholder="Combo ID *"></input>
                            </label>
                        </div>
                        <div className="col-5">
                            <label>
                                <input type="text" name="comboName" target='one' className="form-control inputArea" onChange={this.setStates} comboName={this.state.comboName} id="nameCombo" placeholder="New Combo Name *"></input>
                            </label>
                        </div>
                        <div className="offset-1 col-3">
                            <label>
                                <input type="submit" value="Submit" onClick={this.editRequest} />
                            </label>
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-8">
                            <label>
                                <input type="text" name="comboID" target='one' className="form-control inputArea" onChange={this.setStates} comboID={this.state.comboID} id="comboID" placeholder="Combo ID *"></input>
                            </label>
                        </div>
                        <div className="offset-1 col-3">
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

export default AddCombo;
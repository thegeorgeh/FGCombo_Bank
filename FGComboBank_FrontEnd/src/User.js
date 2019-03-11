import React, { Component } from 'react';
import { BrowserRouter as Router, Route, NavLink } from "react-router-dom";
import axios from 'axios';
import './App.css';
import ComboCreator from './ComboCreator.js';
import Routing from './Routing.js';

class User extends Component {
    constructor(props) {
        super(props);
        this.state = {
            currentUserID: null,
            loggedIn: false,
            currentUsername: null,
            userName: '',
            userPassword: '',
            enteredUserName: "",
            enteredUserPassword: "",
            users: [],
            userid: null,
            loginAccepted: false,
            register: false,
            user: [],
            displayedResponse: '',
            requestResponse: ''


        }
    }

    check = (e) => {
        e.preventDefault();
        this.getRequest();
        //let users = this.state.users.map(u => <Users userID={u.userID} userName={u.userName} userPassword={u.userPassword}/>)

        for (let i = 0; i < this.state.users.length; i++) {
            // console.log("user name"+this.state.users[i].userName+" entered"+this.state.enteredUsername);
            if (this.state.users[i].userName === this.state.enteredUserName && this.state.users[i].userPassword === this.state.enteredUserPassword) {
                this.setState({ userid: this.state.users[i].userID })
                this.setState({ loginAccepted: true });
                this.props.setCurrentUser(this.state.userID, this.state.enteredUserName, this.state.loginAccepted);
                break;
            }

        }
    }

    setCurrentUser = (e) => {
        e.preventDefault();
        this.getRequest();
    }

    pushRequest = () => {
        axios.post(`/addUser/${this.state.userName}/${this.state.userPassword}`).then(r => { this.setState({ requestResponse: r.data }) });
    }

    getRequest = () => {
        console.log(`user id ${this.state.enteredUserName} userName ${this.state.enteredUserPassword}`);
        axios.get(`/logInUser/${this.state.enteredUserName}/${this.state.enteredUserPassword}`).then(r => { this.setState({ user: r.data, loggedIn: true }) });
        console.log(this.state.currentUsername);
    }
    setStates = (event) => {
        this.setState({ [event.target.name]: event.target.value });
    }

    setStates2 = (event) => {
        this.setState({ [event.target.name]: event.target.value })
    }

    signUp = () => {

        this.setState({ register: true });
        this.pushRequest();

    }
    signedUp = () => {
        if (this.state.requestResponse === "User " + this.state.username + " succesfully added.") {
            this.setState({ register: false });
            this.handleLogin();
        }
    }

    logOut = () => {
        this.setState({ loggedIn: false });
    }

    handleSubmit = (event) => {
        console.log('A user name was submitted: ' + this.state.userName);
        console.log('A password was submitted: ' + this.state.userPassword);
        event.preventDefault();
    }

    handleLogin = (event) => {
        console.log('A user name was logged: ' + this.state.enteredUserName);
        console.log('A password was logged: ' + this.state.enteredUserPassword);
        event.preventDefault();

    }

    // showThings = () => {
    //     if(this.state.)
    // }

    render() {
        return (
            <div className="body">
                    <form onSubmit={this.handleSubmit} className="form-inline">
                        <div className="container">
                            <div className="row">
                                <div className="col-12">
                                    <label>
                                        <h1>WOMBO COMBO SHOMBO!!!</h1>
                                    </label>
                                </div>
                            </div>
                            <br /><br /><br />
                            <div className="row">
                                <div className="col-6">
                                    <label>
                                        <h4>Sign Up</h4>
                                    </label>
                                </div>
                                <div className="col-6">
                                    <label>
                                        <h4>Log In</h4>
                                    </label>
                                </div>
                            </div>
                            <br />
                            <div className="row">
                                <div className="col-6">
                                    <label>
                                        <input type="text" name='userName' target='one' className="form-control inputArea" onChange={this.setStates} userName={this.state.userName} id="userName" placeholder="Username *"></input>
                                    </label>
                                </div>
                                <div className="col-6">
                                    <label>
                                        <input type="text" name='enteredUserName' target='two' className="form-control inputArea" onChange={this.setStates} enteredUserName={this.state.enteredUserName} id="enteredUserName" placeholder="enteredUsername *"></input>
                                    </label>
                                </div>
                            </div>
                            <br />
                            <div className="row">
                                <div className="col-6">
                                    <label>
                                        <input type="text" name='userPassword' target='three' className="form-control inputArea" onChange={this.setStates} userName={this.state.userPassword} id="userPassword" placeholder="Password *"></input>
                                    </label>
                                </div>
                                <div className="col-6">
                                    <label>
                                        <input type="text" name='enteredUserPassword' target='four' className="form-control inputArea" onChange={this.setStates} enteredUserPassword={this.state.enteredUserPassword} id="enteredUserPassword" placeholder="enteredUserPassword *"></input>
                                    </label>
                                </div>
                            </div>
                            <br />
                            <div className="row">
                                <div className="col-6">
                                    <label>
                                        <input type="submit" value="Submit" onClick={this.signUp} />
                                    </label>
                                </div>
                                <div className="col-6">
                                    <label>
                                        <input type="submit" value="Submit" onClick={this.signedUp} />
                                    </label>
                                </div>
                            </div>
                        </div>
                        
                    </form>
                    <input type="submit" value="Submit" />
                <a>{this.state.requestResponse}</a>
            </div>
        );
    }


}
export default User;
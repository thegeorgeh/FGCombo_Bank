import React, { Component } from 'react';
import UsersListMake from './UsersListMake';
import { NavLink } from 'react-router-dom';
import axios from 'axios';
import './App.css'

// var i = 0;
class UserList extends Component {
  constructor() {
    super();
    this.state = {
      data: "hello",
      users: []
    }
  }

  getUsers = () => {
    axios.get('/getAllUsers').then(r => { this.setState({ users: r.data }) });
  }

  checkUsers = () => {
      if(this.getAllUsers.userName)
  }



  render() {
    //let users = this.state.users.map(g => <UsersListMake userId={g.userId} userName={g.userName} imageUrl={g.imageUrl} releaseYear={g.releaseYear} />)
    return (
      <div>
        <div className="button_container">
          <div className="row">
            <div className="col-12">
            {this.getUsers()}

            </div>
          </div>





              


        </div>
        {/* {this.getUsers()}
        <h3><b>{users[this.state.users.length - 1]}</b></h3> */}
      </div>
    );
  }
}
export default UserList;
import React, { Component } from 'react';
// import logo from './logo.svg';
import './App.css';
// import HeadText from './HeadText';
// import Login from './Login';
// import LoginPage from './LoginPage';
// import DisplayUser from './DisplayUser';
// import NotesForChar from './NotesForChar';
import axios from 'axios';

export default class LFunction extends Component {
  constructor(props){
    super(props);
    this.state ={
      loggedIn: false,
      currentUser:"", 
      users:[], 
      accepted:false, 
      status:"Log In", 
      loginselected:false
    }
  } 

    makeTrue=()=>{ 
        this.setState({loggedin:true});
    }  
    makeFalse=()=>{ 
        this.setState({loggedin:false})
    }

    acceptLogin = (accept)=>{ 
      this.setState({accepted:accept});
    }

    getRequest = () => {
      axios.get('/getAllUsers').then(r => { this.setState({ users: r.data }) }); 
      
    } 

    makeLoggedIn = ()=>{ 
      this.setState({loggedin:true});
    } 

    setStatus=()=>{ 
      this.props.setStatus(this.state.status)
    }
    check = (enteredusername, enteredpassword)=>{ 
        this.getRequest(); 
        //let users = this.state.users.map(u => <Users userID={u.userID} userName={u.userName} userPassword={u.userPassword}/>)
        
        for(let i=0;i<this.state.users.length;i++){  
          console.log("user name"+this.state.users[i].userName+" entered"+enteredusername);
          if(this.state.users[i].userName===enteredusername&&this.state.users[i].userPassword===enteredpassword) {
              this.makeTrue(); 
              console.log("log in passed")
              this.acceptLogin(); 
              this.makeLoggedIn();
              this.setState({currentUser:enteredusername}); 
              this.setState({status:`Logged in as ${this.state.currentUser}`})
          } 
          else{ 
              
            console.log("log in failed");
          }
        }
    }
  }
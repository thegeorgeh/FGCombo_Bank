import React, { Component } from 'react';
import PlayerDisplay from './PlayerDisplay.js';
import axios from 'axios';

class DisplayGamePlayerCombos extends Component {
    constructor(props) {
        super(props);
        this.state = {
          players: []
    
        }
      }
    
      getRequest = () => {
        // console.log("doing getuserAlgRequest");
        // console.log(this.props.currentUserID + " User id succesfully passed");
        // console.log(this.props.algID + " alg");
        axios.get(`/getGamePlayers/${this.props.gameID}`).then(r => { this.setState({ players: r.data }) });
    
      }
      render() {
        let players = this.state.players.map(p => <PlayerDisplay playerName={p.playerName} playerID={p.playerID}/>);
        return (
          <div>
            <ul>
              {players}
            </ul> 
            
            <button onClick={this.getRequest}>Click to show players</button>
            {/* {this.getRequest()} */}
          </div>
    
        );
    
      }
    
    }

export default DisplayGamePlayerCombos;
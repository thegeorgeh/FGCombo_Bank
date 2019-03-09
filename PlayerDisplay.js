import React, { Component } from 'react';
import GetPlayerCombos from './GetPlayerCombos';
class PlayerDisplay extends Component {


  render() {

    return (
      <div>

        <li>
          <a>{this.props.playerID}{this.props.playerName}<GetPlayerCombos playerID={this.props.playerID}/></a>
        </li>
        

      </div>
    );
    
  }



}

export default PlayerDisplay;
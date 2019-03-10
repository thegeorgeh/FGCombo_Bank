import React, {Component} from 'react';

class LoopFunction extends Component{
    constructor(props){ 
        super(props);
        this.state = {
            games: []
        }
    }  

    loopEntityNames = () => {
        for(let i = 0; i < this.props.gameId.length; i++) {
           
            {this.state.games.gameName}

            // for(let j = 0; j < this.props.playerName.length; j++) {
                
            //     this.props.playerName[j];

            //     for(let k = 0; k < this.props.comboName.length; k++) {
            //         this.props.comboName[i];
            //     }
            // }
        }
    }

}
export default LoopFunction;
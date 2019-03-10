import React, {Component} from 'react'; 

class GamesListMake extends Component{
    constructor(props){ 
        super(props);
    }  

    render(){ 
        return( 
            <div> 
                <li> 
                    <a>{this.props.userId} {this.props.userName} {this.props.gameId} {this.props.gameName} {this.props.playerId}{this.props.playerName} {this.props.comboName}{this.props.comboInput}</a>
                    <a></a>
                </li>
            </div> 
        );
    }

}
export default GamesListMake;
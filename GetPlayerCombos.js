import React, { Component } from 'react';
import DisplayPlayerCombos from './DisplayPlayerCombos';
import axios from 'axios';

class GetPlayerCombos extends Component {
    constructor(props) {
        super(props);
        this.state = {
          combos: []
    
        }
      }
    
      getRequest = () => {
        // console.log("doing getuserAlgRequest");
        // console.log(this.props.currentUserID + " User id succesfully passed");
        // console.log(this.props.algID + " alg");
        axios.get(`/getPlayerCombos/${this.props.playerID}`).then(r => { this.setState({ combos: r.data }) });
    
      }
      render() {
        let combos = this.state.combos.map(c => <DisplayPlayerCombos comboName={c.comboName} comboInput={c.comboInput} comboID={c.comboID}/>);
        return (
          <div>
            <ul>
              {combos}
            </ul> 
            
            <button onClick={this.getRequest}>Click to show players</button>
            {/* {this.getRequest()} */}
          </div>
    
        );
    
      }
    
    }

export default GetPlayerCombos;
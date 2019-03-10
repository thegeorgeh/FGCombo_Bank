import React, { Component } from 'react';
import DeleteCombo from './DeleteCombo'; 
import UpdateCombo from './UpdateCombo';
class DisplayPlayerCombos extends Component {


  render() {

    return (
      <div>

        <li>
          <a>input {this.props.comboInput} name {this.props.comboName} 
          <a> 
            <DeleteCombo comboID={this.props.comboID}/>
          </a> 
          <a> 
            <UpdateCombo comboID={this.props.comboID}/>
          </a>
          </a>
        </li>
        

      </div>
    );
    
  }



}

export default DisplayPlayerCombos;
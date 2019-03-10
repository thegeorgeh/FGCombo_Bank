import React, { Component } from 'react';
import './App.css'; 

import axios from 'axios';


class UpdateCombo extends Component { 
  constructor(props){ 
    super(props); 
    this.state = { 
    
       show:false, 
       newComboName:"", 
       newComboInput:"", 
   
      
    }
  } 

    updateRequest = ()=>{  
   
        axios.put(`/updateCombo/${this.props.comboID}/${this.state.newComboName}/${this.state.newComboInput}`) 
        this.hideForm();
      }  
    showForm=()=>{ 
        this.setState({show:true});
    }  
    hideForm=()=>{ 
        this.setState({show:false})
    }

    setStates = (event)=>{ 
        this.setState({[event.target.name]:event.target.value});
      } 
  
      handleSubmit=(event) =>{ 
        event.preventDefault();
      }

    render() {   
      if(!this.state.show){  
          
          return( 
          
          <button onClick={this.showForm}>Update</button>
          );
      }
      else{
        return ( 
            <form onSubmit={this.handleSubmit} className="form-inline">
                <label className="required">* required </label>     
                    <label>
                    <input type="text" name='newComboName' target='one' className="form-control inputArea" onChange={this.setStates} newComboName={this.state.newComboName} id="newComboName" placeholder="New Name *"></input> 
                    <input type="text" name='newComboInput' target='two' className="form-control inputArea" onChange={this.setStates} newComboInput={this.state.newComboInput} id="newComboInput" placeholder="New Input *"></input> 
                  
                    {/* <input>add old password check here</input> */}
                    </label>          
                <input type="submit" value="Submit" onClick={this.updateRequest}/> 
            </form>         
        );   
      }
    }   
  }
  
  export default UpdateCombo;
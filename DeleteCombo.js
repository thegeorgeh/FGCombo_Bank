import React, { Component } from 'react';

import axios from 'axios';
import './App.css';

class DeleteCombo extends Component {
    constructor(props) {
        super(props);
        this.state = {
          
        }
    }



    deleteRequest = () => {
        axios.delete(`/removeCombo/${this.props.comboID}`);
    }

  

  

    render() {
        return (
            <div>
              
         
                <label>
                    <button type="submit" value="Submit" onClick={this.deleteRequest}>Delete</button>
                </label>
            </div>
               


        );
    }
}

export default DeleteCombo;
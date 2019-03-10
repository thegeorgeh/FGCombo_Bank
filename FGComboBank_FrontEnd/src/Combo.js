import React, { Component } from 'react';
import axios from 'axios';
import Routing from './Routing';

class Combo extends Component {
    constructor(props) {
        super(props);
        this.state = {
            comboName: '',
            comboInput: '',
            combo: ''
        }
    }


    render() {
        return (
            <div>
                <Routing>
                    {/* <NavLink id="home" to="/">Search By All</NavLink>
                    <NavLink id="player"
                    <Route exact path="/" component={Combo}></Route> */}
                </Routing>

            </div>
        );
    }
}

export default Combo;
import React, { Component } from 'react';
import GamesListMake from './GamesListMake';
import { NavLink } from 'react-router-dom';
import axios from 'axios';
import './App.css'

// var i = 0;
class GameList extends Component {
  constructor() {
    super();
    this.state = {
      data: "hello",
      games: []
    }
  }

  getGames = () => {
    axios.get('/getAllGames').then(r => { this.setState({ games: r.data }) });
  }



  render() {
    let games = this.state.games.map(g => <GamesListMake gameId={g.gameId} gameName={g.gameName} imageUrl={g.imageUrl} releaseYear={g.releaseYear} />)
    return (
      <div>
        <div className="button_container">
          <div className="row">
            <div className="col-6">
              {this.getGames()}
              <NavLink className="nav-link" to="/Tekken7.js"><h3><b>{games[this.state.games.length - 3]}</b></h3></NavLink>

            </div>
          </div>
          <div className="row">
            <div className="col-6">
              {this.getGames()}
              <NavLink className="nav-link" to="/DragonBallFighterZ.js"><h3><b>{games[this.state.games.length - 2]}</b></h3></NavLink>
            </div>
          </div>








        </div>
        {/* {this.getGames()}
        <h3><b>{games[this.state.games.length - 1]}</b></h3> */}
      </div>
    );
  }
}
export default GameList;




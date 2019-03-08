(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{13:function(e,t,a){},26:function(e,t,a){e.exports=a(55)},32:function(e,t,a){},55:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),m=a(23),r=a.n(m),c=(a(32),a(3)),s=a(7),o=a(5),i=a(4),u=a(6),p=a(12),b=a(2),d=a.n(b),E=(a(13),a(56)),h=a(57),N=a(25),y=function(e){function t(e){return Object(c.a)(this,t),Object(o.a)(this,Object(i.a)(t).call(this,e))}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement("li",null,l.a.createElement("a",null,this.props.userId," ",this.props.userName," ",this.props.gameId," ",this.props.gameName," ",this.props.playerId,this.props.playerName," ",this.props.comboName,this.props.comboInput),l.a.createElement("a",null)))}}]),t}(n.Component),g=(n.Component,function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(i.a)(t).call(this,e))).isUserChecked=function(){d.a.get("/getAllUsers").then(function(e){a.setState({users:e.data})}),d.a.get("/getAllGames").then(function(e){a.setState({games:e.data})}),d.a.get("/getAllPlayers").then(function(e){a.setState({players:e.data})}),d.a.get("/getAllCombos").then(function(e){a.setState({combos:e.data})})},a.isComboChecked=function(){},a.state={users:[],games:[],players:[],combos:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){for(var e,t=this,a=this.state.combos.map(function(e){return l.a.createElement(y,{comboName:e.comboName})}),n=this.state.players.map(function(e){return l.a.createElement(y,{playerName:e.playerName})}),m=this.state.games.map(function(e){return l.a.createElement(y,{gameName:e.gameName})}),r=this.state.games.map(function(e){return l.a.createElement(y,{gameID:e.gameID})}),c=function(c){for(var s=function(s){for(var o=function(o){e=t.state.users.map(function(e){return l.a.createElement(y,{gameID:r[c],gameName:m[c],playerName:n[s],comboName:a[o]})})},i=0;i<t.state.combos.length;i++)o(i)},o=0;o<t.state.players.length;o++)s(o)},s=0;s<this.state.games.length;s++)c(s);return l.a.createElement("div",{className:"body"},l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",null,"Combo Viewer")))),l.a.createElement("br",null),l.a.createElement("button",{onClick:this.isUserChecked},"get all games"),l.a.createElement("p",null,e)))}}]),t}(n.Component)),v=(n.Component,function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(i.a)(t).call(this,e))).pushRequest=function(){document.getElementById("nameGame").value,document.getElementById("nameCharacter").value,document.getElementById("nameCombo").value,document.getElementById("inputCombo").value;d.a.post("/addGame/".concat(a.state.gameName))},a.setStates=function(e){a.setState(Object(p.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A game name was submitted: "+a.state.gameName),console.log("A player name was submitted: "+a.state.playerName),console.log("A combo name was submitted: "+a.state.comboName),console.log("A combo was submitted: "+a.state.comboInput),e.preventDefault()},a.state={gameName:"",playerName:"",comboName:"",comboInput:"",combo:"",games:[],players:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"body"},l.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",{id:"TekkenFont"},"Combo Creator")))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"gameName",target:"one",className:"form-control inputArea",onChange:this.setStates,gameName:this.state.gameName,id:"nameGame",placeholder:"Game *"}))),l.a.createElement("br",null),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerName",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerName,id:"nameCharacter",placeholder:"Character *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"comboName",target:"one",className:"form-control inputArea",onChange:this.setStates,comboName:this.state.combo,id:"nameCombo",placeholder:"Combo Name *"}))),l.a.createElement("br",null),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"comboInput",target:"one",className:"form-control inputArea",onChange:this.setStates,comboInput:this.state.combo,id:"inputCombo",placeholder:"Combo Input *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))))))}}]),t}(n.Component));n.Component,n.Component;n.Component;var f=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(i.a)(t).call(this,e))).pushRequest=function(){document.getElementById("namePlayer").value;d.a.post("/addPlayer/".concat(a.state.gameID,"/").concat(a.state.playerName))},a.editRequest=function(){d.a.put("/updatePlayer/".concat(a.state.playerID,"/").concat(a.state.playerName))},a.deleteRequest=function(){d.a.delete("/removePlayer/".concat(a.state.playerID))},a.setStates=function(e){a.setState(Object(p.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A player name was submitted: "+a.state.playerName),e.preventDefault()},a.state={gameID:null,playerName:"",playerID:null,players:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",null,"Combo Creator")))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"gameID",target:"one",className:"form-control inputArea",onChange:this.setStates,gameID:this.state.gameID,id:"gameID",placeholder:"Game ID *"}))),l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerName",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerName,id:"namePlayer",placeholder:"Player *"}))),l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerID",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerID,id:"playerID",placeholder:"Player ID *"}))),l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerName",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerName,id:"namePlayer",placeholder:"New Player Name *"}))),l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.editRequest})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-4"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerID",target:"one",className:"form-control inputArea",onChange:this.setStates,playerID:this.state.playerID,id:"playerID",placeholder:"Player ID *"}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.deleteRequest}))))))}}]),t}(n.Component),C=function(e){function t(){return Object(c.a)(this,t),Object(o.a)(this,Object(i.a)(t).apply(this,arguments))}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(f,null))}}]),t}(n.Component);r.a.render(l.a.createElement(C,null),document.getElementById("root"))}},[[26,1,2]]]);
//# sourceMappingURL=main.214ac263.chunk.js.map
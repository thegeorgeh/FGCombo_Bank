(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{12:function(e,t,a){},26:function(e,t,a){e.exports=a(55)},32:function(e,t,a){},55:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),o=a(23),m=a.n(o),r=(a(32),a(3)),c=a(8),s=a(5),u=a(4),i=a(6),p=a(14),b=a(7),h=a.n(b),d=(a(12),a(56)),E=a(57),g=a(25),N=function(e){function t(e){return Object(r.a)(this,t),Object(s.a)(this,Object(u.a)(t).call(this,e))}return Object(i.a)(t,e),Object(c.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement("li",null,l.a.createElement("a",null,this.props.userId," ",this.props.userName," ",this.props.gameId," ",this.props.gameName," ",this.props.playerId,this.props.playerName," ",this.props.comboName,this.props.comboInput),l.a.createElement("a",null)))}}]),t}(n.Component),f=(n.Component,function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(s.a)(this,Object(u.a)(t).call(this,e))).isUserChecked=function(){h.a.get("/getAllUsers").then(function(e){a.setState({users:e.data})}),h.a.get("/getAllGames").then(function(e){a.setState({games:e.data})}),h.a.get("/getAllPlayers").then(function(e){a.setState({players:e.data})}),h.a.get("/getAllCombos").then(function(e){a.setState({combos:e.data})})},a.isComboChecked=function(){},a.state={users:[],games:[],players:[],combos:[]},a}return Object(i.a)(t,e),Object(c.a)(t,[{key:"render",value:function(){for(var e,t=this,a=this.state.combos.map(function(e){return l.a.createElement(N,{comboName:e.comboName})}),n=this.state.players.map(function(e){return l.a.createElement(N,{playerName:e.playerName})}),o=this.state.games.map(function(e){return l.a.createElement(N,{gameName:e.gameName})}),m=this.state.users.map(function(e){return l.a.createElement(N,{userName:e.userName})}),r=function(r){for(var c=function(c){for(var s=function(s){e=t.state.users.map(function(e){return l.a.createElement(N,{userName:m[0],gameName:o[r],playerName:n[c],comboName:a[s]})})},u=0;u<t.state.combos.length;u++)s(u)},s=0;s<t.state.players.length;s++)c(s)},c=0;c<this.state.games.length;c++)r(c);return l.a.createElement("div",{className:"body"},l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",null,"Combo Viewer")))),l.a.createElement("br",null),l.a.createElement("button",{onClick:this.isUserChecked},"get all games"),l.a.createElement("p",null,e)))}}]),t}(n.Component)),v=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(s.a)(this,Object(u.a)(t).call(this,e))).logOut=function(){a.props.logOut()},a.state={username:"",password:""},a}return Object(i.a)(t,e),Object(c.a)(t,[{key:"render",value:function(){return l.a.createElement(d.a,null,l.a.createElement("div",null,l.a.createElement("div",{className:"header"},l.a.createElement(E.a,{className:"logo",to:"/"},"George's PLL Trainer: Welcome ",this.props.currentUsername),l.a.createElement("button",{onClick:this.logOut},"Logout"),l.a.createElement("div",{className:"header-right"},l.a.createElement(E.a,{to:"/"},"Hello"),l.a.createElement(E.a,{className:"logo",to:"/"},"George's PLL Trainer: Welcome ",this.props.currentUsername),l.a.createElement("button",{onClick:this.logOut},"Logout"),l.a.createElement(g.a,{exact:!0,path:"/",component:y}),l.a.createElement(g.a,{path:"/ComboViewer",component:f})))))}}]),t}(n.Component),y=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(s.a)(this,Object(u.a)(t).call(this,e))).pushRequest=function(){document.getElementById("nameGame").value,document.getElementById("nameCharacter").value,document.getElementById("nameCombo").value,document.getElementById("inputCombo").value;h.a.post("/addGame/".concat(a.state.userID,"/").concat(a.state.gameName)),h.a.post("/addPlayer/".concat(a.state.gameID,"/").concat(a.state.playerName)),h.a.post("/addCombo/".concat(a.state.playerID,"/").concat(a.state.comboName,"/").concat(a.state.comboInput))},a.setStates=function(e){a.setState(Object(p.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A game name was submitted: "+a.state.gameName),console.log("A player name was submitted: "+a.state.playerName),console.log("A combo name was submitted: "+a.state.comboName),console.log("A combo was submitted: "+a.state.comboInput),e.preventDefault()},a.state={gameName:"",playerName:"",comboName:"",comboInput:"",combo:""},a}return Object(i.a)(t,e),Object(c.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"body"},l.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",{id:"TekkenFont"},"Combo Creator")))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"gameName",target:"one",className:"form-control inputArea",onChange:this.setStates,gameName:this.state.gameName,id:"nameGame",placeholder:"Game *"}))),l.a.createElement("br",null),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerName",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerName,id:"nameCharacter",placeholder:"Character *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"comboName",target:"one",className:"form-control inputArea",onChange:this.setStates,comboName:this.state.combo,id:"nameCombo",placeholder:"Combo Name *"}))),l.a.createElement("br",null),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"comboInput",target:"one",className:"form-control inputArea",onChange:this.setStates,comboInput:this.state.combo,id:"inputCombo",placeholder:"Combo Input *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))))))}}]),t}(n.Component);n.Component,n.Component;var C=function(e){function t(){return Object(r.a)(this,t),Object(s.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(i.a)(t,e),Object(c.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(v,null))}}]),t}(n.Component);m.a.render(l.a.createElement(C,null),document.getElementById("root"))}},[[26,1,2]]]);
//# sourceMappingURL=main.ba5435fe.chunk.js.map
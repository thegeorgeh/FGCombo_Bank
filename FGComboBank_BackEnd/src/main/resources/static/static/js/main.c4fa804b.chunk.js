(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{12:function(e,t,a){},26:function(e,t,a){e.exports=a(55)},32:function(e,t,a){},55:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),r=a(23),s=a.n(r),c=(a(32),a(3)),m=a(7),o=a(5),u=a(4),i=a(6),d=a(14),p=a(8),b=a.n(p),E=(a(12),function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(u.a)(t).call(this,e))).pushRequest=function(){document.getElementById("nameGame").value,document.getElementById("nameCharacter").value,document.getElementById("nameCombo").value,document.getElementById("inputCombo").value;b.a.post("/addGame/".concat(a.state.userID,"/").concat(a.state.gameName)),b.a.post("/addPlayer/".concat(a.state.gameID,"/").concat(a.state.playerName)),b.a.post("/addCombo/".concat(a.state.playerID,"/").concat(a.state.comboName,"/").concat(a.state.comboInput))},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A game name was submitted: "+a.state.gameName),console.log("A player name was submitted: "+a.state.playerName),console.log("A combo name was submitted: "+a.state.comboName),console.log("A combo was submitted: "+a.state.comboInput),e.preventDefault()},a.state={gameName:"",playerName:"",comboName:"",comboInput:"",combo:""},a}return Object(i.a)(t,e),Object(m.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"body"},l.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",{id:"TekkenFont"},"Combo Creator")))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"gameName",target:"one",className:"form-control inputArea",onChange:this.setStates,gameName:this.state.gameName,id:"nameGame",placeholder:"Game *"}))),l.a.createElement("br",null),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"playerName",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerName,id:"nameCharacter",placeholder:"Character *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"comboName",target:"one",className:"form-control inputArea",onChange:this.setStates,comboName:this.state.combo,id:"nameCombo",placeholder:"Combo Name *"}))),l.a.createElement("br",null),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"comboInput",target:"one",className:"form-control inputArea",onChange:this.setStates,comboInput:this.state.combo,id:"inputCombo",placeholder:"Combo Input *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))))))}}]),t}(n.Component)),h=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(u.a)(t).call(this,e))).check=function(e){e.preventDefault(),a.getRequest();for(var t=0;t<a.state.users.length;t++)if(a.state.users[t].userName===a.state.enteredUserName&&a.state.users[t].userPassword===a.state.enteredUserPassword){a.setState({userid:a.state.users[t].userID}),a.setState({loginAccepted:!0}),a.props.setCurrentUser(a.state.userID,a.state.enteredUserName,a.state.loginAccepted);break}},a.getRequest=function(){b.a.get("/getAllUsers").then(function(e){a.setState({users:e.data})})},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.signUp=function(){a.setState({register:!0}),b.a.post("/addUser/".concat(a.state.userName,"/").concat(a.state.userPassword))},a.signedUp=function(){a.setState({register:!1}),a.handleLogin()},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A user name was submitted: "+a.state.userName),console.log("A password was submitted: "+a.state.userPassword),e.preventDefault()},a.handleLogin=function(e){console.log("A user name was logged: "+a.state.enteredUserName),console.log("A password was logged: "+a.state.enteredUserPassword),e.preventDefault()},a.state={userName:"",userPassword:"",enteredUserName:"",enteredUserPassword:"",users:[],userid:null,loginAccepted:!1,register:!1},a}return Object(i.a)(t,e),Object(m.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"body"},l.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",null,"WOMBO COMBO SHOMBO!!!")))),l.a.createElement("br",null),l.a.createElement("br",null),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("h4",null,"Sign Up"))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("h4",null,"Log In")))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"userName",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userName,id:"userName",placeholder:"Username *"}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"eneteredUserName",target:"one",className:"form-control inputArea",onChange:this.setStates,enteredUserName:this.state.enteredUserName,id:"eneteredUserName",placeholder:"enteredUsername *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"userPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userPassword,id:"userPassword",placeholder:"Password *"}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"enteredUserPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,enteredUserName:this.state.enteredUserPassword,id:"enteredUserPassword",placeholder:"enteredUserPassword *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.signUp}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.signedUp})))))))}}]),t}(n.Component),N=a(56),g=a(25),v=a(57),f=function(e){function t(e){return Object(c.a)(this,t),Object(o.a)(this,Object(u.a)(t).call(this,e))}return Object(i.a)(t,e),Object(m.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement("li",null,l.a.createElement("a",null,this.props.gameId," ",this.props.gameName," ",this.props.playerId,this.props.playerName," ",this.props.comboName,this.props.comboInput),l.a.createElement("a",null)))}}]),t}(n.Component),C=(n.Component,function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(u.a)(t).call(this,e))).isGameChecked=function(){b.a.get("/getAllGames").then(function(e){a.setState({games:e.data})}),b.a.get("/getAllPlayers").then(function(e){a.setState({players:e.data})}),b.a.get("/getAllCombos").then(function(e){a.setState({combos:e.data})})},a.isComboChecked=function(){},a.state={games:[],players:[],combos:[]},a}return Object(i.a)(t,e),Object(m.a)(t,[{key:"render",value:function(){var e=this.state.combos.map(function(e){return l.a.createElement(f,{comboName:e.comboName})}),t=this.state.players.map(function(e){return l.a.createElement(f,{playerName:e.playerName})}),a=this.state.games[0].map(function(a){return l.a.createElement(f,{gameName:a.gameName,playerName:t,comboName:e})});return l.a.createElement("div",{className:"body"},l.a.createElement("div",{className:"container"},l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",null,"Combo Viewer")))),l.a.createElement("br",null),l.a.createElement("button",{onClick:this.isGameChecked},"get all games"),l.a.createElement("p",null,a)))}}]),t}(n.Component));n.Component;var w=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(o.a)(this,Object(u.a)(t).call(this,e))).logOut=function(){a.props.logOut()},a.state={username:"",password:""},a}return Object(i.a)(t,e),Object(m.a)(t,[{key:"render",value:function(){return l.a.createElement(N.a,null,l.a.createElement("div",null,l.a.createElement("div",{className:"header"},l.a.createElement(v.a,{className:"logo",to:"/"},"George's PLL Trainer: Welcome ",this.props.currentUsername),l.a.createElement("button",{onClick:this.logOut},"Logout"),l.a.createElement("div",{className:"header-right"},l.a.createElement(v.a,{to:"/"},"Users"),l.a.createElement(v.a,{to:"/ComboCreator"},"Hello"),l.a.createElement(v.a,{to:"/ComboViewer"},"Die Cunt"),l.a.createElement(g.a,{exact:!0,path:"/",component:h}),l.a.createElement(g.a,{path:"/ComboCreator",component:E}),l.a.createElement(g.a,{path:"/ComboViewer",component:C})))))}}]),t}(n.Component),y=function(e){function t(){return Object(c.a)(this,t),Object(o.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(i.a)(t,e),Object(m.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(w,null))}}]),t}(n.Component);s.a.render(l.a.createElement(y,null),document.getElementById("root"))}},[[26,1,2]]]);
//# sourceMappingURL=main.c4fa804b.chunk.js.map
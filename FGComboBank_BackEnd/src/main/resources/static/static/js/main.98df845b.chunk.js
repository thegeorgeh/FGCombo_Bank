(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{13:function(e,t,a){},26:function(e,t,a){e.exports=a(55)},32:function(e,t,a){},55:function(e,t,a){"use strict";a.r(t);var n=a(0),s=a.n(n),l=a(23),r=a.n(l),c=(a(32),a(3)),o=a(8),m=a(5),u=a(4),i=a(6),d=a(12),p=a(7),b=a.n(p),g=(a(13),function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(m.a)(this,Object(u.a)(t).call(this,e))).pushRequest=function(){document.getElementById("nameGame").value,document.getElementById("nameCharacter").value,document.getElementById("nameCombo").value,document.getElementById("inputCombo").value;b.a.post("/addGame/".concat(a.state.gameName)),b.a.post("/addPlayer/".concat(a.state.playerName)),b.a.post("/addCombo/".concat(a.state.comboName,"/").concat(a.state.comboInput))},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A game name was submitted: "+a.state.gameName),console.log("A player name was submitted: "+a.state.playerName),console.log("A combo name was submitted: "+a.state.comboName),console.log("A combo was submitted: "+a.state.comboInput),e.preventDefault()},a.state={gameName:"",playerName:"",comboName:"",comboInput:"",combo:""},a}return Object(i.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){return s.a.createElement("div",null,s.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},s.a.createElement("div",{className:"container"},s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement("label",null,s.a.createElement("h1",null,"Combo Creator")))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"gameName",target:"one",className:"form-control inputArea",onChange:this.setStates,gameName:this.state.gameName,id:"nameGame",placeholder:"Game *"})))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"playerName",target:"one",className:"form-control inputArea",onChange:this.setStates,playerName:this.state.playerName,id:"nameCharacter",placeholder:"Character *"})))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"comboName",target:"one",className:"form-control inputArea",onChange:this.setStates,comboName:this.state.combo,id:"nameCombo",placeholder:"Combo Name *"})))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"comboInput",target:"one",className:"form-control inputArea",onChange:this.setStates,comboInput:this.state.combo,id:"inputCombo",placeholder:"Combo Input *"})))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement("label",null,s.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))))))}}]),t}(n.Component)),E=a(56),h=a(57),N=a(25),f=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(m.a)(this,Object(u.a)(t).call(this,e))).makeTrue=function(){a.setState({loggedin:!0})},a.makeFalse=function(){a.setState({loggedin:!1})},a.acceptLogin=function(e){a.setState({accepted:e})},a.getRequest=function(){b.a.get("/getAllUsers").then(function(e){a.setState({users:e.data})})},a.makeLoggedIn=function(){a.setState({loggedin:!0})},a.setStatus=function(){a.props.setStatus(a.state.status)},a.check=function(e,t){a.getRequest();for(var n=0;n<a.state.users.length;n++)console.log("user name"+a.state.users[n].userName+" entered"+e),a.state.users[n].userName===e&&a.state.users[n].userPassword===t?(a.makeTrue(),console.log("log in passed"),a.acceptLogin(),a.makeLoggedIn(),a.setState({currentUser:e}),a.setState({status:"Logged in as ".concat(a.state.currentUser)})):console.log("log in failed")},a.state={loggedIn:!1,currentUser:"",users:[],accepted:!1,status:"Log In",loginselected:!1},a}return Object(i.a)(t,e),t}(n.Component),v=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(m.a)(this,Object(u.a)(t).call(this,e))).pushRequest=function(){b.a.post("/addUser/".concat(a.state.userName,"/").concat(a.state.userPassword))},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A user name was submitted: "+a.state.userName),console.log("A password was submitted: "+a.state.userPassword),e.preventDefault()},a.check=function(e){e.preventDefault(),a.getRequest();for(var t=0;t<a.state.users.length;t++)if(a.state.users[t].userName===a.state.enteredUsername&&a.state.users[t].userPassword===a.state.enteredUserPassword){a.setState({userId:a.state.users[t].userId}),a.setState({loginAccepted:!0}),a.props.setCurrentUser(a.state.userId,a.state.enteredUserName,a.state.loginAccepted);break}},a.getRequest=function(){b.a.get("/getAllUsers").then(function(e){a.setState({users:e.data})})},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.signUp=function(){a.pushRequest(),a.setState({register:!0})},a.signedUp=function(){a.setState({register:!1}),console.log("A username logged in "+a.state.enteredUserName),console.log("A password logged in "+a.state.enteredUserPassword)},a.state={userName:"",userPassword:"",enteredUsername:"",enteredUserPassword:"",users:[],userId:null,loginAccepted:!1,register:!1},a}return Object(i.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){return s.a.createElement("div",{className:"body"},s.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},s.a.createElement("div",{className:"container"},s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-12"},s.a.createElement(E.a,null,s.a.createElement("label",null,s.a.createElement(h.a,{id:"home",to:"/"},s.a.createElement("h1",null,"WOMBO COMBO SHMOMBO!!!")),s.a.createElement(N.a,{exact:!0,path:"/",component:t}))))),s.a.createElement("br",null),s.a.createElement("br",null),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("h4",null,"Sign Up"))),s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("h4",null,"Log In")))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"userName",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userName,id:"userName",placeholder:"Username *"}))),s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"enteredUserName",target:"one",className:"form-control inputArea",onChange:this.setStates,enteredUserName:this.state.enteredUserName,id:"enteredUserName",placeholder:"enteredUsername *"})))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"userPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userPassword,id:"userPassword",placeholder:"Password *"}))),s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("input",{type:"text",name:"enteredUserPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,enteredUserPassword:this.state.enteredUserPassword,id:"enteredUserPassword",placeholder:"enteredUserPassword *"})))),s.a.createElement("br",null),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement("input",{type:"submit",value:"Submit",onClick:this.signUp}))),s.a.createElement("div",{className:"col-6"},s.a.createElement("label",null,s.a.createElement(E.a,null,s.a.createElement("div",null,s.a.createElement(h.a,{to:"/"}," ",s.a.createElement("input",{type:"submit",value:"Submit",onClick:this.signedUp})),s.a.createElement(N.a,{exact:!0,path:"/ComboCreator",Component:g})))))))))}}]),t}(n.Component),w=(n.Component,n.Component,n.Component,n.Component,function(e){function t(){return Object(c.a)(this,t),Object(m.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(i.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){return s.a.createElement("div",null,s.a.createElement(v,null))}}]),t}(n.Component));r.a.render(s.a.createElement(w,null),document.getElementById("root"))}},[[26,1,2]]]);
//# sourceMappingURL=main.98df845b.chunk.js.map
(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{16:function(e,t,a){},18:function(e,t,a){e.exports=a(44)},24:function(e,t,a){},44:function(e,t,a){"use strict";a.r(t);var s=a(0),n=a.n(s),r=a(17),l=a.n(r),c=(a(24),a(2)),o=a(3),m=a(5),u=a(4),i=a(6),d=a(8),p=a(9),E=a.n(p),b=(a(16),function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(m.a)(this,Object(u.a)(t).call(this,e))).check=function(e){e.preventDefault(),a.getRequest();for(var t=0;t<a.state.users.length;t++)if(a.state.users[t].userName===a.state.enteredUserName&&a.state.users[t].userPassword===a.state.enteredUserPassword){a.setState({userid:a.state.users[t].userID}),a.setState({loginAccepted:!0}),a.props.setCurrentUser(a.state.userID,a.state.enteredUserName,a.state.loginAccepted);break}},a.getRequest=function(){E.a.get("/getAllUsers").then(function(e){a.setState({users:e.data})})},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.signUp=function(){a.setState({register:!0}),E.a.post("/addUser/".concat(a.state.userName,"/").concat(a.state.userPassword))},a.signedUp=function(){a.setState({register:!1}),a.handleLogin()},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A user name was submitted: "+a.state.userName),console.log("A password was submitted: "+a.state.userPassword),e.preventDefault()},a.handleLogin=function(e){console.log("A user name was logged: "+a.state.enteredUserName),console.log("A password was logged: "+a.state.enteredUserPassword),e.preventDefault()},a.state={userName:"",userPassword:"",enteredUserName:"",enteredUserPassword:"",users:[],userid:null,loginAccepted:!1,register:!1},a}return Object(i.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){return n.a.createElement("div",{className:"body"},n.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},n.a.createElement("div",{className:"container"},n.a.createElement("div",{className:"row"},n.a.createElement("div",{className:"col-12"},n.a.createElement("label",null,n.a.createElement("h1",null,"WOMBO COMBO SHOMBO!!!")))),n.a.createElement("br",null),n.a.createElement("br",null),n.a.createElement("br",null),n.a.createElement("div",{className:"row"},n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("h4",null,"Sign Up"))),n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("h4",null,"Log In")))),n.a.createElement("br",null),n.a.createElement("div",{className:"row"},n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("input",{type:"text",name:"userName",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userName,id:"userName",placeholder:"Username *"}))),n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("input",{type:"text",name:"eneteredUserName",target:"one",className:"form-control inputArea",onChange:this.setStates,enteredUserName:this.state.enteredUserName,id:"eneteredUserName",placeholder:"enteredUsername *"})))),n.a.createElement("br",null),n.a.createElement("div",{className:"row"},n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("input",{type:"text",name:"userPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userPassword,id:"userPassword",placeholder:"Password *"}))),n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("input",{type:"text",name:"enteredUserPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,enteredUserName:this.state.enteredUserPassword,id:"enteredUserPassword",placeholder:"enteredUserPassword *"})))),n.a.createElement("br",null),n.a.createElement("div",{className:"row"},n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("input",{type:"submit",value:"Submit",onClick:this.signUp}))),n.a.createElement("div",{className:"col-6"},n.a.createElement("label",null,n.a.createElement("input",{type:"submit",value:"Submit",onClick:this.signedUp})))))))}}]),t}(s.Component)),g=function(e){function t(){return Object(c.a)(this,t),Object(m.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(i.a)(t,e),Object(o.a)(t,[{key:"render",value:function(){return n.a.createElement("div",null,n.a.createElement(b,null))}}]),t}(s.Component);l.a.render(n.a.createElement(g,null),document.getElementById("root"))}},[[18,1,2]]]);
//# sourceMappingURL=main.8170c6cf.chunk.js.map
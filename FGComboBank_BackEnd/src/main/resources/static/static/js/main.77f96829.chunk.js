(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{10:function(e,t,a){},19:function(e,t,a){e.exports=a(45)},25:function(e,t,a){},45:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),r=a(18),s=a.n(r),c=(a(25),a(2)),u=a(3),m=a(6),o=a(4),i=a(5),d=a(8),E=a(7),p=a.n(E),b=(a(10),n.Component,a(9)),h=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(m.a)(this,Object(o.a)(t).call(this,e))).state={userName:"Matt",userPassword:"eggs"},a.updateState=function(e){var t=e.target.value,n=e.target.name;a.setState(Object(d.a)({},n,t))},a.handleLogin=function(e){e.preventDefault(),a.props.handleLogin(a.state.userName,a.state.userPassword)},a}return Object(i.a)(t,e),Object(u.a)(t,[{key:"render",value:function(){this.props.user;return l.a.createElement("div",{className:"loginBox"},l.a.createElement("form",{onSubmit:this.handleLogin},"userName: ",l.a.createElement("br",null),l.a.createElement("input",{type:"text",name:"userName",value:this.state.userName,onChange:this.updateState}),l.a.createElement("br",null),"userPassword: ",l.a.createElement("br",null),l.a.createElement("input",{type:"userPassword",name:"userPassword",value:this.state.userPassword,onChange:this.updateState}),l.a.createElement("br",null),l.a.createElement("input",{type:"submit",value:"Submit"})))}}]),t}(n.Component),N=(n.Component,function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(m.a)(this,Object(o.a)(t).call(this,e))).pushRequest=function(){p.a.post("/addUser/".concat(a.state.userName,"/").concat(a.state.userPassword))},a.setStates=function(e){a.setState(Object(d.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){console.log("A user name was submitted: "+a.state.userName),console.log("A password was submitted: "+a.state.userPassword),e.preventDefault()},a.state={userName:""},a}return Object(i.a)(t,e),Object(u.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"body"},l.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-12"},l.a.createElement("label",null,l.a.createElement("h1",null,"WOMBO COMBO SHOMBO!!!")))),l.a.createElement("br",null),l.a.createElement("br",null),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("h4",null,"Sign Up"))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("h4",null,"Log In")))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"userName",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userName,id:"userName",placeholder:"Username *"}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"userName",target:"one",className:"form-control inputArea",id:"userName",placeholder:"Username *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"userPassword",target:"one",className:"form-control inputArea",onChange:this.setStates,userName:this.state.userPassword,id:"userPassword",placeholder:"Password *"}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"text",name:"userPassword",target:"one",className:"form-control inputArea",id:"userPassword",placeholder:"Password *"})))),l.a.createElement("br",null),l.a.createElement("div",{className:"row"},l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest}))),l.a.createElement("div",{className:"col-6"},l.a.createElement("label",null,l.a.createElement("input",{type:"submit",value:"Submit"})))))))}}]),t}(n.Component)),v=function(e){function t(){return Object(c.a)(this,t),Object(m.a)(this,Object(o.a)(t).apply(this,arguments))}return Object(i.a)(t,e),Object(u.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(N,null))}}]),t}(n.Component);s.a.render(l.a.createElement(v,null),document.getElementById("root"))}},[[19,1,2]]]);
//# sourceMappingURL=main.77f96829.chunk.js.map
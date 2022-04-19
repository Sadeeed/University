import React, { Component } from "react";
import GenericLoginForm from "../Forms/GenericLoginForm";
import Footer from "../Footer/Footer";
import Header from "../Header/Header";

class SignUp extends Component {
  state = {};

  render() {
    return (
      <div className="App">
        <Header/>
        <GenericLoginForm />
        <Footer/>
      </div>
    );
  }
}

export default SignUp;

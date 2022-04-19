import React, { Component } from "react";
import Footer from "../Footer/Footer";
import Header from "../Header/Header";
import SignupForm from "../Forms/SignupForm";

class SignUp extends Component {
  state = {};

  render() {
    return (
      <div className="App">
        <Header/>
        <SignupForm />
        <Footer/>
      </div>
    );
  }
}

export default SignUp;

import React, { Component } from "react";
import Footer from "../../components/Footer/Footer";
import Header from "../../components/Header/Header";
import SignupForm from "../../components/Forms/SignupForm";

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

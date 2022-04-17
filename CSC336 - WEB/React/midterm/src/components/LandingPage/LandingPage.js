import React, { Component } from "react";
// import { Link } from "react-router-dom";
// import Card from "../Card/Card";
import GenericLoginForm from "../Forms/GenericLoginForm";

class LandingPage extends Component {
  state = {};

  render() {
    return (
      <div className="bg-nord text-nord-main">
        <GenericLoginForm />
      </div>
    );
  }
}

export default LandingPage;

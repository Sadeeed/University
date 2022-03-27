import React, { Component } from "react";
import Header from "../Header/Header";
import Footer from "../Footer/Footer";
import './Home.css'

class HomePage extends Component {
  state = {};
  render() {
    return (
      <div className="HomePage">
        <Header />
        <Footer />
      </div>
    );
  }
}

export default HomePage;

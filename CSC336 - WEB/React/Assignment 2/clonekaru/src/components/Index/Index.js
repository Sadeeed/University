import React, { Component } from "react";
import Header from "../../components/Header/Header";
import Footer from "../../components/Footer/Footer";
import '../Index/Index.css'

class IndexPage extends Component {
  state = {};
  render() {
    return (
      <div className="IndexPage">
        <Header />
        <Footer />
      </div>
    );
  }
}

export default IndexPage;

import React, { Component } from "react";
import Header from "../../components/Header/Header";
import Footer from "../../components/Footer/Footer";
import '../Index/Index.css'
import SearchBar from "../SearchBar/SearchBar";
import { cities } from "../../assets/js/cities";

class IndexPage extends Component {
  state = {};
  render() {
    return (
      <div className="IndexPage">
        <Header />
        <SearchBar cities={cities}/>
        <Footer />
      </div>
    );
  }
}

export default IndexPage;

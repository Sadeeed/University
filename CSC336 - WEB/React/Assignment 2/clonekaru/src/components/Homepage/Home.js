import React, { Component } from "react";
import Header from "../Header/Header";
import Footer from "../Footer/Footer";
import './Home.css'
import SearchBar from "../SearchBar/SearchBar";
import { cities } from "../../assets/js/cities";

class HomePage extends Component {
  state = {};
  render() {
    return (
      <div className="HomePage">
        <Header />
        <SearchBar cities={cities}/>
        <Footer />
      </div>
    );
  }
}

export default HomePage;

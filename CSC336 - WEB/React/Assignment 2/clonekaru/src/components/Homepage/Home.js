import React, { Component } from "react";
import Header from "../Header/Header";
import Footer from "../Footer/Footer";
import "./Home.css";
import SearchBar from "../SearchBar/SearchBar";
import { cities } from "../../assets/js/cities";
import HeroCarousel from "../Carousel/HeroCarousel";

class HomePage extends Component {
  state = {};
  render() {
    return (
      <div className="HomePage">
        <Header />
        <div id="content">
          <div className="pt-5 pb-3 hero-wrap">
            <HeroCarousel />
            <SearchBar cities={cities} />
          </div>
        </div>
        <Footer />
      </div>
    );
  }
}

export default HomePage;

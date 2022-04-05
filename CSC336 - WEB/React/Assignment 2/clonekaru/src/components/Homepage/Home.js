import React, { Component } from "react";
import Header from "../Header/Header";
import Footer from "../Footer/Footer";
import "./Home.css";
import SearchBar from "../SearchBar/SearchBar";
import { cities } from "../../assets/js/cities";
import HeroCarousel from "../Carousel/HeroCarousel";
import SliderCarousel from "../Carousel/SliderCarousel";
import Popular from "../Popular/Popular";
import Partners from "../Partners/Partners";
import MobileApp from "../Ad/MobileApp";

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
          <SliderCarousel/>
          <Popular/>
          <Partners/>
          <MobileApp/>
        </div>
        <Footer />
      </div>
    );
  }
}

export default HomePage;

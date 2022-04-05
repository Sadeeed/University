
import React, { Component } from "react";
import { Carousel } from "react-bootstrap";
import Partner from "./Partner";
import slider1 from "../../assets/images/bg/Bus/slider1.jpg";

class Partners extends Component {
  state = {
    brands: [
      { name: "faisal", img: require("../../assets/images/faisal.jpg") },
      { name: "sania", img: require("../../assets/images/sania.jpg") },
      { name: "suoer", img: require("../../assets/images/suoer.png") },
      { name: "silk", img: require("../../assets/images/silk.png") },
      { name: "skyways", img: require("../../assets/images/skyways.jpg") },
      { name: "shahzada", img: require("../../assets/images/shahzada.jpg") },
      { name: "swat", img: require("../../assets/images/swat.jpg") },
      { name: "umair", img: require("../../assets/images/umair.jpg") },
      {
        name: "walledcity",
        img: require("../../assets/images/walledcity.jpg"),
      },
      { name: "sada", img: require("../../assets/images/sada.png") },
      { name: "saddat", img: require("../../assets/images/saddat.png") },
    ],
  };

  render() {
    return (
      <div className="hero-wrap section">
        <div className="hero-mask opacity-8 bg-secondary" />
        <div
          className="hero-bg"
          style={{ backgroundImage: `url(${slider1})` }}
        />
        <div className="hero-content">
          <div className="container">
            <h2 className="mb-4 text-center text-9 font-weight-500 text-light">
              Our Partners
            </h2>
            <ul
              className="nav nav-tabs style-2 justify-content-center i-rad"
              id="myPartners"
              role="tablist"
            >
              <li className="nav-item">
                <a
                  className="nav-link active"
                  id="Bus_supplier_tab"
                  data-toggle="tab"
                  href="#Bus_supplier_list"
                  role="tab"
                  aria-controls="Bus_supplier_list"
                  aria-selected="false"
                >
                  Bus
                </a>
              </li>
            </ul>
            <div
              className="px-3 border shadow-sm tab-content bg-light p-rad"
              id="myPartnersContent"
              style={{ minHeight: 100 }}
            >
              <div
                className="tab-pane fade show active"
                id="Bus_supplier_list"
                role="tabpanel"
                aria-labelledby="Bus-supplier-tab"
              >
                <div className="p-4 brands-grid">
                  <Carousel controls={true}>
                    {this.state.brands.map((brand) => (
                      <Partner name={brand.name} image={brand.img} />
                    ))}
                  </Carousel>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Partners;

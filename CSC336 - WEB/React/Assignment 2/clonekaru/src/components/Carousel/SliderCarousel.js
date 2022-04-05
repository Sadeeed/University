import { Carousel } from "react-bootstrap";
import React, { Component } from "react";

class SliderCarousel extends Component {
  state = {
    slides: [
      {
        name: "mg",
        image: require("../../assets/images/bg/Bus/Mobile Slider 1.jpg"),
      },
      {
        name: "map",
        image: require("../../assets/images/bg/Bus/rsz_bus_bk_slide_1.jpg"),
      },
      {
        name: "travel",
        image: require("../../assets/images/Ads/Bus/homepage/Untitled-12.jpg"),
      },
    ],
  };

  render() {
    return (
      <section className="section">
        <div className="container" style={{ minHeight: "200px !important" }}>
          <Carousel indicators={false} controls={false} fade={true}>
            {this.state.slides.map((slide) => (
              <Carousel.Item>
                <div className="item">
                  <div className="card h-25 w-25">
                    <img
                      className="card-img-top b-rad"
                      src={slide.image}
                      alt={slide.name}
                      style={{
                        height: "187px !important",
                        maxHeight: "187px !important",
                      }}
                    />
                  </div>
                </div>
                {/* <img className="d-block w-25 h-25" src={slide.image} alt={slide.name} /> */}
              </Carousel.Item>
            ))}
          </Carousel>
        </div>
      </section>
    );
  }
}

export default SliderCarousel;

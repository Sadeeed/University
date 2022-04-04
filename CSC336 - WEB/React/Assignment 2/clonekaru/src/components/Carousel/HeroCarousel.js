import { Carousel } from "react-bootstrap";
import first_image from "../../assets/images/bg/Bus/8-01.jpg";
import second_image from "../../assets/images/bg/Bus/slider 7.jpg";
import third_image from "../../assets/images/bg/Bus/websliderbus2a.jpg";

function HeroCarousel() {
  return (
    <div className="hero-bg-slideshow">
      <Carousel indicators={false} controls={false}>
        <Carousel.Item>
          <img className="d-block w-100" src={first_image} alt="First slide" />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src={second_image}
            alt="Second slide"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img className="d-block w-100" src={third_image} alt="Third slide" />
        </Carousel.Item>
      </Carousel>
    </div>
  );
}

export default HeroCarousel;

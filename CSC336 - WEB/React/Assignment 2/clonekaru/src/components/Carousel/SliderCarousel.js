import { Carousel } from "react-bootstrap";

function SliderCarousel() {
  return (
    <section className="section">
      <div className="container" style={{ minHeight: "200px !important" }}>
        <Carousel indicators={false} controls={false} fade={true}>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src={''}
              alt="First slide"
            />
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src={''}
              alt="Second slide"
            />
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src={''}
              alt="Third slide"
            />
          </Carousel.Item>
        </Carousel>
      </div>
    </section>
  );
}

export default SliderCarousel;

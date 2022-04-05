import { Carousel } from "react-bootstrap";

function Partner(props) {
  return (
    <Carousel.Item>
      <img
        className="d-block w-100 img-fluid"
        src={props.image}
        alt={props.name}
      />
    </Carousel.Item>
  );
}

export default Partner;

import { Container, Nav, Navbar } from "react-bootstrap";
import { Link } from "react-router-dom";

const Header = () => {
  return (
    <Navbar bg="light" variant="light">
      <Container>
        {/* <Navbar.Brand href="#home">Navbar</Navbar.Brand> */}
        <Nav className="me-auto">
          <Link to="/" className="mx-2">Home</Link>
          <Link to="/products" className="mx-2">Products</Link>
          <Link to="/services" className="mx-2">Services</Link>
        </Nav>
      </Container>
    </Navbar>
  );
};

export default Header;

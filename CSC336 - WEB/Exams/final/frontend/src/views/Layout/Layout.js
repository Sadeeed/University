import Header from "../../components/Header/Header";
import { Row, Col, Container } from "react-bootstrap";

const Layout = (props) => {
  return (
    <>
      <Header />
      <Container>
        <Row>
          <Col>Display Menu</Col>
          <Col>Main section</Col>
        </Row>
      </Container>
    </>
  );
};

export default Layout;

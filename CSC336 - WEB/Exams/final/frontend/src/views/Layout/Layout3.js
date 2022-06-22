import Header from "../../components/Header/Header";
import { Row, Col, Container } from "react-bootstrap";
import { useState } from "react";
import { Link } from "react-router-dom";

const Layout3 = () => {
  const [text, setText] = useState("main section");

  return (
    <>
      <Header />
      <Container>
        <Row>
          <Col>
            <Row>
              <Link
                to="/"
                onClick={(e) => {
                  e.preventDefault();
                  setText("I am a Security Services section");
                }}
              >
                Security Services
              </Link>
            </Row>
            <Row>
              <Link
                to="/"
                onClick={(e) => {
                  e.preventDefault();
                  setText("I am a Network Services section");
                }}
              >
                Network Services
              </Link>
            </Row>
          </Col>
          <Col>{text}</Col>
        </Row>
      </Container>
    </>
  );
};

export default Layout3;

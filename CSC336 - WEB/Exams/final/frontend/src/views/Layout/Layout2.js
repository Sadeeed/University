import Header from "../../components/Header/Header";
import { Row, Col, Container } from "react-bootstrap";
import { useState } from "react";
import { Link } from "react-router-dom";

const Layout2 = () => {
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
                  setText("I am a Hardware Products section");
                }}
              >
                Hardware Products
              </Link>
            </Row>
            <Row>
              <Link
                to="/"
                onClick={(e) => {
                  e.preventDefault();
                  setText("I am a Accessories section");
                }}
              >
                Accessories
              </Link>
            </Row>
            <Row>
              {" "}
              <Link
                to="/"
                onClick={(e) => {
                  e.preventDefault();
                  setText("I am a Software Products section");
                }}
              >
                Software Products
              </Link>
            </Row>
          </Col>
          <Col>{text}</Col>
        </Row>
      </Container>
    </>
  );
};

export default Layout2;

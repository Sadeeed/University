import React, { Component } from "react";
import PostCard from "../Card/PostCard";
import PaginationButtons from "../Buttons/PaginationButtons";
import { posts } from "../../assets/js/posts";
import { Col, Container, Row } from "react-bootstrap";
import HeroCenter from "../Hero/HeroCenter";

class LandingPage extends Component {
  state = {
    posts: posts,
  };

  render() {
    return (
      <div>
        <Container>
          <Row>
            {this.state.posts.map((post) => (
              <Col xs={6}>
                <PostCard
                  title={post.fields.title}
                  author={post.fields.author}
                  created={post.fields.createdOn}
                  content={post.fields.content}
                />
              </Col>
            ))}
          </Row>

          <Row className="d-flex justify-content-center">
            <HeroCenter />
          </Row>

          <Row>
            <PaginationButtons />
          </Row>
        </Container>
      </div>
    );
  }
}

export default LandingPage;

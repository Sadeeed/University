import React, { Component } from "react";
import PostCard from "../Card/PostCard";
import PaginationButtons from "../Buttons/PaginationButtons";
import { posts } from "../../assets/js/posts";
import { Col, Container, Row } from "react-bootstrap";
// import HeroCenter from "../Hero/HeroCenter";

class LandingPage extends Component {
  state = {
    posts: posts,
  };

  render() {
    return (
      <div>
        <Container>
          {/* <Row>
            <HeroCenter />
          </Row> */}
          <h2>Recent Posts</h2>
          <Row xs={1} md={2} className="g-0">
            {this.state.posts.map((post) => (
              <Col>
                <PostCard
                  title={post.fields.title}
                  author={post.fields.author}
                  created={post.fields.createdOn}
                  content={post.fields.content}
                />
              </Col>
            ))}
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

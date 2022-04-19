import React, { Component } from "react";
import PostCard from "../Card/PostCard";
import PaginationButtons from "../Buttons/PaginationButtons";
import {posts} from "../../assets/js/posts"

class LandingPage extends Component {
  state = {
    posts: posts,
  };

  render() {
    return (
      <div>
        {this.state.posts.map((post) => (
          <PostCard
            title={post.fields.title}
            author={post.fields.author}
            created={post.fields.createdOn}
            content={post.fields.content}
          />
        ))}

        <PaginationButtons />
      </div>
    );
  }
}

export default LandingPage;

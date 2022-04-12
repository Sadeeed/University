import React, { Component } from "react";
import { Link } from "react-router-dom";

class PostCard extends Component {
  state = {};
  render() {
    return (
      <div
        className="card m-3"
        style={{ backgroundColor: "#202020", color: "#FFFFFF" }}
      >
        <div className="card-body">
          <h2 className="card-title">
            {"{"}
            {"{"} post.title {"}"}
            {"}"}
          </h2>
          <p className="card-text text-muted h6">
            {"{"}
            {"{"} post.author {"}"}
            {"}"} | {"{"}
            {"{"} post.createdOn{"}"}
            {"}"}{" "}
          </p>
          <p className="card-text">
            {"{"}
            {"{"}post.content| slice:":200" | safe {"}"}
            {"}"} ....{" "}
          </p>
          <Link
            to="/post"
            className="btn btn-primary"
          >
            Read More →
          </Link>
        </div>
      </div>
    );
  }
}

export default PostCard;

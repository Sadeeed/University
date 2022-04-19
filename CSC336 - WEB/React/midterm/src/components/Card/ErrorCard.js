import React, { Component } from "react";
import { Link } from "react-router-dom";

class ErrorCard extends Component {
  state = {};
  render() {
    return (
      <div className="justify-content-center">
        <div className="card m-5 bg-nord text-nord-main">
          <div className="card-body">
            <
            <h2 className="card-title">{this.props.title}</h2>
            <p className="card-text">{this.props.content}</p>
            <Link to="/" className="btn btn-nord">
              Take Me Back →
            </Link>
          </div>
        </div>
      </div>
    );
  }
}

export default ErrorCard;

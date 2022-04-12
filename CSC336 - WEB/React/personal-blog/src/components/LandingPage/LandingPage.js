import React, { Component } from "react";
import { Link } from "react-router-dom";
import PostCard from "../PostCard/PostCard";

class LandingPage extends Component {
  state = {
    posts: [
      {
        fields: {
          title: "Farenheit 451",
          author: "icesoup",
          updatedOn: "2021-09-02T05:02:59.343Z",
          content:
            "Guy Montag is a fireman. His job is to destroy the most illegal of commodities, the printed book, along with the houses in which they are hid .... ",
          createdOn: "2021-08-27T04:21:03.875Z",
          status: true,
        },
      },
      {
        fields: {
          title: "Recursion",
          author: "sadeed",
          updatedOn: "2021-09-01T12:33:05.592Z",
          content:
            "That's what NYC cop Barry Sutton is learning, as he investigates the devastating phenomenon the media has dubbed False Memory Syndrome—a mysterious affliction that drives its victims mad with ....",
          createdOn: "2021-08-27T04:21:03.875Z",
          status: true,
        },
      },
      {
        fields: {
          title: "1984",
          author: "sadeed",
          updatedOn: "2021-08-26T11:24:29.079Z",
          content:
            "Among the seminal texts of the 20th century, Nineteen Eighty-Four is a rare work that grows more haunting as its futuristic purgatory becomes more real. Published in 1949, the book offers political ....",
          createdOn: "2021-08-26T11:24:29.079Z",
          status: true,
        },
      },
      {
        fields: {
          title: "Animal Farm",
          author: "icesoup",
          updatedOn: "2021-08-31T09:46:11.649Z",
          content:
            "A farm is taken over by its overworked, mistreated animals. With flaming idealism and stirring slogans, they set out to create a paradise of progress, justice, and equality. Thus the stage is set f ....",
          createdOn: "2021-08-25T12:24:52.281Z",
          status: true,
        },
      },
    ],
  };

  render() {
    return (
      <>
        {this.state.posts.map((post) => (
          <PostCard
            title={post.fields.title}
            author={post.fields.author}
            created={post.fields.createdOn}
            content={post.fields.content}
          />
        ))}

        <div className="m-3">
          <div className="pagination">
            <span class="page-links">
              <Link class="btn btn-outline-light btn-sm mx-1" to="previous/">
                &larr;
              </Link>
              <Link class="btn btn-outline-light btn-sm" to="next/">
                &rarr;
              </Link>
            </span>
          </div>
        </div>
      </>
    );
  }
}

export default LandingPage;

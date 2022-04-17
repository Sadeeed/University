import React, { Component } from "react";
import Joi from "joi-browser";

class LoginForm extends Component {
  state = {
    details: { username: "", password: "" },
    errors: {},
  };

  schema = {
    username: Joi.string().required().label("Username"),
    password: Joi.string().required().label("Password"),
  };

  handleChange = (e) => {
    const clone = { ...this.state.details };
    clone[e.currentTarget.name] = e.currentTarget.value;
    this.setState({ details: clone });
  };

  handleValidate = (e) => {
    const result = Joi.validate(this.state.details, this.schema, {
      abortEarly: false,
    });
    if (!result.error) return null;
    const errors = {};

    result.error.details.map((d) => (errors[d.path[0]] = d.message));

    return errors;
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const error = this.handleValidate();
    this.setState({ errors: error || {} });

    if (error) return;
  };

  render() {
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <div className="form-group mb-2">
            <label htmlFor="username">Username</label>
            <input
              type="text"
              className="form-control"
              value={this.state.details.username}
              name="username"
              onChange={this.handleChange}
            />
            {this.state.errors.username && <div className='alert alert-danger'>{this.state.errors.username}</div>}
          </div>
          <div className="form-group mb-2">
            <label htmlFor="password">Password</label>
            <input
              type="password"
              className="form-control"
              value={this.state.details.password}
              name="password"
              onChange={this.handleChange}
            />
            {this.state.errors.password && <div className='alert alert-danger'>{this.state.errors.password}</div>}
          </div>
          <button className="btn btn-primary form-control">LogIn</button>
        </form>
      </div>
    );
  }
}

export default LoginForm;

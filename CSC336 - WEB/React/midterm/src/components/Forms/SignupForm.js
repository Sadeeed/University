import React from "react";
import { useFormik } from "formik";
import { Card } from "react-bootstrap";

const validate = (values) => {
  const errors = {};

  if (!values.Username) {
    errors.username = "Required";
  } else if (values.username.length > 15) {
    errors.username = "Must be 15 characters or less";
  }

  if (!values.Password) {
    errors.password = "Required";
  } else if (
    !/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$/i.test(
      values.password
    )
  ) {
    errors.password = "Invalid Password";
  }

  return errors;
};

const SignupForm = () => {
  const formik = useFormik({
    initialValues: {
      Username: "",
      Password: "",
      Image: "",
      AgeGroup: [],
      Gender: "",
      toc: false,
    },

    validate,

    onSubmit: (values) => {
      alert(JSON.stringify(values, null, 2));
    },
  });

  return (
    <div>
      <Card className="bg-nord px-5 mx-5 my-5 py-3">
        <Card.Title className="text-nord-main mb-4">Sign Up</Card.Title>
        <form onSubmit={formik.handleSubmit}>
          {/* 2 column grid layout with text inputs for the Username and Password */}
          <div className="row mb-4">
            <div className="col">
              <div className="form-outline">
                <input
                  type="text"
                  id="Username"
                  className="form-control text-nord-input"
                  placeholder="Username"
                  onChange={formik.handleChange}
                  value={formik.values.Username}
                />
                {formik.errors.username ? (
                  <div>{formik.errors.username}</div>
                ) : null}
              </div>
            </div>
            <div className="col">
              <div className="form-outline">
                <input
                  type="password"
                  id="Password"
                  className="form-control text-nord-input"
                  placeholder="Password"
                  onChange={formik.handleChange}
                  value={formik.values.Password}
                />
              </div>
            </div>
          </div>

          {/* File */}
          <div className="input-group mb-3">
            <input
              type="file"
              className="form-control"
              accept="image/*"
              id="Image"
              onChange={formik.handleChange}
              value={formik.values.Image}
            />
            <label className="input-group-text" for="Image">
              Upload Image
            </label>
          </div>

          {/* Select */}
          <select
            className="form-select mb-4"
            aria-label="Age Group"
            id="AgeGroup"
            name="AgeGroup"
            onChange={formik.handleChange}
            // value={formik.values.AgeGroup}
          >
            <option defaultValue={""}>Select Your Age Group</option>
            <option value={20}>Twenties</option>
            <option value={30}>Thirties</option>
            <option value={40}>Forties</option>
            <option value={50}>Fifties</option>
            <option value={60}>Sixties</option>
            <option value={70}>Seventies</option>
          </select>

          {/* Radios */}
          <div>
            <div className="form-check form-check-inline">
              <input
                className="form-check-input"
                type="radio"
                name="Gender"
                id="GenderM"
                onChange={formik.handleChange}
                value="M"
              />
              <label
                className="form-check-label text-nord-main"
                htmlFor="GenderM"
              >
                Male
              </label>
            </div>
            <div className="form-check form-check-inline">
              <input
                className="form-check-input"
                type="radio"
                name="Gender"
                id="GenderF"
                onChange={formik.handleChange}
                value="F"
              />
              <label
                className="form-check-label text-nord-main"
                htmlFor="GenderF"
              >
                Female
              </label>
              {/* <p>{formik.values.Gender}</p> */}
            </div>
          </div>

          {/* Checkbox */}
          <div className="form-check d-flex justify-content-center mb-4">
            <input
              className="form-check-input text-nord-input me-2"
              type="checkbox"
              id="toc"
              onChange={formik.handleChange}
              value={formik.values.toc}
            />
            <label className="form-check-label text-nord-main" htmlFor="toc">
              I have read the terms and conditions
            </label>
          </div>

          <button type="submit" className="btn btn-nord btn-block mb-4">
            Sign up
          </button>
        </form>

        {/* <form onSubmit={formik.handleSubmit}>
          <div className="form-group">
            <label htmlFor="username" className="text-nord-main">
              Username
            </label>
            <input
              type="text"
              className="form-control text-nord-input"
              id="username"
              placeholder="Username"
              onChange={formik.handleChange}
              value={formik.values.username}
            />

            {formik.errors.username ? (
              <div>{formik.errors.username}</div>
            ) : null}

          </div>
          <div className="form-group">
            <label htmlFor="password" className="text-nord-main">
              Password
            </label>
            <input
              type="password"
              className="form-control text-nord-input"
              id="password"
              placeholder="Password"
              onChange={formik.handleChange}
              value={formik.values.password}
            />

            {formik.errors.password ? (
              <div>{formik.errors.password}</div>
            ) : null}

          </div>
          <button type="submit" className="btn btn-nord mt-2">
            Submit
          </button>
        </form> */}
      </Card>
    </div>
  );
};

export default SignupForm;

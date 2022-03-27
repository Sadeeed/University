import React, { Component } from "react";
import logo_new from '../../assets/images/logo_new.png'

class Header extends Component {
  state = {};
  render() {
    return (
      <div className="headerDiv">
        <header
          id="header"
          className="bg-secondary-header"
          style={{backgroundColor:'#ffff !important'}}
        >
          <div className="container custom-container">
            <div className="header-row">
              <div className="header-column justify-content-start">
                <div className="logo">
                  <a
                    href="index.html"
                    title="BOOKKARU| Buy Online Tickets in Pakistan"
                  >
                    <img
                      src={logo_new}
                      className="custom-zoom"
                      alt="Bookkaru"
                      width="223"
                      height="46"
                    />
                  </a>
                </div>
              </div>
              <div className="header-column justify-content-end">
                <nav className="primary-menu navbar navbar-expand-lg">
                  <div id="header-nav" className="collapse navbar-collapse">
                    <ul className="navbar-nav">
                      <li className="dropdown active">
                        <a className="dropdown-toggle" href="index.html">
                          Home
                        </a>
                      </li>
                      <li className="dropdown">
                        <a className="dropdown-toggle" href="index.html">
                          Bus
                        </a>
                      </li>
                      <li className="dropdown">
                        <a className="dropdown-toggle" href="events.html">
                          Events
                        </a>
                      </li>

                      <li className="login-signup ml-lg-2">
                        <a
                          className="pl-lg-4 pr-0"
                          href="login-signup.html"
                          title="Login / Sign up"
                        >
                          Login / Sign up
                          <span className="d-none d-lg-inline-block">
                            <i className="fas fa-user"></i>
                          </span>
                        </a>
                      </li>

                      <li className="ml-lg-10">
                        <a className="pl-lg-6 pr-0" href="index.html" title="Contact Us">
                          <i
                            className="fas fa-phone-alt text-4 pl-lg-4 pr-3"
                            style={{borderLeft: '1px solid rgba(250, 250, 250, 0.35)'}}
                          ></i>
                          <span className="d-lg-inline-block text-1">
                            Need Assistence with Bookkaru?
                            <br />
                            Call Us Now: 0311-1999560
                          </span>
                        </a>
                      </li>
                    </ul>
                  </div>
                </nav>
              </div>

              <button
                className="navbar-toggler"
                type="button"
                data-toggle="collapse"
                data-target="#header-nav"
              >
                <span></span> <span></span> <span></span>
              </button>
            </div>
          </div>
        </header>
      </div>
    );
  }
}

export default Header;

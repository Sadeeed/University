import React, { Component } from "react";
import easypaisa from '../../assets/images/payment/easypaisa.png'
import jazzcash from '../../assets/images/payment/jazzcash.png'
import visa from '../../assets/images/payment/visa.png'
import wallet from '../../assets/images/payment/wallet.png'
import cashlogo from '../../assets/images/payment/cashlogo.png'

class Footer extends Component {
  state = {};
  render() {
    return (
      <div className="footerDiv">
        <footer id="footer" className="custom-backgroud-color">
          <section className="section bg-secondary text-white shadow-md pt-4 pb-3">
            <div className="container">
              <div className="row">
                <div className="col-sm-6 col-md-3">
                  <div className="featured-box text-center">
                    <div className="featured-box-icon custom-icon-color">
                      <i className="fas fa-lock"></i>
                    </div>
                    <h4 className="text-white">100% Secure Payments</h4>
                    <p>
                      Moving your card details to a much more secured place.
                    </p>
                  </div>
                </div>
                <div className="col-sm-6 col-md-3">
                  <div className="featured-box text-center">
                    <div className="featured-box-icon custom-icon-color">
                      <i className="fas fa-thumbs-up"></i>
                    </div>
                    <h4 className="text-white">Trust pay</h4>
                    <p>100% Payment Protection.</p>
                  </div>
                </div>
                <div className="col-sm-6 col-md-3">
                  <div className="featured-box text-center">
                    <div className="featured-box-icon custom-icon-color">
                      <i className="fas fa-bullhorn"></i>
                    </div>
                    <h4 className="text-white">Deals & Offers</h4>
                    <p>Best Deals & Offers For You.</p>
                  </div>
                </div>
                <div className="col-sm-6 col-md-3">
                  <div className="featured-box text-center">
                    <div className="featured-box-icon custom-icon-color">
                      <i className="far fa-life-ring"></i>
                    </div>
                    <h4 className="text-white">24X7 Support</h4>
                    <p>
                      We're here to help. Have a query and need help ?
                      <a href="page/support.html">Click here</a>
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </section>
          <div className="container mt-4">
            <div className="row">
              <div className="col-md-4 mb-3 mb-md-0">
                <p>Payment</p>
                <ul className="payments-types">
                  <li>
                    <a href={'https://bookkaru.com/'} target="_blank" rel="noreferrer">
                      <img
                        data-toggle="tooltip"
                        src={easypaisa}
                        alt="Easypaisa"
                        title="Easypaisa"
                        style={{maxWidth:'54px', maxHeight:'34px'}}
                      />
                    </a>
                  </li>
                  <li>
                    <a href={'https://bookkaru.com/'} target="_blank" rel="noreferrer">
                      <img
                        data-toggle="tooltip"
                        src={jazzcash}
                        alt="Jazzcash"
                        title="Jazzcash"
                        style={{maxWidth:'54px', maxHeight:'34px'}}
                      />
                    </a>
                  </li>
                  <li>
                    <a href={'https://bookkaru.com/'} target="_blank" rel="noreferrer">
                      <img
                        data-toggle="tooltip"
                        src={visa}
                        alt="Credit"
                        title="Credit"
                        style={{maxWidth:'54px', maxHeight:'34px'}}
                      />
                    </a>
                  </li>
                  <li>
                    <a href={'https://bookkaru.com/'} target="_blank" rel="noreferrer">
                      <img
                        data-toggle="tooltip"
                        src={wallet}
                        alt="Bookkaru"
                        title="Bookkaru"
                        style={{maxWidth:'54px', maxHeight:'34px'}}
                      />
                    </a>
                  </li>
                  <li>
                    <a href={'https://bookkaru.com/'} target="_blank" rel="noreferrer">
                      <img
                        data-toggle="tooltip"
                        src={cashlogo}
                        alt="Cash"
                        title="Cash"
                        style={{maxWidth:'54px', maxHeight:'34px'}}
                      />
                    </a>
                  </li>
                </ul>
              </div>
              <div className="col-md-4 mb-3 mb-md-0">
                <p>Subscribe</p>
                <div className="input-group newsletter">
                  <input
                    className="form-control"
                    placeholder="Your Email Address"
                    name="newsletterEmail"
                    id="newsletterEmail"
                    type="text"
                  />
                  <span className="input-group-append">
                    <button className="btn btn-secondary" type="submit">
                      Subscribe
                    </button>
                  </span>
                </div>
              </div>
              <div className="col-md-4 d-flex align-items-md-end flex-column">
                <p>Keep in touch</p>
                <ul className="social-icons social-icons-colored">
                  <li className="social-icons-facebook">
                    <a
                      data-toggle="tooltip"
                      href={"https://www.facebook.com/Bookkaru-104382748109042"}
                      target="_blank"
                      title="Facebook" rel="noreferrer"
                    >
                      <i className="fab fa-facebook-f"></i>
                    </a>
                  </li>
                  <li className="social-icons-instagram">
                    <a
                      data-toggle="tooltip"
                      href={"https://www.instagram.com/bookkaru/"}
                      target="_blank"
                      title="Instagram" rel="noreferrer"
                    >
                      <i className="fab fa-instagram"></i>
                    </a>
                  </li>
                  <li className="social-icons-linkedin">
                    <a
                      data-toggle="tooltip"
                      href={"https://www.linkedin.com/in/book-karu-102321216/"}
                      target="_blank"
                      title="Linkedin" rel="noreferrer"
                    >
                      <i className="fab fa-linkedin-in"></i>
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
          <div className="container">
            <div className="footer-copyright">
              <ul className="nav justify-content-center">
                <li className="nav-item">
                  <a className="nav-link text-white active" href="page/about.html">
                    About Us
                  </a>
                </li>
                <li className="nav-item">
                  <a
                    className="nav-link text-white active"
                    href="page/terms-conditions.html"
                  >
                    Terms &amp; Conditions Of Use
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link text-white active" href="page/faq.html">
                    FAQs
                  </a>
                </li>
                <li className="nav-item">
                  <a
                    className="nav-link text-white active"
                    href="page/support.html"
                  >
                    Support
                  </a>
                </li>
              </ul>
              <p className="copyright-text">
                Copyright © 2020 <a href={'https://bookkaru.com/'}>BOOKKARU</a>. All Rights Reserved.
              </p>
              <div className="justify-content-center pt-2"></div>
            </div>
          </div>
        </footer>
      </div>
    );
  }
}

export default Footer;

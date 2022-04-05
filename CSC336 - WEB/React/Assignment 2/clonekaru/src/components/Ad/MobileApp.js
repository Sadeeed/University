import React, { Component } from "react";

class MobileApp extends Component {
  state = {
      stores: [
          { name:'apple', href:'https://apps.apple.com/us/app/bookkaru/id1353393939', img:require('../../assets/images/app-store.png') },
          { name:'play', href:'https://play.google.com/store/apps/details?id=com.bookkaru&hl=en', img:require('../../assets/images/google-play-store.png') },
    ]
  };
  render() {
    return (
      <section className="pb-0 section">
        <div className="container">
          <div className="row">
            <div className="col-md-7 col-lg-6">
              <h2 className="my-4 text-9 font-weight-600">
                Download Our Bookkaru
                <br className="d-none d-lg-inline-block" />
                Mobile App Now
              </h2>
              <p className="lead">
                Download our app for the fastest, most convenient way to Book
                Tickets Online.
              </p>
              <p>
                Our app has all your booking needs covered: Secure payment
                channels, easy 4-step booking process, and sleek user designs.
                What more could you ask for?
              </p>
              <ul>
                <li>Booking Online</li>
                <li>Recharge</li>
                <li>Secure payments</li>
                <li>and much more.....</li>
              </ul>
              <div
                className="flex-wrap pt-2 pb-4 d-flex"
                style={{ minHeight: 68, justifyContent: "center" }}
              >
                {this.state.stores.map((store) => (
                  <a
                    className={store.name === 'apple' ? "mx-4 mob-view" : "" }
                    href={store.href}
                  >
                    <img
                      className={store.name === 'apple' ? "b-rad mob-view" : "b-rad" }
                      alt={store.name}
                      src={store.img}
                    />
                  </a>
                ))}
              </div>
            </div>
            <div className="text-center col-md-5 col-lg-6 app-height">
              <img
                className="img-fluid lazy"
                alt=""
                src={require("../../assets/images/appscreen.png")}
              />
            </div>
          </div>
        </div>
      </section>
    );
  }
}

export default MobileApp;

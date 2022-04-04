function Popular() {
  return (
    <section className="shadow-md section bg-light">
      <div className="container">
        <h2 className="text-center text-9 font-weight-500">Popular Routes</h2>
        <p className="mb-4 text-center lead">
          Search Hotels, Flights, Trains &amp; Bus
        </p>
        <ul
          className="mb-5 nav nav-tabs style-2 bg-bookkaru nav-fill justify-content-center"
          id="myRoutes"
          role="tablist"
        >
          <li className="nav-item">
            <a
              className="nav-link text-4 active"
              id="four-tab"
              data-toggle="tab"
              href="#four"
              role="tab"
              aria-controls="four"
              aria-selected="true"
            >
              Bus
            </a>
          </li>
        </ul>
        <div className="tab-content" id="myRoutesContent">
          <div
            className="tab-pane fade show active"
            id="four"
            role="tabpanel"
            aria-labelledby="four-tab"
          >
            <div className="row">
              <div className="col-lg-6">
                <div className="row">
                  <div className="col-md-8 col-lg-8">
                    <p className="d-flex align-items-center">
                      Lahore To Muzaffargarh
                    </p>
                  </div>
                  <div className="col-md-4 col-lg-4 text-right">
                    <form method="post" action="https://bookkaru.com/search">
                      <input
                        type="hidden"
                        name="_token"
                        defaultValue="TDAg4a1lru9Oqh6NllMqw2chonlaNZG5hBTPMZag"
                      />
                      <input type="hidden" name="from" defaultValue={54} />
                      <input type="hidden" name="to" defaultValue={265} />
                      <input
                        type="hidden"
                        name="date"
                        defaultValue="03-25-2022"
                      />
                      <button
                        className="ml-auto shadow-none btn btn-sm btn-outline-primary"
                        type="submit"
                      >
                        <i className="fas fa-search d-block d-sm-none" />
                        <span className="d-none d-sm-block">Book Now</span>
                      </button>
                    </form>
                  </div>
                </div>
                <hr />
              </div>
              <div className="col-lg-6">
                <div className="row">
                  <div className="col-md-8 col-lg-8">
                    <p className="d-flex align-items-center">
                      Lahore To Islamabad
                    </p>
                  </div>
                  <div className="col-md-4 col-lg-4 text-right">
                    <form method="post" action="https://bookkaru.com/search">
                      <input
                        type="hidden"
                        name="_token"
                        defaultValue="TDAg4a1lru9Oqh6NllMqw2chonlaNZG5hBTPMZag"
                      />
                      <input type="hidden" name="from" defaultValue={54} />
                      <input type="hidden" name="to" defaultValue={310} />
                      <input
                        type="hidden"
                        name="date"
                        defaultValue="03-25-2022"
                      />
                      <button
                        className="ml-auto shadow-none btn btn-sm btn-outline-primary"
                        type="submit"
                      >
                        <i className="fas fa-search d-block d-sm-none" />
                        <span className="d-none d-sm-block">Book Now</span>
                      </button>
                    </form>
                  </div>
                </div>
                <hr />
              </div>
              <div className="col-lg-6">
                <div className="row">
                  <div className="col-md-8 col-lg-8">
                    <p className="d-flex align-items-center">
                      Lahore To Multan
                    </p>
                  </div>
                  <div className="col-md-4 col-lg-4 text-right">
                    <form method="post" action="https://bookkaru.com/search">
                      <input
                        type="hidden"
                        name="_token"
                        defaultValue="TDAg4a1lru9Oqh6NllMqw2chonlaNZG5hBTPMZag"
                      />
                      <input type="hidden" name="from" defaultValue={54} />
                      <input type="hidden" name="to" defaultValue={56} />
                      <input
                        type="hidden"
                        name="date"
                        defaultValue="03-25-2022"
                      />
                      <button
                        className="ml-auto shadow-none btn btn-sm btn-outline-primary"
                        type="submit"
                      >
                        <i className="fas fa-search d-block d-sm-none" />
                        <span className="d-none d-sm-block">Book Now</span>
                      </button>
                    </form>
                  </div>
                </div>
                <hr />
              </div>
              <div className="col-lg-6">
                <div className="row">
                  <div className="col-md-8 col-lg-8">
                    <p className="d-flex align-items-center">
                      Islamabad To Lahore
                    </p>
                  </div>
                  <div className="col-md-4 col-lg-4 text-right">
                    <form method="post" action="https://bookkaru.com/search">
                      <input
                        type="hidden"
                        name="_token"
                        defaultValue="TDAg4a1lru9Oqh6NllMqw2chonlaNZG5hBTPMZag"
                      />
                      <input type="hidden" name="from" defaultValue={310} />
                      <input type="hidden" name="to" defaultValue={54} />
                      <input
                        type="hidden"
                        name="date"
                        defaultValue="03-25-2022"
                      />
                      <button
                        className="ml-auto shadow-none btn btn-sm btn-outline-primary"
                        type="submit"
                      >
                        <i className="fas fa-search d-block d-sm-none" />
                        <span className="d-none d-sm-block">Book Now</span>
                      </button>
                    </form>
                  </div>
                </div>
                <hr />
              </div>
              <div className="col-lg-6">
                <div className="row">
                  <div className="col-md-8 col-lg-8">
                    <p className="d-flex align-items-center">
                      Bahawalpur To Lahore
                    </p>
                  </div>
                  <div className="col-md-4 col-lg-4 text-right">
                    <form method="post" action="https://bookkaru.com/search">
                      <input
                        type="hidden"
                        name="_token"
                        defaultValue="TDAg4a1lru9Oqh6NllMqw2chonlaNZG5hBTPMZag"
                      />
                      <input type="hidden" name="from" defaultValue={58} />
                      <input type="hidden" name="to" defaultValue={54} />
                      <input
                        type="hidden"
                        name="date"
                        defaultValue="03-25-2022"
                      />
                      <button
                        className="ml-auto shadow-none btn btn-sm btn-outline-primary"
                        type="submit"
                      >
                        <i className="fas fa-search d-block d-sm-none" />
                        <span className="d-none d-sm-block">Book Now</span>
                      </button>
                    </form>
                  </div>
                </div>
                <hr />
              </div>
              <div className="col-lg-6">
                <div className="row">
                  <div className="col-md-8 col-lg-8">
                    <p className="d-flex align-items-center">
                      Lahore To Peshawer
                    </p>
                  </div>
                  <div className="col-md-4 col-lg-4 text-right">
                    <form method="post" action="https://bookkaru.com/search">
                      <input
                        type="hidden"
                        name="_token"
                        defaultValue="TDAg4a1lru9Oqh6NllMqw2chonlaNZG5hBTPMZag"
                      />
                      <input type="hidden" name="from" defaultValue={54} />
                      <input type="hidden" name="to" defaultValue={114} />
                      <input
                        type="hidden"
                        name="date"
                        defaultValue="03-25-2022"
                      />
                      <button
                        className="ml-auto shadow-none btn btn-sm btn-outline-primary"
                        type="submit"
                      >
                        <i className="fas fa-search d-block d-sm-none" />
                        <span className="d-none d-sm-block">Book Now</span>
                      </button>
                    </form>
                  </div>
                </div>
                <hr />
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
}

export default Popular;

function SearchBar(props) {
  return (
    <div className="hero-content pt-lg-2 mt-lg-5">
      <div className="container pt-5 custom-padd-container">
        <ul className="nav nav-tabs style-3" id="myTab" role="tablist">
          <li className="nav-item">
            <a
              className="nav-link custom-nav-link active"
              id="Bus-tab"
              href="index.html"
              aria-controls="Bus"
              aria-selected="false"
              title="Bus"
            >
              <span>
                <i className="fas fa-bus" />
              </span>
            </a>
          </li>
          <li className="nav-item">
            <a
              className="nav-link custom-nav-link"
              id="Events-tab"
              href="events.html"
              aria-controls="Events"
              aria-selected="false"
              title="Events"
            >
              <span>
                <i className="fas fa-calendar" />
              </span>
            </a>
          </li>
        </ul>
        <div
          className="pl-2 pr-2 tab-content custom-padd-search"
          id="myTabContent"
        >
          <div
            className="tab-pane fade show active"
            id="Bus"
            role="tabpanel"
            aria-labelledby="Bus-tab"
          >
            <form
              id="bookingBus"
              method="post"
            >
              <div className="row no-gutters search-input-2">
                <div className="pl-1 pr-1 col-lg form-group">
                  <select
                    className="js-example-basic-single travellers-class-input form-control input-design from"
                    name="from"
                    required=""
                  >
                    <option value="" disabled={true}>From</option>
                    {props.cities.map((city) => (
                      <option value={city.id} data-icon="fas fa-map-marker-alt">
                        {city.name}
                      </option>
                    ))}
                  </select>
                  <span className="icon-inside">
                    <i className="fas fa-map-marker-alt" />
                  </span>
                </div>
                <div className="pl-1 pr-1 col-lg form-group">
                  <select
                    className="js-example-basic-single travellers-class-input form-control input-design to"
                    name="to"
                    required=""
                  >
                    <option value="" disabled={true}>To</option>
                    {props.cities.map((city) => (
                      <option value={city.id} data-icon="fas fa-map-marker-alt">
                        {city.name}
                      </option>
                    ))}
                  </select>
                  <span className="icon-inside">
                    <i className="fas fa-map-marker-alt" />
                  </span>
                </div>
                <div className="pl-1 pr-1 col-lg form-group">
                  <input
                    id="busDepart"
                    type="text"
                    className="form-control input-design"
                    name="date"
                    required=""
                    readOnly=""
                    placeholder="Depart Date"
                    defaultValue="03-25-2022"
                  />
                  <span className="icon-inside">
                    <i className="far fa-calendar-alt" />
                  </span>
                </div>
                <div className="pl-1 pr-1 col-lg-2 form-group">
                  <input type="hidden" name="one" defaultValue={1} />
                  <button className="search-bus d-none" type="submit">
                    Search
                    <i className="pl-2 fas fa-search d-custom-none" />
                  </button>
                  <button
                    className="btn btn-cust-color btn-block b-rad px-3 search-btn"
                    style={{ height: "51px !important" }}
                  >
                    Search
                    <i className="pl-2 fas fa-search d-custom-none" />
                  </button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
}

export default SearchBar;

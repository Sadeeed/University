import Header from "./Header";
import Footer from "./Footer";
import Sidebar from "./Sidebar";
import Card from "./Card";

function Layout() {
  return (
    <div className="container">
      <div className="row">
          <Header/>
      </div>
      <div className="row">
        <div className="col-4">
          <Sidebar/>
        </div>
        <div className="col-8" style={{textAlign: 'center'}}>
          <Card/>
        </div>
      </div>
      <div className="row">
          <Footer/>
      </div>
    </div>
  );
}

export default Layout;

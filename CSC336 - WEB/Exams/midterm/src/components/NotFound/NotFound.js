import ErrorCard from "../Card/ErrorCard";
import Footer from "../Footer/Footer";
import Header from "../Header/Header";

function NotFound() {
  return (
    <div className="App">
      <Header />
      <ErrorCard title = 'Invalid URL' content = '404 Not Found' />
      <Footer />
    </div>
  );
}

export default NotFound;

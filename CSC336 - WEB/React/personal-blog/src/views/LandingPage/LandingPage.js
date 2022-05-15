import ArticleList from "../../components/Card/ArticleList";
import Footer from "../../components/Footer/Footer";
import SidebarLeft from "../../components/Sidebar/SidebarLeft";
import SidebarRight from "../../components/Sidebar/SidebarRight";

const LandingPage = (props) => {
  return (
    <div className="container main-container flex on-phone--column extended">
      <SidebarLeft />
      <main className="main full-width">
        <ArticleList />
        <Footer />
      </main>
      <SidebarRight/>
    </div>
  );
};

export default LandingPage;

import MainArticle from "../../components/Card/MainArticle";
import SidebarLeft from "../../components/Sidebar/SidebarLeft";
import Footer from "../../components/Footer/Footer";
// import SidebarRightPost from "../../components/Sidebar/SidebarRightPost";

const PostPage = (props) => {
  return (
    <div className="article-page">
      <div className="container main-container flex on-phone--column extended">
        <SidebarLeft />
        <main className="main full-width">
          <MainArticle />
          <Footer />
        </main>
        {/* <SidebarRightPost/> */}
      </div>
    </div>
  );
};

export default PostPage;

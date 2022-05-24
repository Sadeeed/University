import MainArticle from "../../components/Card/MainArticle";
import SidebarLeft from "../../components/Sidebar/SidebarLeft";
import Footer from "../../components/Footer/Footer";
import { useLocation } from "react-router-dom";
// import SidebarRightPost from "../../components/Sidebar/SidebarRightPost";

const PostPage = (props) => {
  const location = useLocation()
  const artcile = location.state
  // console.log(location.state)
  return (
    <div className="article-page">
      <div className="container main-container flex on-phone--column extended">
        <SidebarLeft />
        <main className="main full-width">
          <MainArticle
            data={artcile}
            title={artcile.title}
            subtitle={artcile.subtitle}
            published={artcile.created}
            content="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut fermentum ligula et lacinia vestibulum. Quisque nec libero elit. Curabitur rhoncus finibus ipsum, ac pharetra nunc fringilla ac. Etiam eget enim et arcu ornare scelerisque ut quis dolor. Mauris vitae euismod ipsum, quis dictum tortor. Integer accumsan, metus et consectetur scelerisque, leo odio malesuada lorem, a tempor lectus leo eu enim. Nullam consectetur cursus turpis, id placerat dolor vulputate in. "
          />
          <Footer />
        </main>
        {/* <SidebarRightPost/> */}
      </div>
    </div>
  );
};

export default PostPage;

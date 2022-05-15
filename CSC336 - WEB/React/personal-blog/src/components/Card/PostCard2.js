import { CalendarTime, Clock } from "tabler-icons-react";
import c1 from "../../assets/images/card-header.jpg";

const PostCard2 = (props) => {
  return (
    <article className="has-image">
      <header className="article-header">
        <div className="article-image">
          <a href="/p/markdown-syntax-guide/">
            <img src={c1} alt="alt text" width={800} height={534} />
          </a>
        </div>
        <div className="article-details">
          <header className="article-category">
            <a href="/categories/themes/">themes</a>
            <a href="/categories/syntax/">syntax</a>
          </header>
          <div className="article-title-wrapper">
            <h2 className="article-title">
              <a href="/p/markdown-syntax-guide/">{props.title}</a>
            </h2>
            <h3 className="article-subtitle">
                {props.content}
            </h3>
          </div>
          <footer className="article-time">
            <div>
              <CalendarTime size={24} strokeWidth={2} />
              <time className="article-time--published">{props.created}</time>
            </div>
            <div>
              <Clock size={24} strokeWidth={2} />
              <time className="article-time--reading">3 minute read</time>
            </div>
          </footer>
        </div>
      </header>
    </article>
  );
};

export default PostCard2;

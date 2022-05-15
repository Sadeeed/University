import PostCard2 from "./PostCard2";

const ArticleList = () => {
  return (
    <section className="article-list">
      <PostCard2
        title="Markdown Syntax Guide"
        author="unknown"
        content="Sample article showcasing basic Markdown syntax and formatting for HTML elements."
        created="Mar 11, 2019"
      />

      <PostCard2
        title="Markdown Syntax Guide"
        author="unknown"
        content="Sample article showcasing basic Markdown syntax and formatting for HTML elements."
        created="Mar 11, 2019"
      />

      <PostCard2
        title="Markdown Syntax Guide"
        author="unknown"
        content="Sample article showcasing basic Markdown syntax and formatting for HTML elements."
        created="Mar 11, 2019"
      />
    </section>
  );
};

export default ArticleList;

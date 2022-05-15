import { Hash, Infinity, Search, Tag } from "tabler-icons-react";

const SidebarRight = (props) => {
  return (
    <aside className="sidebar right-sidebar sticky">
      <form action="/search/" className="search-form widget">
        <p>
          <label>Search</label>
          <input name="keyword" required="" placeholder="Type something..." />
          <button title="Search">
            <Search size={24} strokeWidth={2} />
          </button>
        </p>
      </form>
      <section className="widget archives">
        <div className="widget-icon">
          <Infinity size={24} strokeWidth={2} />
        </div>
        <h2 className="widget-title section-title">Archives</h2>
        <div className="widget-archive--list">
          <div className="archives-year">
            <a href="/archives/#2019">
              <span className="year">2019</span>
              <span className="count">5</span>
            </a>
          </div>
        </div>
      </section>
      <section className="widget tagCloud">
        <div className="widget-icon">
          <Hash size={24} strokeWidth={2} />
        </div>
        <h2 className="widget-title section-title">Categories</h2>
        <div className="tagCloud-tags">
          <a href="/categories/test/" className="font_size_2">
            Test
          </a>
          <a href="/categories/syntax/" className="font_size_1">
            syntax
          </a>
          <a href="/categories/test-with-whitespaces/" className="font_size_1">
            Test with whitespaces
          </a>
          <a href="/categories/themes/" className="font_size_1">
            themes
          </a>
        </div>
      </section>
      <section className="widget tagCloud">
        <div className="widget-icon">
          <Tag size={24} strokeWidth={2} />
        </div>
        <h2 className="widget-title section-title">Tags</h2>
        <div className="tagCloud-tags">
          <a href="/tags/markdown/" className="font_size_2">
            markdown
          </a>
          <a href="/tags/css/" className="font_size_1">
            css
          </a>
          <a href="/tags/emoji/" className="font_size_1">
            emoji
          </a>
          <a href="/tags/html/" className="font_size_1">
            html
          </a>
          <a href="/tags/privacy/" className="font_size_1">
            privacy
          </a>
          <a href="/tags/shortcodes/" className="font_size_1">
            shortcodes
          </a>
          <a href="/tags/tag-with-whitespaces/" className="font_size_1">
            tag with whitespaces
          </a>
          <a href="/tags/text/" className="font_size_1">
            text
          </a>
          <a href="/tags/themes/" className="font_size_1">
            themes
          </a>
        </div>
      </section>
    </aside>
  );
};

export default SidebarRight;

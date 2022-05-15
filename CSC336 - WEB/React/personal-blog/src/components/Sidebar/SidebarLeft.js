import {
  Archive,
  BrandGithub,
  BrandTwitter,
  Home,
  Language,
  Link,
  Search,
  ToggleLeft,
  ToggleRight,
  User,
} from "tabler-icons-react";

import default_avatar from '../../assets/images/avatar_default.png'

const SidebarLeft = (props) => {
  return (
    <aside className="sidebar left-sidebar sticky ">
      <button
        className="hamburger hamburger--spin"
        type="button"
        id="toggle-menu"
        aria-label="Toggle Menu"
      >
        <span className="hamburger-box">
          <span className="hamburger-inner" />
        </span>
      </button>
      <header>
        <figure className="site-avatar">
          <a href="/">
            <img
              src={default_avatar}
              className="site-logo"
              loading="lazy"
              alt="Avatar"
              width={300}
              height={300}
            />
          </a>
          <span className="emoji">🍥</span>
        </figure>
        <div className="site-meta">
          <h1 className="site-name">
            <a href="/">Example Site</a>
          </h1>
          <h2 className="site-description">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
          </h2>
        </div>
      </header>
      <ol className="social-menu">
        <li>
          <a
            href="https://github.com/CaiJimmy/hugo-theme-stack"
            target="_blank"
            title="GitHub"
          >
            <BrandGithub size={24} strokeWidth={2} />
          </a>
        </li>
        <li>
          <a href="https://twitter.com" target="_blank" title="Twitter">
            <BrandTwitter size={24} strokeWidth={2} />
          </a>
        </li>
      </ol>
      <ol className="menu" id="main-menu">
        <li className="current">
          <a href="/">
            <Home size={24} strokeWidth={2} />
            <span>Home</span>
          </a>
        </li>
        <li>
          <a href="/about/">
            <User size={24} strokeWidth={2} />
            <span>About</span>
          </a>
        </li>
        <li>
          <a href="/archives/">
            <Archive size={24} strokeWidth={2} />
            <span>Archives</span>
          </a>
        </li>
        <li>
          <a href="/search/">
            <Search size={24} strokeWidth={2} />
            <span>Search</span>
          </a>
        </li>
        <li>
          <a href="/links/">
            <Link size={24} strokeWidth={2} />
            <span>Links</span>
          </a>
        </li>
        <div className="menu-bottom-section">
          <li id="i18n-switch">
            <Language size={24} strokeWidth={2} />
            <select
              name="language"
              onchange="window.location.href = this.selectedOptions[0].value"
            >
              <option value="http://localhost:1313/" selected="">
                English
              </option>
              <option value="http://localhost:1313/zh-cn/">中文</option>
              <option value="http://localhost:1313/ar/">عربي</option>
            </select>
          </li>
          <li id="dark-mode-toggle">
            <ToggleLeft size={24} strokeWidth={2} />
            <ToggleRight size={24} strokeWidth={2} />
            <span>Dark Mode</span>
          </li>
        </div>
      </ol>
    </aside>
  );
};

export default SidebarLeft;

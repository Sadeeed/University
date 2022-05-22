import {
  Archive,
  BrandGithub,
  BrandTwitter,
  Home,
  Language,
  Search,
  ToggleLeft,
  ToggleRight,
  User,
} from "tabler-icons-react";

import { default as TablerLink } from "tabler-icons-react/dist/icons/link";

import { Link } from "react-router-dom";

import default_avatar from "../../assets/images/avatar_default.png";

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
          <Link to="/">
            <img
              src={default_avatar}
              className="site-logo"
              loading="lazy"
              alt="Avatar"
              width={300}
              height={300}
            />
          </Link>
          <span className="emoji">🍥</span>
        </figure>
        <div className="site-meta">
          <h1 className="site-name">
            <Link to="/">Example Site</Link>
          </h1>
          <h2 className="site-description">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
          </h2>
        </div>
      </header>
      <ol className="social-menu">
        <li>
          <a
            href="https://github.com/Sadeeed"
            target="_blank"
            title="GitHub"
            rel="noreferrer"
          >
            <BrandGithub size={24} strokeWidth={2} />
          </a>
        </li>
        <li>
          <a
            href="https://twitter.com/icesoop"
            target="_blank"
            title="Twitter"
            rel="noreferrer"
          >
            <BrandTwitter size={24} strokeWidth={2} />
          </a>
        </li>
      </ol>
      <ol className="menu" id="main-menu">
        <li className="current">
          <Link to="/">
            <Home size={24} strokeWidth={2} />
            <span>Home</span>
          </Link>
        </li>
        <li>
          <Link to="/about/">
            <User size={24} strokeWidth={2} />
            <span>About</span>
          </Link>
        </li>
        <li>
          <Link to="/archives/">
            <Archive size={24} strokeWidth={2} />
            <span>Archives</span>
          </Link>
        </li>
        <li>
          <Link to="/search/">
            <Search size={24} strokeWidth={2} />
            <span>Search</span>
          </Link>
        </li>
        <li>
          <Link to="/links/">
            <TablerLink size={24} strokeWidth={2} />
            <span>Links</span>
          </Link>
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

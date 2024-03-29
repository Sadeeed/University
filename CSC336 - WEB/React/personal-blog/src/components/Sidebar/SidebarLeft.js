import {
  Archive,
  BrandGithub,
  BrandTwitter,
  Edit,
  Home,
  Language,
  Search,
  ToggleLeft,
  ToggleRight,
  User,
} from "tabler-icons-react";

import { default as TablerLink } from "tabler-icons-react/dist/icons/link";

import { Link, useLocation } from "react-router-dom";

import default_avatar from "../../assets/images/avatars/avatar_default.png";
import user_avatar from "../../assets/images/avatars/avatar_sadeed.jpg";


function toggleDarkMode(){
  const elmt = document.documentElement
  const current_theme = elmt.dataset.scheme
  current_theme === "dark" ? elmt.dataset.scheme = "light" : elmt.dataset.scheme = "dark"
}

const SidebarLeft = (props) => {

  const location = useLocation()
  const path = location.pathname

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
              src={user_avatar}
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
            <Link to="/">Sadeed's Blog</Link>
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
        <li className={ path === "/" ? "current" : ""}>
          <Link to="/">
            <Home size={24} strokeWidth={2} />
            <span>Home</span>
          </Link>
        </li>
        <li className={ path === "/about/" ? "current" : ""}>
          <Link to="/about/">
            <User size={24} strokeWidth={2} />
            <span>About</span>
          </Link>
        </li>
        <li className={ path === "/archives/" ? "current" : ""}>
          <Link to="/archives/">
            <Archive size={24} strokeWidth={2} />
            <span>Archives</span>
          </Link>
        </li>
        <li className={ path === "/search/" ? "current" : ""}>
          <Link to="/search/">
            <Search size={24} strokeWidth={2} />
            <span>Search</span>
          </Link>
        </li>
        <li className={ path === "/signup/" ? "current" : ""}>
          <Link to="/signup/">
            <TablerLink size={24} strokeWidth={2} />
            <span>Signup</span>
          </Link>
        </li>
        <div className="menu-bottom-section">
          {/* <li id="i18n-switch">
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
          </li> */}
          <li id="dark-mode-toggle" onClick={toggleDarkMode}>
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

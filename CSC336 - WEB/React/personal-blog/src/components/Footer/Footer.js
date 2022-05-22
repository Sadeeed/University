import { Link } from "react-router-dom";

function Footer(props) {
  return (
    <footer className="site-footer">
      <section className="copyright">© 2021 - 2022 Sadeed</section>
      <section className="powerby">
        Based on{" "}
        <Link to="https://gohugo.io/" target="_blank" rel="noopener">
          Hugo
        </Link>{" "}
        Theme{" "}
        <b>
          <Link
            to="https://github.com/CaiJimmy/hugo-theme-stack"
            target="_blank"
            rel="noopener"
            data-version="3.11.0"
          >
            Stack
          </Link>
        </b>{" "}
        <br/>
        Ported by{" "}
        <Link to="https://github.com/Sadeeed" target="_blank" rel="noopener">
          Sadeed
        </Link>
      </section>
    </footer>
  );
}

export default Footer;

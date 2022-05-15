function Footer(props) {
  return (
    <footer className="site-footer">
      <section className="copyright">© 2020 - 2022 Example Site</section>
      <section className="powerby">
        Built with{" "}
        <a href="https://gohugo.io/" target="_blank" rel="noopener">
          Hugo
        </a>{" "}
        <br />
        Theme{" "}
        <b>
          <a
            href="https://github.com/CaiJimmy/hugo-theme-stack"
            target="_blank"
            rel="noopener"
            data-version="3.11.0"
          >
            Stack
          </a>
        </b>{" "}
        designed by{" "}
        <a href="https://jimmycai.com" target="_blank" rel="noopener">
          Jimmy
        </a>
      </section>
    </footer>
  );
}

export default Footer;

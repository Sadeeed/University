import { Link } from "react-router-dom";
import { CalendarTime, Clock, Copyright, Language } from "tabler-icons-react";
import c1 from "../../assets/images/card-header.jpg";

const MainArticle = (props) => {
  return (
    <article className="has-image main-article">
      <header className="article-header">
        <div className="article-image">
          <Link to="/p/placeholder-text/">
            <img src={c1} alt="" width={800} height={533} />
          </Link>
        </div>
        <div className="article-details">
          <header className="article-category">
            <Link
              to="/categories/test/"
              style={{ backgroundColor: "#2a9d8f", color: "#fff" }}
            >
              Test
            </Link>
            <Link to="/categories/test-with-whitespaces/">
              Test with whitespaces
            </Link>
          </header>
          <div className="article-title-wrapper">
            <h2 className="article-title">
              <Link to="/p/placeholder-text/">Placeholder Text</Link>
            </h2>
            <h3 className="article-subtitle">Lorem Ipsum Dolor Si Amet</h3>
          </div>
          <footer className="article-time">
            <div>
              <CalendarTime size={24} strokeWidth={2} />
              <time className="article-time--published">Mar 09, 2019</time>
            </div>
            <div>
              <Clock size={24} strokeWidth={2} />
              <time className="article-time--reading">2 minute read</time>
            </div>
          </footer>
        </div>
      </header>
      <section className="article-content">
        <p>Lorem est tota propiore conpellat pectoribus de pectora summo.</p>
        <p>
          Redit teque digerit hominumque toris verebor lumina non cervice subde
          tollit usus habet Arctonque, furores quas nec ferunt. Quoque montibus
          nunc caluere tempus inhospita parcite confusaque translucet patri
          vestro qui optatis lumine cognoscere flos nubis! Fronde ipsamque
          patulos Dryopen deorum.
        </p>
        <ol>
          <li>Exierant elisi ambit vivere dedere</li>
          <li>Duce pollice</li>
          <li>Eris modo</li>
          <li>Spargitque ferrea quos palude</li>
        </ol>
        <p>
          Rursus nulli murmur; hastile inridet ut ab gravi sententia! Nomine
          potitus silentia flumen, sustinet placuit petis in dilapsa erat sunt.
          Atria tractus malis.
        </p>
        <ol>
          <li>Comas hunc haec pietate fetum procerum dixit</li>
          <li>Post torum vates letum Tiresia</li>
          <li>Flumen querellas</li>
          <li>Arcanaque montibus omnes</li>
          <li>Quidem et</li>
        </ol>
        <h1 id="vagus-elidunt">Vagus elidunt</h1>
        <p></p>
        <p>
          <Link
            className="link"
            to="https://en.wikipedia.org/wiki/Canons_of_page_construction#Van_de_Graaf_canon"
            target="_blank"
            rel="noopener"
          >
            The Van de Graaf Canon
          </Link>
        </p>
        <h2 id="mane-refeci-capiebant-unda-mulcebat">
          Mane refeci capiebant unda mulcebat
        </h2>
        <p>
          Victa caducifer, malo vulnere contra dicere aurato, ludit regale,
          voca! Retorsit colit est profanae esse virescere furit nec; iaculi
          matertera et visa est, viribus. Divesque creatis, tecta novat
          collumque vulnus est, parvas. <strong>Faces illo pepulere</strong>{" "}
          tempus adest. Tendit flamma, ab opes virum sustinet, sidus sequendo
          urbis.
        </p>
        <p>
          Iubar proles corpore raptos vero auctor imperium; sed et huic: manus
          caeli Lelegas tu lux. Verbis obstitit intus oblectamina fixis
          linguisque ausus sperare Echionides cornuaque tenent clausit possit.
          Omnia putatur. Praeteritae refert ausus; ferebant e primus lora nutat,
          vici quae mea ipse. Et iter nil spectatae vulnus haerentia iuste et
          exercebat, sui et.
        </p>
        <p>
          Eurytus Hector, materna ipsumque ut Politen, nec, nate, ignari, vernum
          cohaesit sequitur. Vel <strong>mitis temploque</strong> vocatus, inque
          alis, <em>oculos nomen</em> non silvis corpore coniunx ne displicet
          illa. Crescunt non unus, vidit visa quantum inmiti flumina mortis
          facto sic: undique a alios vincula sunt iactata abdita! Suspenderat
          ego fuit tendit: luna, ante urbem Propoetides <strong>parte</strong>.
        </p>
      </section>
      <footer className="article-footer">
        <section className="article-tags">
          <Link to="/tags/markdown/">markdown</Link>
          <Link to="/tags/text/">text</Link>
          <Link to="/tags/tag-with-whitespaces/">tag with whitespaces</Link>
        </section>
        <section className="article-copyright">
          <Copyright size={24} strokeWidth={2} />
          <span>Licensed under CC BY-NC-SA 4.0</span>
        </section>
      </footer>
    </article>
  );
};

export default MainArticle;

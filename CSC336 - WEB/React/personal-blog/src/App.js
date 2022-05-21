import { Routes, Route } from "react-router-dom";
import "./assets/css/css2.css";
import "./assets/css/style.css";
import AboutPage from "./views/About/AboutPage";
import ArchivePage from "./views/Archives/ArchivePage";
import LandingPage from "./views/LandingPage/LandingPage";
import SearchPage from "./views/Search/SearchPage";

function App() {
  return (
    <Routes>
      <Route index element={<LandingPage />} />
      <Route path="/about" element={<AboutPage />} />
      <Route path="/archives" element={<ArchivePage />} />
      <Route path="/search" element={<SearchPage />} />
    </Routes>
  );
}

export default App;

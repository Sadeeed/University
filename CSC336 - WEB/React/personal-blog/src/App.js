import { Routes, Route } from "react-router-dom";
import "./assets/css/css2.css";
import "./assets/css/style.css";
import AboutPage from "./views/About/AboutPage";
import LandingPage from "./views/LandingPage/LandingPage";

function App() {
  return (
    <Routes>
      <Route index element={<LandingPage />} />
      <Route path="/about" element={<AboutPage />} />
    </Routes>
  );
}

export default App;

import { Routes, Route } from "react-router-dom";
// import DefaultForm from "./components/Forms/DefaultForm.js";
import "bootstrap/dist/css/bootstrap.css";
// import Landing from "./views/Landing/Landing.js";
import Layout from "./views/Layout/Layout.js";
import Layout2 from "./views/Layout/Layout2.js";
import Layout3 from "./views/Layout/Layout3.js";

function App() {
  return (
    <Routes>
      <Route index element={<Layout />}></Route>
      <Route path="/products" element={<Layout2 />}></Route>
      <Route path="/services" element={<Layout3 />}></Route>
    </Routes>
  );
}

export default App;

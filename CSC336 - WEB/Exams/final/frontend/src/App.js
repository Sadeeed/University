import { Routes, Route } from "react-router-dom";
// import DefaultForm from "./components/Forms/DefaultForm.js";
import "bootstrap/dist/css/bootstrap.css";
import Landing from './views/Landing/Landing.js'

function App() {
  return (
    <Routes>
      <Route index element={<Landing/>}></Route>
    </Routes>
  );
}

export default App;

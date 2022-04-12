import { Outlet } from "react-router-dom";
import PostCard from "./components/PostCard/PostCard";

function App() {
  return (
    <div className="App">
      <PostCard/>
      <Outlet/>
    </div>
  );
}

export default App;

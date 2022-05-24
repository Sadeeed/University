import { useState } from "react";
import MDEditor from "@uiw/react-md-editor";
import rehypeSanitize from "rehype-sanitize";
import Footer from "../../components/Footer/Footer";
import SidebarLeft from "../../components/Sidebar/SidebarLeft";

const EditPage = (props) => {
  const [value, setValue] = useState("**Hello world!!!**");

  return (
    <div className="container main-container flex on-phone--column extended">
      <SidebarLeft />
      <main className="main full-width">
        <MDEditor
          visiableDragbar={false}
          height={300}
          preview={"edit"}
          value={value}
          onChange={setValue}
          previewOptions={{
            rehypePlugins: [[rehypeSanitize]],
          }}
        />
        <button
          type="button"
          className="submit-button"
          onClick={() => {
            alert(value);
          }}
        >
          Submit
        </button>
        <Footer />
      </main>
    </div>
  );
};

export default EditPage;

import { useCallback } from "react";
import { Wysimark, useEditor } from "@wysimark/react";

const EditPage = () => {
  const editor = useEditor({ initialMarkdown: "# Hamburgers" });
  const onClick = useCallback(() => alert(editor.getMarkdown()), []);

  return (
    <div>
      <Wysimark editor={editor} />
      <button onClick={onClick}>Show Markdown</button>
    </div>
  );
};

export default EditPage;

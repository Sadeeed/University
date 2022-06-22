import express from "express";
import { getStudents, addStudent } from "../controllers/studentControllers.js";

const router = express.Router();

router.get("/get", getStudents)
router.post("/add", addStudent)

// router.get("/", getPosts);

// router.get("/p/:slug", getPost);

// router.post("/n", authenticate(), newPost);

// router.put("/e/:slug", authenticate(), editPost);

// router.delete("/d/:slug", authenticate(), deletePost);

export default router;

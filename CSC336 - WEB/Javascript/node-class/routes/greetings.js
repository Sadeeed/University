import express from "express";
import { homeRouteController } from "../controller/home.js";

const router = express.Router();

router.get('/',homeRouteController);

export default router;


import mongoose from "mongoose";
import express from "express";
import bodyParser from "body-parser";
import cors from "cors";
import router from "./routes/greetings.js";

const app = express();

app.use(cors());
app.use(bodyParser.json());

app.use('/', router);


// const key = "mongodb+srv://umersharif:412umers@umersharif.ejwyl.mongodb.net/?retryWrites=true&w=majority"
// const uri = 'mongodb://127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000'
// mongoose.connect(uri,  { useNewUrlParser: true, useUnifiedTopology: true}).then(() => console.log('connected'))

app.listen(5000);












// import express from 'express';

// const app = express();

// app.get("/", (req, res) => {
//     res.send("Welcome from Express!");
// });

// app.get("/faculty", (req, res) => {
//     res.send("Welcome to Faculty page!");
// });
// app.get("/faculty/department", (req,res)=>{
//     res.send("Welcome to Computer Engineering Department!");
// });


app.get("/faculty/department/:name/:speciality/:level", (req, res) => {
    res.send(req.params.level);
});

// app.get("/faculty", (req, res) => {
//     res.send(req.query); 
// });










// app.listen(3000);




















// // import http from 'http';

// // const server = http.createServer((req, res) => {

// //     if (req.url === '/') {
// //         res.write("Core Node JS module.");
// //         res.end();
// //     }
// // });

// // server.listen(3000);












// import { greet } from './app.js';

// greet();

// // const result = require('./app');

// // result.greet();
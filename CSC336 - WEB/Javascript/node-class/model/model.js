import mongoose from "mongoose";

const structure = mongoose.Schema({
    studentName: String, 
    semester: Number
});

const studentTable = mongoose.model('student', structure);

export default studentTable;
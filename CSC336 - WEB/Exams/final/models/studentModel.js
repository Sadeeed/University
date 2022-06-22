import mongoose from "mongoose";

const studentSchema = mongoose.Schema({
    name:String,
    email:String,
    rollNo:String,
    gender:String
});

const studentModel = mongoose.model("student", studentSchema);

export default studentModel;

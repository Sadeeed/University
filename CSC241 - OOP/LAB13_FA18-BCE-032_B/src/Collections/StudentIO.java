package Collections;

import java.util.PriorityQueue;

public class StudentIO {

    protected PriorityQueue<Student> addStudents(){

        PriorityQueue<Student> studentQueue = new PriorityQueue<>();

        studentQueue.add(new Student("Ali",8,3.0));
        studentQueue.add(new Student("Farhan",112,3.2));
        studentQueue.add(new Student("Ahmed",34,3.4));
        studentQueue.add(new Student("Kazim",43,3.7));
        studentQueue.add(new Student("Abubakar",55,3.5));

        return studentQueue;
    }

    public void printQueue(){
        PriorityQueue<Student> studentQueue = addStudents();
//        System.out.println(studentQueue);
        while (!studentQueue.isEmpty())
        {
            System.out.println(studentQueue.poll());
        }

    }

}

package Collections;

public class Student implements Comparable<Student>{

    private String name;
    private Integer rollNo;
    private Double cgpa;

    public Student(String studentName, Integer rollNo, Double studentCGPA){
        setName(studentName);
        setRollNo(rollNo);
        setCgpa(studentCGPA);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public int compareTo(Student st) {
        return st.getCgpa().compareTo(this.getCgpa());
    }

    @Override
    public String toString() {
        return "(" +
                "Name: " + name +
                ", RollNo: " + rollNo +
                ", CGPA: " + cgpa +
                ')';
    }
}

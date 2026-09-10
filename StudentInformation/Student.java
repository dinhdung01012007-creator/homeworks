package Lec08.StudentInformation;

public class Student {
    private String studentID;
    private String fullname;
    private String major;

    public Student (String studentID, String fullname, String major) {
        this.studentID = studentID;
        this.fullname = fullname;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println(studentID + " - " + fullname + " - " + major);
    }
}

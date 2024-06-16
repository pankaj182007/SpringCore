package org.example;

public class Student {

    private String studentName;
    private int studentId;
    private String studentAddress;

    public Student(String studentName, int studentId, String studentAddress) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        System.out.println("-----------------Student-------------------");
        return  '\n' +" studentId=" + studentId +
               '\n'+ " studentName=" + studentName + '\n' +
                " studentAddress=" + studentAddress + '\n'
                ;
    }



}

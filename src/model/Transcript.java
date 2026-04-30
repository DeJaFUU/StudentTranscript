package model;

import java.util.ArrayList;

public class Transcript{

private final String name;
private final int id;
private final ArrayList<String> courseList;
private final ArrayList<Double> gradeList;

    public Transcript(String studentName, int studentID){
        this.name = studentName;
        this.id  = studentID;
        this.courseList = new ArrayList<String>();
        this.gradeList = new ArrayList<Double>();
    }

    public String getStudentName(){
        return this.name;
    }

    public ArrayList<Double> getGradeList() {
        return this.gradeList;
    }

    public boolean addGrade(String course, double grade){
        return addCourseList(course) && addGradeList(grade);
    }

    public Boolean addGradeList(Double grade) {
        return this.gradeList.add(grade);
    }

    public double getGPA(){
        Double total = 0.0;
         for (Double v : this.gradeList){
            total += v;
        }
        return total / this.gradeList.toArray().length;
    }

    public ArrayList<String> getCourseList() {
        return this.courseList;
    }

    public boolean addCourseList(String courseName) {
        return this.courseList.add(courseName);
    }

    public void printTranscript(){
        String firstLine = "";
        firstLine.concat(this.getStudentName() +":");
        for (int i = 0; i < this.gradeList.toArray().length; i++) {
            firstLine = firstLine+(" "+this.courseList.get(i));
            firstLine = firstLine+(": "+this.gradeList.get(i).toString()+",");
        }
        System.out.println(firstLine);
        System.out.println("GPA is: " +this.getGPA());
    }
}

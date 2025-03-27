package com.universityManagementSystem;

//Exam-based course
public class ExamCourse extends CourseType {
 private int examWeightage; // Percentage of final grade from exams

 public ExamCourse(String courseName, String instructor, int examWeightage) {
     super(courseName, instructor);
     this.examWeightage = examWeightage;
 }

 public int getExamWeightage() {
     return examWeightage;
 }

 @Override
 public String toString() {
     return super.toString() + " [Exam Weightage: " + examWeightage + "%]";
 }
}

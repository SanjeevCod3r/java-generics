package com.universityManagementSystem;

//Assignment-based course
public class AssignmentCourse extends CourseType {
 private int numberOfAssignments;

 public AssignmentCourse(String courseName, String instructor, int numberOfAssignments) {
     super(courseName, instructor);
     this.numberOfAssignments = numberOfAssignments;
 }

 public int getNumberOfAssignments() {
     return numberOfAssignments;
 }

 @Override
 public String toString() {
     return super.toString() + " [Assignments: " + numberOfAssignments + "]";
 }
}


package com.universityManagementSystem;

import java.util.List;

//Utility class with wildcard method to display any type of course
public class CourseUtil {
 public static void displayCourses(List<? extends CourseType> courses) {
     for (CourseType course : courses) {
         System.out.println(course);
     }
 }
}

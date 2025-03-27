package com.universityManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Generic catalog to store multiple types of courses
public class CourseCatalog<T extends CourseType> {
    private List<Course<T>> courses = new ArrayList<>();

    public void addCourse(Course<T> course) {
        courses.add(course);
    }

    public List<Course<T>> getCourses() {
        return courses;
    }
}

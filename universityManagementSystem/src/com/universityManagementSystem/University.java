package com.universityManagementSystem;

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CourseCatalog<ExamCourse> examCourseCatalog = new CourseCatalog<>();
	        examCourseCatalog.addCourse(new Course<>(new ExamCourse("Mathematics", "Dr. Smith", 70)));
	        examCourseCatalog.addCourse(new Course<>(new ExamCourse("Physics", "Dr. Brown", 60)));

	        CourseCatalog<AssignmentCourse> assignmentCourseCatalog = new CourseCatalog<>();
	        assignmentCourseCatalog.addCourse(new Course<>(new AssignmentCourse("Programming", "Prof. Johnson", 5)));
	        assignmentCourseCatalog.addCourse(new Course<>(new AssignmentCourse("Marketing", "Dr. Adams", 4)));

	        CourseCatalog<ResearchCourse> researchCourseCatalog = new CourseCatalog<>();
	        researchCourseCatalog.addCourse(new Course<>(new ResearchCourse("AI Research", "Dr. White", "Deep Learning")));
	        researchCourseCatalog.addCourse(new Course<>(new ResearchCourse("Quantum Computing", "Dr. Green", "Quantum Algorithms")));

	        // Displaying courses using wildcard method
	        System.out.println("Exam-Based Courses:");
	        CourseUtil.displayCourses(examCourseCatalog.getCourses().stream().map(Course::getCourseType).toList());

	        System.out.println("\nAssignment-Based Courses:");
	        CourseUtil.displayCourses(assignmentCourseCatalog.getCourses().stream().map(Course::getCourseType).toList());

	        System.out.println("\nResearch-Based Courses:");
	        CourseUtil.displayCourses(researchCourseCatalog.getCourses().stream().map(Course::getCourseType).toList());
	    }
	}

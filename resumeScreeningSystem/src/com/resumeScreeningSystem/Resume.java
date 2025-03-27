package com.resumeScreeningSystem;

//Generic class for processing resumes
public class Resume<T extends JobRole> {
 private T jobRole;

 public Resume(T jobRole) {
     this.jobRole = jobRole;
 }

 public T getJobRole() {
     return jobRole;
 }

 @Override
 public String toString() {
     return jobRole.toString();
 }
}
	
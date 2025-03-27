package com.resumeScreeningSystem;

import java.util.List;

//Utility class for screening resumes
public class ResumeProcessor {
 public static void screenResumes(List<? extends JobRole> resumes) {
     System.out.println("Screening Resumes...");
     for (JobRole resume : resumes) {
         System.out.println(resume + " -> " + (resume.meetsCriteria() ? "Accepted" : "Rejected"));
     }
 }
}


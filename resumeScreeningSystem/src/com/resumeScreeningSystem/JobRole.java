package com.resumeScreeningSystem;

//Abstract class for job roles
public abstract class JobRole {
 private String candidateName;
 private int experienceYears;
 
 public JobRole(String candidateName, int experienceYears) {
     this.candidateName = candidateName;
     this.experienceYears = experienceYears;
 }

 public String getCandidateName() {
     return candidateName;
 }

 public int getExperienceYears() {
     return experienceYears;
 }

 public abstract boolean meetsCriteria(); // Each role defines its own criteria

 @Override
 public String toString() {
     return candidateName + " (Experience: " + experienceYears + " years)";
 }
}


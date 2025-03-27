package com.resumeScreeningSystem;

//Data Scientist role
public class DataScientist extends JobRole {
 private int machineLearningProjects; // Number of ML projects completed

 public DataScientist(String candidateName, int experienceYears, int machineLearningProjects) {
     super(candidateName, experienceYears);
     this.machineLearningProjects = machineLearningProjects;
 }

 public int getMachineLearningProjects() {
     return machineLearningProjects;
 }

 @Override
 public boolean meetsCriteria() {
     return getExperienceYears() >= 3 && machineLearningProjects >= 2;
 }

 @Override
 public String toString() {
     return super.toString() + " [Data Scientist, ML Projects: " + machineLearningProjects + "]";
 }
}

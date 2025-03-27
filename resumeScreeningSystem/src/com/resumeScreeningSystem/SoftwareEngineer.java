package com.resumeScreeningSystem;

//Software Engineer role
public class SoftwareEngineer extends JobRole {
 private int codingSkillRating; // Rating out of 10

 public SoftwareEngineer(String candidateName, int experienceYears, int codingSkillRating) {
     super(candidateName, experienceYears);
     this.codingSkillRating = codingSkillRating;
 }

 public int getCodingSkillRating() {
     return codingSkillRating;
 }

 @Override
 public boolean meetsCriteria() {
     return getExperienceYears() >= 2 && codingSkillRating >= 7;
 }

 @Override
 public String toString() {
     return super.toString() + " [Software Engineer, Coding Skill: " + codingSkillRating + "/10]";
 }
}

package com.resumeScreeningSystem;

//Product Manager role
public class ProductManager extends JobRole {
 private int leadershipExperience; // Leadership experience in years

 public ProductManager(String candidateName, int experienceYears, int leadershipExperience) {
     super(candidateName, experienceYears);
     this.leadershipExperience = leadershipExperience;
 }

 public int getLeadershipExperience() {
     return leadershipExperience;
 }

 @Override
 public boolean meetsCriteria() {
     return getExperienceYears() >= 5 && leadershipExperience >= 2;
 }

 @Override
 public String toString() {
     return super.toString() + " [Product Manager, Leadership: " + leadershipExperience + " years]";
 }
}

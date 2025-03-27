package com.resumeScreeningSystem;
import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<SoftwareEngineer> softwareEngineerResumes = new ArrayList<>();
	        softwareEngineerResumes.add(new SoftwareEngineer("Alice", 3, 8));
	        softwareEngineerResumes.add(new SoftwareEngineer("Bob", 1, 9));

	        List<DataScientist> dataScientistResumes = new ArrayList<>();
	        dataScientistResumes.add(new DataScientist("Charlie", 4, 3));
	        dataScientistResumes.add(new DataScientist("David", 2, 1));

	        List<ProductManager> productManagerResumes = new ArrayList<>();
	        productManagerResumes.add(new ProductManager("Eve", 6, 3));
	        productManagerResumes.add(new ProductManager("Frank", 4, 1));

	        // Screening resumes dynamically using a wildcard method
	        System.out.println("Software Engineer Resumes:");
	        ResumeProcessor.screenResumes(softwareEngineerResumes);

	        System.out.println("\nData Scientist Resumes:");
	        ResumeProcessor.screenResumes(dataScientistResumes);

	        System.out.println("\nProduct Manager Resumes:");
	        ResumeProcessor.screenResumes(productManagerResumes);

	}

}

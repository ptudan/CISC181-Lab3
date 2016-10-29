import java.util.Arrays;

import javax.swing.JOptionPane;

public class student {
	private String name;
	private int[] labs = {0, 0, 0, 0, 0};
	private int[] tests = {0, 0, 0};
	private char grade = 'F';
	private int labsCompleted = 0;
	private int testsCompleted = 0;
	
	public student(int[] newLabs, int[] newTests, int newLabC, int newTestsC){
		name = JOptionPane.showInputDialog("Enter Student Name: ");
		labs = newLabs;
		tests = newTests;
		labsCompleted = newLabC;
		testsCompleted = newTestsC;
		grade = calcGrade();
	}
	
	public String toString(){
		return("Student: "+name+" Lab Grades: "+Arrays.toString(labs)+
				" Test Grades: "+Arrays.toString(tests)+" Current Grade: "+grade);
	}
	
	private char calcGrade(){
		double totalLabs = 0;
		for(int i : labs){
			totalLabs += i;
		}
		double totalTests = 0;
		for(int i : tests){
			totalTests += i;
		}
		
		double g = ((0.45*(totalLabs/labsCompleted))+(0.55*(totalTests/testsCompleted)));
		if(g>=90){
			return 'A';
		}
		else if(g>=80){
			return 'B';
		}
		else if(g>=70){
			return 'C';
		}
		else if(g>=60){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	
	public void addLab(){
		labs[labsCompleted] = Integer.parseInt(JOptionPane.showInputDialog
				("Enter a new Lab Grade: "));
		labsCompleted += 1;
		grade = calcGrade();
	}
	
	public void addTest(){
		tests[testsCompleted] = Integer.parseInt(JOptionPane.showInputDialog
				("Enter a new Test Grade: "));
		testsCompleted += 1;
		grade = calcGrade();
	}

}

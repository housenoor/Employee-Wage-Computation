package Assignmnt1;

import java.util.Scanner;

public class UC6_EmpWageMax {
	
	//declare static variable
	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HR = 20;	
     public static final int NUM_WORKING_DAYS = 20;
     public static final int MAX_WORKING_HRS = 100;
     public static int totalEmpHrs;
     public static int computEmpWage(){
    	 return totalEmpHrs = 0;
     }
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter total working hours");
	    int workingHrs = sc.nextInt();
	    
		System.out.println("Enter wages per hours");
	    int wages = sc.nextInt();

		System.out.println("Total working hours" +workingHrs);
		System.out.println("Total working hours" +wages);
		int totalEmpWage = workingHrs * wages;
        System.out.println("Total Employee Salary= " + totalEmpWage);

	}
}

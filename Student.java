package studentdetilLAB;

import java.util.Scanner;

public class Student {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the student");
	String name=sc.next();
	System.out.println("Enter the roll number of student");
	int roll=sc.nextInt();
	System.out.println("Enter the branch");
	char[] branch;
	branch=sc.next().toCharArray();
	System.out.print("Enter student mark:");
	double mark=sc.nextDouble();
	System.out.print("Enter student grade:");
	char grade=sc.next().charAt(0);
	System.out.println("Information of student:");
	System.out.print("Name:"+name+"\nRollnumber:"+roll+"\nStudentmark:"+mark+"\nGrade:"+grade+"\nBranch:");
	for(int i=0;i<branch.length;i++)
	{
		System.out.print(branch[i]);
	}
}}
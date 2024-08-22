package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {
	public static void main(String[] args) {
		Karvenagar k=new Karvenagar();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("------Enter Your Choice For Detsils----- \n"+"1.Course Details\n"+"2.Faculty Details\n"+"3.Batch Details\n"
								+"4.Student Details\n"+"5.View Details\n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				k.addCourse();
				System.out.println("Course Details Added Successfully....!!");
				System.out.println("******************");
				break;
				
			case 2:
				k.addFaculty();
				System.out.println("Faculty Details Added Successfully....!!");
				System.out.println("******************");
				break;
				
			case 3:
				k.addBatch();
				System.out.println("Batch Details Added Successfully....!!");
				System.out.println("******************");
				break;
				
			case 4:
				k.addStudent();
				System.out.println("Student Details Added Successfully....!!");
				System.out.println("******************");
				break;
				
			case 5:
				k.viewStudent();

				System.out.println("Project Details !!");
				System.out.println("******************");
				break;
				
			case 6:
				System.exit(0);
				sc.close();
			default:
				System.out.println("Please Enter Correct Choice..");
				System.out.println("******************");
				break;
				
			}
		}
		
		
	}
}

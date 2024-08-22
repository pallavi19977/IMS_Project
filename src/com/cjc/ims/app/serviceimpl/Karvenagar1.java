package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar1 implements Cjc {
	List<Course>clist=new ArrayList<>();
	Course c=new Course();
	List<Faculty>flist=new ArrayList<>();
	Faculty f=new Faculty();
	List<Batch>blist=new ArrayList<>();
	Batch b=new Batch();
	List<Student>slist=new ArrayList<>();
	Student s=new Student();
	Scanner sc=new Scanner(System.in);
	int count=0;
	int count1=0,count2=0,count3=0;
	@Override
	public void addCourse() {
		System.out.println("Enter Course ID");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course Name");
		c.setCname(sc.next());
		clist.add(c);
		count++;
		}

	@Override
	public void viewCourse() {
		Iterator<Course>itr=clist.iterator();
		while(itr.hasNext())
		{
			Course co=itr.next();
			System.out.println("Course ID: "+co.getCid());
			System.out.println("Course Name: "+co.getCname());

		}
		
	}

	@Override
	public void addFaculty() {
		if(count==1)
		{
		System.out.println("Enter Faculty ID");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty Name");
		f.setFname(sc.next());
		f.setCourse(c);
		flist.add(f);
		}
	}

	@Override
	public void viewFaculty() {
		Iterator<Faculty>itr1=flist.iterator();
		while(itr1.hasNext())
		{
			Faculty fa=itr1.next();
			System.out.println("Faculty ID: "+fa.getFid());
			System.out.println("Faculty Name: "+fa.getFname());
			System.out.println("Course ID: "+fa.getCourse().getCid());
			System.out.println("Course Name: "+fa.getCourse().getCname());

		}
		
	}

	@Override
	public void addBatch() {
	System.out.println("Enter Batch ID");
	b.setBid(sc.nextInt());
	System.out.println("Enter Batch Name");
	b.setBname(sc.next());
	b.setFaculty(f);
	blist.add(b);
	}

	@Override
	public void viewBatch() {
		Iterator<Batch>itr2=blist.iterator();
		while(itr2.hasNext())
		{
			Batch ba=itr2.next();
			System.out.println("Batch ID: "+ba.getBid());
			System.out.println("Batch Name: "+ba.getBname());
			System.out.println("Faculty ID: "+ba.getFaculty().getFid());
			System.out.println("Faculty Name: "+ba.getFaculty().getFname());
			System.out.println("Course ID: "+ba.getFaculty().getCourse().getCid());
			System.out.println("Course Name: "+ba.getFaculty().getCourse().getCname());

		}
		
	}

	@Override
	public void addStudent() {
	System.out.println("Enter Student ID"); 
	s.setSid(sc.nextInt());	
	System.out.println("Enter Student Name");
	s.setSname(sc.next());
	s.setBatch(b);
	slist.add(s);
}

	@Override
	public void viewStudent() {
		Iterator<Student>itr=slist.iterator();
		while(itr.hasNext())
		{
			Student st=itr.next();
			System.out.println("Student ID: "+st.getSid());
			System.out.println("Student Name: "+st.getSname());
			System.out.println(" Batch ID: "+st.getBatch().getBid());
			System.out.println("Batch Name: "+st.getBatch().getBname());
			System.out.println("Faculty ID: "+st.getBatch().getFaculty().getFid());
			System.out.println("Faculty Name: "+st.getBatch().getFaculty().getFname());
			System.out.println("Course ID: "+st.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Course Name: "+st.getBatch().getFaculty().getCourse().getCname());
		}
		
	}
	
}


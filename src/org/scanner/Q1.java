package org.scanner;

import java.util.Scanner;

public class Q1
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your Id :  ");
	Short Id =s.nextShort();
	System.out.println("Employee Id:  " +Id);

	System.out.println("Enter your Name :  ");
	String Name =s.next();
	System.out.println("Employee Name:  " +Name);

	System.out.println("Enter your Email :  ");
	String Email=s.next();
	System.out.println("Employee Email:  " +Email);

	System.out.println("Enter your PhoneNo:  ");
	Long PhoneNo = s.nextLong();
	System.out.println("Employee Phone Number:  "+PhoneNo);

	System.out.println("Enter your Salary:  ");
	int Salary= s.nextInt();
	System.out.println("Employee Salary:  "+Salary);

	System.out.println("Enter your Gender:  ");
	String Gender= s.next();
	System.out.println("Employee Gender:  "+Gender);

	System.out.println("Enter your City :  ");
	String City =s.next();
	System.out.println("Employee City:  " +City);

}}

package org.scanner;

import java.util.Scanner;

public class Q2 
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your Id :  ");
	Short Id =s.nextShort();
	System.out.println("Student Id:  " +Id);
	System.out.println("Enter your Name :  ");
	String Name =s.next();
	System.out.println("Student Name:  " +Name);
	
	System.out.println("Enter Mark 1:  ");
	int a=s.nextInt();
	System.out.println("Enter Mark 2:  ");
	int b=s.nextInt();
	System.out.println("Enter Mark 3:  ");
	int c=s.nextInt();
	System.out.println("Enter Mark 4:  ");
	int d=s.nextInt();
	System.out.println("Enter Mark 5:  ");
	int e=s.nextInt();
	
int Total = a+b+c+d+e;

int Average = Total/5;

System.out.println(" Total Marks =  " + Total);
System.out.println(" Average Marks =  " + Average);


}
}




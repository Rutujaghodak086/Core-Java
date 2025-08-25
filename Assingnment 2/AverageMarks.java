//16.Write a program to accept marks for three subjects and find the total marks secured , average and also display the //class obtained. (Class I – above %, class II – % to %, pass class – % to % and fail otherwise)

import java.util.Scanner;
public class AverageMarks{
	public static void main(String args[]){
		float m1,m2,m3;
		double total,average,percentag;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter marks Subject 1");
		m1=sc.nextFloat();
		System.out.println("Enter marks Subject 2");
		m2=sc.nextFloat();
		System.out.println("Enter marks Subject 3");
		m3=sc.nextFloat();
		
		total=m1+m2+m3;
		average=total/3;
		percentag=(total/300)*100;
		
		System.out.println("Total :"+total);
		System.out.println("Average :"+average);
		System.out.println("Percentage :"+percentag);
		
		if(percentag>85){
			System.out.println("Pass First Class");
		}else if(percentag>70){
			System.out.println("Pass Second Class");
		}else if(percentag>65){
			System.out.println("Pass Thrid class");
		}else if(percentag>=35){
			System.out.println("Pass Forth Class");
		}else{
			System.out.println("Fali");
		}
		

		}
	}
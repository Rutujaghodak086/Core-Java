
//4.Accept radius from the user and write a program having menu with the following options and corresponding actions

import java.util.Scanner;
public class CorrespondingOperation{
	public static void main(String args[]){
		float r;
		double area,Circumference,Volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius :");
		r=sc.nextFloat();
		
		area=Math.PI*r*r;
		Circumference=2*Math.PI*r;
		Volume=(4.0/3.0)*Math.PI*r*r*r;

		System.out.println("Area of Circle is :"+area);
		System.out.println("Circumference of Circle is :"+Circumference);
		System.out.println("Volume of Sphere is :"+Volume);
	}
}
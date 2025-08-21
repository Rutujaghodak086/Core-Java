//The basic salary of an employee is decided at the time of employment, which may be different for different employees. Apart from basic, employee gets 10% //of basic as house rent, 30% of basic as dearness allowance. A professional tax of 5% of basic is deducted from salary. Accept the employee id and basic //salary for an employee and output the take home salary of the employee.

import java.util.Scanner;
public class EmployeeHomeSalary{
	public static void main(String args[]){
		int id,basicSalary;
		double hra,da,tax,homeSalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		id=sc.nextInt();
		System.out.println("Enter a Basic Salary :");
		basicSalary=sc.nextInt();
		hra=0.10*basicSalary;
		da=0.30*basicSalary;
		tax=0.05*basicSalary;
		homeSalary=basicSalary+hra+da-tax;
		System.out.println("Employee Id"+id);
		System.out.println("Employee Salary:"+basicSalary);
		System.out.println("Hous Rent Allowance :"+hra);
		System.out.println("Dearness Allowance :"+da);
		System.out.println("Professional Tax :"+tax);
		System.out.println("Home Salary :"+homeSalary);
	}
	}
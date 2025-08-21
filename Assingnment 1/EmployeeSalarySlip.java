import java.util.Scanner;
public class EmployeeSalarySlip{
	public static void main(String args[]){
	   float da,hra,tax,totalSalary,basicSalary;
	   int id;
	   String name;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Employee Details");
           System.out.println("ID :");
	   id=sc.nextInt();
	   System.out.println("Name:");
	   name=sc.next();
	   name=sc.next();
	   System.out.println("Basic Salary :");
	   basicSalary =sc.nextFloat();
           System.out.println("Total Salary :");
	   totalSalary =sc.nextFloat();
	   System.out.println("DA(%):");
	   da =sc.nextFloat();
	   System.out.println("hra(%):");
	   hra =sc.nextFloat();	
	   System.out.println("Tax (%):");
	   tax =sc.nextFloat();
	   totalSalary=basicSalary+((basicSalary*(da+hra-tax))/100);
	  
	   System.out.println("Total Salary"+totalSalary);
	}
  } 
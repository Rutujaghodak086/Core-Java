import java.util.Scanner;
   public class Calsi{
	public static int Add(int a,int b)
	{
 	   return a+b;
	}
	public static int Sub(int a,int b)
	{
	   return a-b;
	}
	public static int Multi(int a,int b)
	{
	  return a*b;
	}
	public static int Div(int a,int b)
	{
	 return a/b;
	}
	
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numer:");
		a=sc.nextInt(); 
		b=sc.nextInt();
		System.out.println("Addition :"+Add(a,b));
        System.out.println("Subtraction :"+Sub(a,b));
		System.out.println("Multipliction :"+Multi(a,b));
		System.out.println("Division :"+Div(a,b));
	}
   }
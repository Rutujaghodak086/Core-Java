
import java.util.Scanner;
public class ArithmeticHarmonic{
	public static void main(String args[]){
		int a,b;
		double AM,HM;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number :");
		a=sc.nextInt();
		b=sc.nextInt();
		AM=(a+b)/2;
		HM=2*a*b/(a+b);
		System.out.println("Arithmatic Mean :"+AM);
		System.out.println("Harmonic Mean :"+HM);
	}
   }
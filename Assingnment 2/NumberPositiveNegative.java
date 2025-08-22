import java.util.Scanner;
public class NumberPositiveNegative{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		if(n>0)
		System.out.println("Number is Positive ");
		else
		System.out.println("Number is Negative ");
	}
}
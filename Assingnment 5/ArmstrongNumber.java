import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		int arm=0;
		int c=n;
		while(n>0)
		{
			int rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}	
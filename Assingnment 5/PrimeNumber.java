//4.Write a program to print prime numbers between 1 to n.



import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		int cnt=0;	
		for(int i=1;i<=n;i++){
			if(n%i==0)
				cnt++;
		}
		if(cnt==2)
			System.out.println("Number is prime");
		else
			System.out.println("Number is Not Prime");
	}
}

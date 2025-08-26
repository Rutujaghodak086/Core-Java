//31.Write a program to count factors of a given number


import java.util.Scanner;
public class FactorsCount{
	public static void main(String args[]){
		int n,i,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		System.out.println("Factors "+n+"is");
		for(i=1;i<=n;i++)
			if(n%i==0)
				cnt++;
				System.out.println("Count of Factors:"+cnt);
	}
}
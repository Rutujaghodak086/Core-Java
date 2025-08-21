import java.util.Scanner;
public class SwapTempp{
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping \na="+a+"\nb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping \na="+a+"\nb="+b);
	}
  }
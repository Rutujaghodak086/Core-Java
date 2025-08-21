
import java.util.Scanner;
public class SwapTem{
	public static void main(String args[]){
	   int a,b,temp;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Two Number :");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   System.out.println("Before Swapping:\na="+a+"\nb="+b);
	   temp=a;
	   a=b;
	   b=temp;
	   System.out.println("After Swapping: \na="+a+"\nb="+b);
	}
  }
	
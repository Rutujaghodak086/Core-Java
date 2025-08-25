//3.Accept two numbers in variables x and y from the user and perform the following operations

import java.util.Scanner;
public class  OperationVariable{
	public static void main(String args[]){
		int x,y,z,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		x=sc.nextInt();
		System.out.println("Enter Second Number ");
		y=sc.nextInt();
		System.out.println("1.Equality \n 2.Less Than \n 3.Quotient and Remainder \n 4.Range \n 5.Swap \n Enter a choice");
		ch=sc.nextInt();
		switch(ch){
			case 1:
				if(x==y)
					System.out.println("Both are Equal");
				else
					System.out.println("Both are Not Equal");
				break;
			case 2:
				if(x<y)
					System.out.println("X is Less Than Y");
				else
					System.out.println("y is Less Than x");
				break;
			case 3:
				System.out.println("Quotient :"+(x/y));
				System.out.println("Remainder:"+(x%y));
				break;
			case 4:
				System.out.println("Enter a To Check");
				z=sc.nextInt();
				if ((z >= x && z <= y) || (z>= y && z <= x))
					System.out.println(z+"Lies Between"+x+"and"+y);
				else
					System.out.println(z+"Does not lies Between"+x+"and"+y);
				break;
			case 5:
				System.out.println("Before Swapping \nx="+x+"\ny="+y);
				x=x+y;
				y=x-y;
				x=x-y;
				System.out.println("After Swapping\n x="+x+"\ny="+y);
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}

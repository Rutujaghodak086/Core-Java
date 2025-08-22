//Write a program to check whether given number is divisible by 5 and 7? ( with nested if)
import java.util.Scanner;
public class  NumberDivisibalNested{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		if(n%5==0){
			if(n%7==0){
				System.out.println("Number Divisibal by 5 and 7 ");
				}
			else{
				System.out.println("Number Divisible by 5 But Not 7 ");
			}
		}
			else{
				System.out.println("Number is Not Divisible Both ");
			}
		}
	}
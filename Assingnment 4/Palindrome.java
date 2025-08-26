//27.Write a program to check whether given number if palindrome number

import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        int n,sum=0,digit,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        n=sc.nextInt();

        temp=n;
        while(n>0){
            digit=n%10;
            sum=sum*10+digit;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("No is palindrome");
        else
            System.out.println("No is Not palindrome");
}
}

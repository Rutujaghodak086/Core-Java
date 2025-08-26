//16.Write a program to find sum of even numbers from 100 to 200 (or odd numbers)

public class SumEvenOdd100To150{
	public static void main(String args[]){
		int esum=0,osum=0;		
		for(int i=100;i<=150;i++)
			if(i%2==0){
				esum+=i;
			}
			else
				osum+=i;
			System.out.println("Sum of Even Number:"+esum);
			System.out.println("Sum of Odd Number:"+osum);
	}
}
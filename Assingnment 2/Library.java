//18.A library charges a fine for every book returned late. Accept the number of days the member is late, compute and print the fine as follows:(less than //five days Rs fine, for 6 to 10 days Rs. Fine and above 10 days Rs. fine )


import java.util.Scanner;
public class Library{
	public static void main(String args[]){
		int days_late,fine;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many days are late ");
		days_late=sc.nextInt();
		
		if(days_late<5)
			fine=days_late*5;
		else if(days_late< 10)
			fine=days_late*10;
		else
			fine=days_late*15;
		System.out.println("Fine to be paid"+fine);
	}
}
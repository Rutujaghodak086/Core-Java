import java.util.Scanner;
public class PreviousNextCharacter{
	public static void main(String args[]){
		char ch,pre,next;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		ch=sc.next().charAt(0);
		pre=(char)(ch - 1);
		next=(char)(ch+1);
		System.out.println("Previous Character :"+pre);
		System.out.println("Next Character :"+next);
	}
	}
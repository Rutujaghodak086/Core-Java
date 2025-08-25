//8.Accept a lowercase character from the user and check whether the character is a vowel or consonant. (Hint: a,e,i,o,u are vowels)

import java.util.Scanner;
public class VowelOrConsonant{
	public static void main(String args[]){
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character ");
		ch=sc.next().charAt(0);

		if (Character.isLowerCase(ch) && Character.isLetter(ch)) 
		{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println("Is a Vowel ");
		} else 
		{
			System.out.println("Is a Constant ");
		}}
		else
			System.out.println("Invalid Input ");
		}
}
	

// Question : Reverse words

import java.util.Scanner;

public class ReverseWords {
	String reverseWords(String statement)
	{
		String word[]=statement.split(" ");
		String r="";
		for(String s:word)
		{ 
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			r+=sb.toString()+" ";
		}
		return r;
	}
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter input");
	String input=scanner.nextLine();
	ReverseWords s=new ReverseWords();
		System.out.print( "Result: "+s.reverseWords(input));
	
}
}

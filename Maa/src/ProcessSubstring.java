//Question : Process Substring

import java.util.Scanner;

public class ProcessSubstring {
	static int countstring(String input,int n,char c1,char c2)
	{
		int count=0;
		int sumcount=0;
		for(int i=0;i<n;i++)
		{
			if(input.charAt(i)==c1) 
				count++;
				
			if(input.charAt(i)==c2) 
				sumcount +=count;
		}	
			
		for(int l=input.indexOf(c1);l<=input.lastIndexOf(c1);l++)
		{
			if(input.charAt(l)==c1)
			{
		for(int j=input.indexOf(c2);j<=input.lastIndexOf(c2);j++) {
			if(input.charAt(j)==c2) {
				for(int k=l;k<=j;k++)
				{
					System.out.print(input.charAt(k));
				}
			}
			System.out.print("  ");
		}
		
	}
		}
		System.out.println();
		return sumcount;
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String,Start char and End char");
		
		String input=scanner.nextLine();
		char c1=scanner.next().charAt(0);
		char c2=scanner.next().charAt(0);
		int n=input.length();
		System.out.print(countstring(input,n,c1,c2)+"  substrings");
		
	}

}

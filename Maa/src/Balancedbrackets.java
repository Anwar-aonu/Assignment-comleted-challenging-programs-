// Question : Balanced brackets

import java.util.Scanner;

public class Balancedbrackets {
	static String balanced(String input)
	{ String Y="OK";
	  String N="NOT OK";
	 int count=0,count1=0,count3=0,count4=0;
	 int n=input.length();
	 if(n%2==0&&input.charAt(0)!=']')
	 {
		int half=n/2;
		String c=input.substring(0, half);

		char a[]=c.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='[')
				count++;
			else
				count1++;
		}
		String d=input.substring(half,n);
		char b[]=d.toCharArray();
		for(int j=0;j<b.length;j++)
		{
			if(b[j]=='[')
				count3++;
			else
				count4++;
				
		}
if(count==count4&&count1==count3)
			return Y;
		else
			return N;
			
	 }
	 else
		 return N;
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input");
		String input=scanner.nextLine();
		System.out.println(balanced(input));
		
		
		}
	

}

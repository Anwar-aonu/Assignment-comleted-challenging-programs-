// Question : Population Count 

import java.util.Scanner;
public class PopulationCount {
 static int count(int n) {
	int pcount=0;
	while(n>0)
	{
		pcount +=n&1;
		n>>=1;
	}
	return pcount;
}
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter positive input ");
	int input =scanner.nextInt();
	System.out.print("Number "+ input+ " has a population count of "+ count(input));
}
}

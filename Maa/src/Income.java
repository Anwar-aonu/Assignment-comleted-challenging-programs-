// Question : Quick Income Tax Calculator

import java.util.Scanner;

public class Income {
	static Double calculateTax(Double income,int age,Boolean isMale )
	{   
		Double	incometax=0.0;
		if(age<60)
		{
			if(income<=250000)
			
				incometax=((income-0)*0);
		
			else if(income>250000&&income<=500000)
				
				incometax=((income-250000)*0.10);
            
                 else if(income>500000&&income<=1000000)
				
				incometax=((income-500000)*0.20);
                 else
                	 incometax=((income-1000000)*0.30);	 

			}
		else if(age>=60&&age<80)
		{
               if(income<=300000)
				
				incometax= ((income-0)*0);
		
			else if(income>300000&&income<=500000)
				
				incometax= ((income-300000)*0.10);
            
                 else if(income>500000&&income<=1000000)
				
				incometax= ((income-500000)*0.20);
                 else
                	 incometax= ((income-1000000)*0.30);	 

		}
		else
		{
           if(income<=500000)
				
				incometax= ((income-0)*0);
		
			else if(income>500000&&income<=1000000)
				
				incometax=((income-500000)*0.20);
            
                 
                 else
                	 incometax=((income-1000000)*0.30);	 

		}
		
		
		return(incometax);
		
		}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter income,age and true or false");
	Double income=s.nextDouble();
		Integer age=s.nextInt();
	Boolean isMale=s.nextBoolean();
		System.out.println("income tax = "+calculateTax(income,age,isMale));
	}
}
		
			
		
		
		
	


	
	

	
	
	



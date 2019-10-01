// Question : Make my Name 

package ai.anwar.com;
import java.util.Scanner;
import ai.anwar.com.exception.InvalidFormatException;
public class Formet {

	 String makeMyName(String firstName, String middleName, String lastName, String displayFormat) {
		String r = "";
		boolean flag = false;
		char a[] = displayFormat.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'F' && a[i] == a[i] || a[i] == 'M' && a[i] == a[i] || a[i] == 'L' && a[i] == a[i]) {
				flag = true;	
				for (int j = 0; j < a.length; j++) {
					if (a[j] == 'F') 
						r += firstName;
					else if (a[j] == 'M') 
						r += middleName;
					else if (a[j] == 'L') 
						r += lastName;
					else 
						r += a[j];		
				}
				break;
			}
		}
		if(!flag) {
			try {
				throw new InvalidFormatException("As it does not have any of the Name character");
			} catch(InvalidFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return r;

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstName,middleName,lastName and display");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		String input4 = scanner.nextLine();
        Formet f1=new Formet();
		String m = f1.makeMyName(input1, input2, input3, input4);
		System.out.print(m);

	}
}

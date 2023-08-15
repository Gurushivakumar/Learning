package kod1;

import java.util.Scanner;

public class StringJonier {
public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first and last name");
	String firstName=scan.next();
	String lastName=scan.next();
	System.out.println(joinStrings(firstName, lastName));
	
}
public static String joinStrings(String str1, String str2) {
	return str1+str2;
}
}

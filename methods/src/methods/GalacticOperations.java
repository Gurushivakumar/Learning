package methods;
import java.util.Scanner;
public class GalacticOperations {
public staic void main(String [args]) {
	Scanner scan = new scanner(System.in);
	System.out.println("Enter 2 numbers");
	int num1 =scan.nextInt();
	int num2 = scan.nextInt();
}
public static int subtractNumbers(int num1, int num2) {
	return num1-num2;
}

public static int multiplyNumbers(int num1, int num2) {
	return num1*num2;
}

public static double divideNumbers(int num1, int num2) {
	return num1/num2;

}

public static int findRemainder(int num1, int num2) {
	return num1%num2;
}
}

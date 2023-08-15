package javapractice1;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {	
		char operators;
		    int num1;
		    int num2;
		    int res;		   
		    Scanner scan = new Scanner(System.in);		   
		    System.out.println("Choose an operator: +, -, *, or /");
		    operators = scan.next().charAt(0);
		    System.out.println("Enter first number");
		    num1 = scan.nextInt();
		    System.out.println("Enter second number");
		    num2 = scan.nextInt();
		    switch (operators) {		     
		      case '+':
		        res = num1 + num2;
		        System.out.println(num1 + " + " + num2 + " = " + res);
		        break;
		     
		      case '-':
		        res = num1 - num2;
		        System.out.println(num1 + " - " + num2 + " = " + res);
		        break;
		     
		      case '*':
		        res = num1 * num2;
		        System.out.println(num1 + " * " + num2 + " = " + res);
		        break;
		        
		      case '/':
		        res = num1 / num2;
		        System.out.println(num1 + " / " + num2 + " = " + res);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		  }
		
	}



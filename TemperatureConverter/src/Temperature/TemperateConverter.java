package Temperature;

import java.util.Scanner;

public class TemperateConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the temperature in degree-F");
	   double f = scan.nextDouble();
	   TemperateConverter temperatureConverter = new TemperateConverter();
	   
	 double tempincelcius=temperatureConverter.convertFahrenheitTocelsius();
	 System.out.println(tempincelcius);
	}

	private double convertFahrenheitTocelsius() {
		// TODO Auto-generated method stub
		return 0;
	}

	public class FahToCelsius {
		public double convertFahrenheitToCelsius(double fahrenheit) {
			double celcius=(fahrenheit-32)*5/9;
			return celcius;
		}
	}

	
	}
char operator;
operator = scan.next().charAt(0);	
  
package programs;

import java.util.Scanner;

public class TemperatureConverter {

	private static final double tempratureC = 0;
	private static String temprature;
	private static int tempratureF;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in F");
		double temperatureF = scan.nextDouble();
		double temperatureC = convertTemperatureInC(temperatureF);
		System.out.println("Temperature in c = "+temprature);
		scan.close();
	}
	
	private static double convertTemperatureInC(double temperatureF) {
		double temperatureC=((tempratureF - 32)*5)/9;
		
		return tempratureC;
	}
	z
}
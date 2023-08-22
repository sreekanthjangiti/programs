package programs;

import java.util.Scanner;

public class SquareNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		int squareNumber = squareNumber(num);
		System.out.println("The square of given number = " + squareNumber);
	}
	static int squareNumber(int num) {
		return num * num;
	}
}

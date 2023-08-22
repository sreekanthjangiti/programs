

package programs;

import java.util.Scanner;

public class ArithemeticOperator {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("choose an option -,*,,/,% ");
char c = scan.next().charAt(0);
int a,b;
if(c == '-' || c == '*' || c == '/' || c == '%') {
	System.out.println("Enter 2 number");
	a = scan.nextInt();
	b = scan.nextInt();
switch(c) {
case '-':
	int diff = subtracNumbers(a,b);
	String difference = null;
	System.out.println("Difference = " +difference);
	break;
case '*':
	int product = multiplyNumbers(a,b);
	System.out.println("product = " +product);
	break;
case '/':
	double quotient = divideNumbers(a,b);
	System.out.println("quotient = " +quotient);
	break;
case '%':
	int remainder = moduloNumbers(a,b);
	
	System.out.println("remainder = " +remainder);
	break;
    }
    }else {
    	System.out.println("Invalid input.......");
    }
	}
	private static int multiplyNumbers(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	static int subtracNumbers(int num1, int num2 ) {
		return num1 - num2;
	}

	static int multiplynumbers(int num1, int num2) {
		return num1 * num2;
	}

	 static double divideNumbers(int num1, int num2) {
		return num1 / num2;
	}

	static int moduloNumbers(int num1, int num2) {
		return num1 % num2;
	}
}

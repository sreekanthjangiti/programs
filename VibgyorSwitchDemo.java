package programs;

import java.util.Scanner;

public class VibgyorSwitchDemo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	char c= scan.next().charAt(0);
	switch(c) {
	case 'v':
	     System.out.println("Violet Color");
	case 'i':
       	System.out.println("Indigo Color");
	case 'b':
        System.out.println("Blue Color");
	case 'g':
	    System.out.println("Green Color");
	case 'y':
	    System.out.println("Yellow Color");
	case 'o':
        System.out.println("Orange Color");
	case 'r':
	    System.out.println("Red Colour");
	default:
	    System.out.println("Invalid Input");
	}
	    System.out.println("---> The End <---");
	}
}
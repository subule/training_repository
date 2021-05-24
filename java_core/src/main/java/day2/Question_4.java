package day2;

import java.util.*;

public class Question_4 {
	public static void main(String[] args) {
		double farn = 69;
		double celc = (farn - 32)*0.55556;
		System.out.println("69F into Celcius is : "+celc);
		
		Scanner sc = new Scanner(System.in);
		double fer, cel;
		System.out.println("Enter scale of temoerature (c/f)");
		char scale = sc.next().charAt(0);
		
		if(scale == 'c') {
			System.out.print("Enter the temperature: ");
			cel = sc.nextDouble();
			fer = (1.8*cel)+32;
			System.out.print("The Temperature "+cel+"C in Fahrenheit is: "+fer+"F");
		}else if(scale == 'f') {
			System.out.print("Enter the temperature: ");
			fer = sc.nextDouble();
			cel = (fer - 32)*0.55556;
			System.out.print("The Temperature "+fer+"F in Celcius is: "+cel+"C");
		}else {
			System.out.print("Invalid Selection");
		}
		sc.close();
	}
}
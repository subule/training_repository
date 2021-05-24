package java_core;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		//Shortcut to take input as well as give output
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: "); //Cursor just after printed line; println - Cursor below the printed line
		System.out.println("The string is : "+sc.next());//Waits for user input and then displays the string as o/p
		sc.close();
		
		//specific number of decimal points
		float f;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the float number : ");
		System.out.println("Float upto two decimal places is : "+String.format("%.2f",sc1.nextFloat()));
		sc1.close();
	}
}
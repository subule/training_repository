package day2;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("The number before swapping: "+num1+" and "+num2);
		//Sum variable will not be used here, because it will be similar to using a third variable
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		sc.close();
		System.out.println("The number after swapping: "+num1+" and "+num2);
	}
}
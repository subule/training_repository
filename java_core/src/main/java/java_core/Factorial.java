package java_core;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number, result=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to be found : ");
		number = sc.nextInt();
		while(number>0) {
			result*=number;
			number--;
		}
		System.out.println("The factorial is = "+result);
		
		int flag = number;
		for(; number>0; number--) {
			result*=number;
		}
		System.out.println("Factorial = "+result);
		
	}
}
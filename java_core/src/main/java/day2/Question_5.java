package day2;

import java.util.Scanner;

public class Question_5 {
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
		
		for(; number>0; number--) {
			result*=number;
			sc.close();
		}
		System.out.println("Factorial = "+result);
	}
}
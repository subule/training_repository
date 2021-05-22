package java_core;

import java.util.*;

public class Multiplication {
	public static void main(String[] args) {
		int num1, num2, result=0, i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to be multiplied : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(i<num2) {
			result+=num1;
			i++;
		}
		System.out.println("The product = "+result);
		
		sc.close();
	}
}
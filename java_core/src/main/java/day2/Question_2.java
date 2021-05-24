package day2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer to be reversed : ");
		int num = sc.nextInt();
		int rev_num = 0;
		for(; num!=0; num/=10) {
			int flag = num%10;
			rev_num = rev_num*10 + flag;
			sc.close();
		}
				System.out.println("The Reversed Integer is : "+rev_num);
	}

}

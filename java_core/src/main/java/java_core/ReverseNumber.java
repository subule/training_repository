package java_core;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		long number = sc.nextLong();
		long rev_num=0, flag;
		sc.close();
		for(; number!=0; number/=10) {                //first slot empty; second slot condition; third slot operation
			flag = number%10;
			rev_num = rev_num*10+flag;
		}
		System.out.println("The reversed number is : "+rev_num);
	}
}
package day2;

public class Question_8 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=99; i+=2) {
			sum+=i;
		}
		System.out.println("Sum of odd integers from 1 to 99 is: "+sum);
	}
}
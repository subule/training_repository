package day2;

public class Question_6 {

	public static void main(String[] args) {
		System.out.println("Cubes of numbers between 1 and 10");
		int num=1;
		for(int i=1; i<=10; i++) {
			num*=(num*num);
			System.out.println(num);
			num=i+1;
		}
		
	//USE MATH CLASS
	}
}
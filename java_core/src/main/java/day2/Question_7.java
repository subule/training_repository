package day2;

import java.lang.Math;
import java.util.*;

public class Question_7 {

	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle(in cm): ");
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float area = (float)(radius*radius*Math.PI);
		sc.close();
		System.out.println("Area of the circle is: "+area+" sq.cm.");
	}
}
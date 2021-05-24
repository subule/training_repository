package day2;

import java.util.Scanner;

public class Question_10 { //CODE FOR BOTH 10 AND 11

	public static void main(String[] args) {
		Question_10 obj = new Question_10();
		System.out.println("Enter the type of interest to be calculated \n S for simple interest \n C for compound interest : ");
		Scanner sc = new Scanner(System.in);
		char interestType = sc.next().charAt(0);

		if(interestType == 's' || interestType == 'S') {
			System.out.print("Enter the Principle Amount : ");
			float pSI = sc.nextFloat();
			System.out.print("Enter the rate of interest : ");
			float rSI = sc.nextFloat();
			rSI/=100;
			System.out.print("Enter the time for borrowing the amount : ");
			float tSI = sc.nextFloat();
			SimpleInterest(pSI, rSI, tSI); //SINCE THE METHOD IS STATIC, WE CAN CALL IT DIRECTLY
		}
		
		else if(interestType == 'c' || interestType == 'C'){
			System.out.print("Enter the principle amount : ");
			float pCI = sc.nextFloat();
			System.out.print("Enter the rate of interest : ");
			float rCI = sc.nextFloat();
			rCI/=100;
			System.out.print("Enter the time for borrowing the amount");
			float tCI = sc.nextFloat();
			System.out.print("Enter the no of times the interest compounds over unit time period : ");
			float nCI = sc.nextFloat();
			obj.CompoundInterest(pCI, rCI, tCI, nCI); //SINCE THE METHOD IS NON-STATIC, WE CALL IS BY OBJECT CREATION
		}
		
		else {
			System.out.print("Invalid Choice");
		}
		
		int c = obj.Trial(2,3); //CALLING A METHOD THAT RETURNS A VALUE AND STORING THE VALUE IN APPROPRIATE DATA TYPE
		System.out.println("Trial output is : "+c);
	}
	
	static void SimpleInterest(float principleSI, float rateSI, float timeSI){
		float simpleInterest = principleSI*rateSI*timeSI;
		float amountSI = principleSI + simpleInterest;
		System.out.println("The Simple Interest for "+timeSI+" Years is Rs. "+simpleInterest);
		System.out.println("The Amount to be paid at the end of "+timeSI+" Years is Rs. "+amountSI);
		}
	
	//CHECK FOR CALCULATION AND FORMULA
	void CompoundInterest(float principleCI, float rateCI, float timeCI, float noOfTimesCompounded) {
		float amountCI = (float)(principleCI*Math.pow((1+rateCI/noOfTimesCompounded), (noOfTimesCompounded*timeCI)))-principleCI;
		float compoundInterest = amountCI - principleCI;
		System.out.println("The Compound Interest for "+timeCI+" Years is Rs. "+compoundInterest);
		System.out.println("The Amount to be paid at the end of "+timeCI+" Years is Rs. "+amountCI);
	}
	
	int Trial(int a, int b) {
		return (a+b);
	}
}
package java_core;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if(num%i == 0) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Not a Prime Number .");
		}
		else {
			System.out.println("This is a Prime Number !");
		}
		
		
		
		sc.close();
	}

}

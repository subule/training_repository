package day2;

public class Question_3 {
	public static void main(String[] args) {
		int i = 1;
			switch(i) {
			case(1):
				System.out.println("0");
			
			case(2):
				for(int j=0; j<=2; j+=2) {
					System.out.print(j+" ");
				}
				System.out.println();
			
			case(3):
				for(int j=0; j<=6; j+=3) {
					System.out.print(j+" ");
				}
				System.out.print("\n");
			
			case(4):
				for(int j=0; j<=16; j+=4) {
					System.out.print(j+" ");
				}
				System.out.print("\n");
			
			case(5):
				for(int j=0; j<=20; j+=5) {
					System.out.print(j+" ");
				}
				System.out.print("\n");
			
			case(6):
				for(int j=0; j<=30; j+=6) {
					System.out.print(j+" ");
				}
				System.out.print("\n");
			
			case(7):
				for(int j=0; j<=42; j+=7) {
					System.out.print(j+" ");
				}
				System.out.print("\n");
			}	
	}
}
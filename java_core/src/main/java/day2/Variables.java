package day2;

public class Variables {
	//variable inside class is known as global variable
	byte a;
	short b;
    int i;   //instance variable
    static int j; //class variable
    long c;
    float d;
    double e;
    char f;
    boolean g;
    
    //notes : by default system will give default value to global variable not to local variable 

 

    public static void main(String[] args) {
        //variable inside a method/function is known as local variable
        int k=8;
        System.out.println(k);
        
        //since i want to access global variable i which is non static inside static void main 
        //so i have to create object of Variable class
        Variables v=new Variables(); //create object of class Variable
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.i);
        System.out.println(j);
        System.out.println(v.c);
        System.out.println(v.d);
        System.out.println(v.e);
        System.out.println(v.f);
        System.out.println(v.g);
        
        //Wrapper Class
        Integer x = new Integer(5); // Boxing
        Integer y = 6;              // Autoboxing
        System.out.println("Integer using Wrapper Class (By Boxing): "+x);
        System.out.println("Integer using Wrapper Class (By Autoboxing): "+y);
    }
}
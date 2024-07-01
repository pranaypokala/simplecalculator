import java.util.*;
public class simplecal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n="yes";
		
		while(!n.equalsIgnoreCase("end")) {
		System.out.println("Enter first number ");
		double a= sc.nextDouble();
		
		System.out.println("enter second number ");
		double b=sc.nextDouble();
		
		System.out.println("Enter the operation you want to perform: +, -, *, /, % ");
		char ch=sc.next().charAt(0);
		
		double result=0;
		
		switch(ch) {
		case '+':
			result = add(a,b);
			break;
			
		case '-':
			result= sub(a,b);
			break;
			
		case '*':
			result= mul(a,b);
			break;
		case '/':
			result=div(a,b);
			break;
		case '%':
			result=per(a,b);
			break;
		default:
			System.out.println("Invalid Operation ");
			return;
		}
		
		System.out.println("the result is "+result);
		System.out.println("do you want to repeat the calculation or do you want to end the calculation ");
		n=sc.next();
		}
		System.out.println("calculator end");
	}

	public static double add(double a, double b) {
		return a+b;
	}
	public static double sub(double a, double b) {
		return a-b;
	}
	public static double mul(double a, double b) {
		return a*b;
	}
	public static double div(double a, double b) {
		return a/b;
	}
	public static double per(double a, double b) {
		return a%b;
	}
	
	
}

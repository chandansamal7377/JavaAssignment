import java.util.Scanner;
class SquareRoot {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	double a = sc.nextDouble();
	System.out.println("Enter the value of b: ");
	double b = sc.nextDouble();
	System.out.println("Enter the value of c: ");
	double c = sc.nextDouble();
	double delta = b*b - 4*a*c;
	double Root1 = (-b + Math.sqrt(delta))/2*a;
	double Root2 = (-b - Math.sqrt(delta))/2*a;
	System.out.println(Root1);
	System.out.println(Root2);
	}
}
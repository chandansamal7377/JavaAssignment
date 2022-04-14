import java.util.Scanner;
class Reverse {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	int rem;
	int rev=0;
	while(num>0) {
	rem = num % 10;
	rev = rev * 10 + rem;
	num/=10;
	}
	System.out.println("Reverse number is: " + rev);
	}
}
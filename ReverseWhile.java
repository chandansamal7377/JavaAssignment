import java.util.Scanner;
class ReverseWhile {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int rev=0;
	int rem=0;
 	while(num > 0) {
	rem=num%10;
	rev=rev*10+rem;
	num/=10;
	}
	System.out.println("Reverse number is: "+rev);
	}
}
	
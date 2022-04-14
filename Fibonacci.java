import java.util.Scanner;
class Fibonacci {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no: ");
	int no = sc.nextInt();
	int a=0;
	int b=1;
	int count=2;
	while(count<=no) {
	int temp=b;
	b=b+a;
	a=temp;
	count++;
	}
	System.out.println(b);
    }
}
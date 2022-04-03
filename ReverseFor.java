import java.util.Scanner;
class ReverseFor {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no = sc.nextInt();
	int rev=0;
	int rem=0;
	for(int i=no;no>0;no/=10)
	{
	rem = no % 10;
	rev = rev * 10 + rem;
	}
	System.out.println("Reverse number is: "+rev);
    }
}
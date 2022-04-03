import java.util.Scanner;
class PallindromeFor {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no = sc.nextInt();
	int rev=0;
	int rem=0;
	int temp=no;
	for(int i=no;no>0;no/=10)
	{
	rem = no % 10;
	rev = rev * 10 + rem;
	}
	if(temp==rev) {
	System.out.println(temp+" is a pallindrome number");
	}
	else {
	System.out.println(temp+" is not a pallindrome number");
	}
   }
}
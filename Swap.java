import java.util.Scanner;
class Swap {
	public static void main(String args[])	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a = sc.nextInt();
	System.out.println("Enter the value of b: ");
	int b = sc.nextInt();
	System.out.println("Value of a before swapping " +a);
	System.out.println("Value of b before swapping " +b);
	int temp;
	temp=b;
	b=a;
	a=temp;
	System.out.println("Value of a after swapping " +a);
	System.out.println("Value of b after swapping " +b);
	}
}
	
	
import java.util.Scanner;
class SumNaturalNumberFor{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int no = sc.nextInt();
	int sum=0;
	for(int i=0;i<=no;i++)
	{
	sum+=i;
	}
	System.out.println("Sum: "+sum);
     }
}
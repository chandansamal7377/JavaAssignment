import java.util.Scanner;
class SumNaturalNumber{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no=sc.nextInt();
	int sum=0;
	int i=1;
	while(i<=no) {
	sum+=i;
	i++;
	}
	System.out.println("Sum: "+sum);
    }
}
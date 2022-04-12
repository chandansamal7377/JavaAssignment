import java.util.Scanner;
class EvenOdd {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no: ");
	int no = sc.nextInt();
	if(no % 2 == 0) 
	{
	System.out.println(no +" is even number");
	}
	else{
	System.out.println(no +" is odd number");
	}
  }
}
	
	
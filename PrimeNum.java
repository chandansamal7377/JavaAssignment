import java.util.Scanner;
class PrimeNum {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no = sc.nextInt();
	int count=0;
	for(int i=1;i<=no;i++) 
	{
	  if(no % i  ==0)
	  {
	    count++;
	  }
	}
	if(count == 2) {
	System.out.println(no + " is a prime number");
	}
	else {
	System.out.println(no + " is not  a prime number");
	}
    }
}
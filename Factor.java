import java.util.Scanner;
class Factor {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no = sc.nextInt();
	int fact=0;
	for(int i=1;i<=no;i++) {
	 if(no % i == 0) {
	  fact = i;
	  System.out.println("Factor number: " + fact);
	  }
    }
  }
} 
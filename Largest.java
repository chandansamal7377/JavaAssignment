import java.util.Scanner;
class Largest {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First no: ");
	int no1 = sc.nextInt();
	System.out.println("Enter Second no: ");
	int no2 = sc.nextInt();
	System.out.println("Enter Third no: ");
	int no3 = sc.nextInt();
	if(no1>no2 && no1>no3){
	System.out.println("no1 is largest: " +no1);
	}
	else if(no2>no3){
	System.out.println("no2 is largest: " +no2);
	}
	else{
	System.out.println("no3 is largest: " +no3);
	}
  }
}

	
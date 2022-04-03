import java.util.Scanner;
class Unit {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the unit: ");
	int unit=sc.nextInt();
	if(unit==1) {
	System.out.println("One");
	}
	else if(unit==10) {
	System.out.println("Ten");
	}
	else if(unit==100) {
	System.out.println("Hundred");
	}
	else if(unit==1000) {
	System.out.println("One Thousand");
	}
	else if(unit==10000) {
	System.out.println("Ten Thousand");
	}
	else {
	System.out.println("Plz Enter the unit upto 1 to 10000");
	}
   }
}
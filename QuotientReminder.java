import java.util.Scanner;
class QuotientReminder {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	System.out.println("Enter the divisior: ");
	int div = sc.nextInt();
	int Quotient = num / div;
	int Reminder = num % div;
	System.out.println("Quotient is: " +Quotient);
	System.out.println("Reminder is: " +Reminder);
	}
} 
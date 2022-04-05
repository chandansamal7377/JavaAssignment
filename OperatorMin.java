import java.util.Scanner;
class OperatorMin{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a = sc.nextInt();
	System.out.println("Enter the value of b: ");
	int b = sc.nextInt();
	System.out.println("Enter the value of c: ");
	int c = sc.nextInt();

	int oper1=a+b*c;
	int oper2=c+a/b;
      int oper3=a%b+c;
      int oper4=a*b+c;

      System.out.println("------- Minimum ---------");
      if((oper1<oper2)&&(oper1<oper3)&&(oper1<oper4)) {
            System.out.println("Oper1 is minimum: "+oper1);
        }             
        else if((oper2<oper3)&&(oper2<oper4)) {
            System.out.println("oper2 is minimum: "+oper2);
        }
        else if(oper3<oper4) {
            System.out.println("oper3 is minimum: "+oper3);
        }
        else {
            System.out.println("oper4 is minimum: "+oper4);
        }
     }
}
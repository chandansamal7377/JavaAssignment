import java.util.Scanner;
class ArrayDemo1 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of the array");
	int arr[];
	int size = sc.nextInt();
	arr = new int[size];

	System.out.println("Before array initialisation: ");
	for(int i:arr) {
	   System.out.print(i+" ");
	}

	System.out.println("\nArray initialisation:  ");
	for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
	}

	System.out.println("See the array element after initialisation: ");
	for(int x:arr){
	    System.out.print(x+" ");
	}
   }
}
	

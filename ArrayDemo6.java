import java.util.Scanner;
class ArrayDemo6 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of the Array");
	int arr[];
	int size = sc.nextInt();
	arr = new int[size];

	System.out.println("Before Array initialisation: ");
	for(int i:arr) {
	   System.out.print(i+" ");
	}

	System.out.println("\nArray initialisation:  ");
	for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
	}

	System.out.println("See the Array element after initialisation: ");
	for(int x:arr){
	    System.out.print(x+" ");
	}
	System.out.println("\nReverse Order of Array element");
	for(int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]+" ");
	}
   }
}
	
import java.util.Scanner;
class ArrayDemo5 {
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
	System.out.println("\n--------Even element in the array--------");
	for(int i=0;i<arr.length;i++) {

         if(arr[i] % 2 ==0){
	     System.out.println(arr[i]);
	   }
      }
  } 
}
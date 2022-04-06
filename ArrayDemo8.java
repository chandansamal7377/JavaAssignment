import java.util.Scanner;
class ArrayDemo8{
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

	System.out.println("see the array element after initialisation: ");
	for(int x:arr) {
		System.out.println(x);
	}
	System.out.println("Duplicate element in the Array:" );
	for(int i=0;i<arr.length;i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i] ==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}

   }
}
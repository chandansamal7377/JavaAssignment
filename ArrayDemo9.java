import java.util.Scanner;
class ArrayDemo9 {
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
		System.out.print(x+" ");
	}
	int temp;
	for(int j=0;j<arr.length;j++) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}
	System.out.println("\nSee the array element after sorting: ");
	for(int s:arr){
		System.out.print(s+" ");
	}

   }
}
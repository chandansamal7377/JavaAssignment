import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Enter the size of 2D array--------- ");
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter columns: ");
        int c = sc.nextInt();
        System.out.println("Enter the array element: ");
        int arr[][] =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("See the 2D Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

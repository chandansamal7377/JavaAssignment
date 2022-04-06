import java.util.*;
class ArrayDemo10 {
     public static void main(String arg[]) {
     
         Scanner sc=new Scanner(System.in);
         int size; 
         System.out.println("Enter the size of the array");
         size=sc.nextInt();  
         int arr[]=new int[size];   
         System.out.println("Enter the array element: ");  
         for(int i=0;i<size;i++) {   
        
            arr[i]=sc.nextInt();
        }
               
        for(int i=0;i<size;i++)     
        {
            for(int j=i+1;j<size;j++)   
            {
                if(arr[i]<arr[j])     
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println("Second Largest element is "+arr[1]);
    }
}
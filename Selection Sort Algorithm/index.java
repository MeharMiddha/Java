import java.util.*;
public class SelectionSort1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int swapCount=0;

        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
                swapCount++;
            }
        }
        System.out.println("Swap count for this selection sort is : "+swapCount);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.*;

public class bubbleSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int swapCount=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Total Swap Count in this : "+swapCount);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.*;

public class countSortingAlgo {

    public static void countSort(int arr[],int n){
        int k=arr[0];
        for(int i=0;i<n;i++){
            k=Math.max(k,arr[i]);
        }

        int count[]=new int[k+1];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }

        int output[]=new int[n];
        for(int i=n-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

import java.util.Scanner;

public class mergeSort {

    public static void merge(int arr[],int low,int mid,int high){
        int arr1[]=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                arr1[k++]=arr[i++];
            }
            else{
                arr1[k++]=arr[j++];
            }
        }
        if(i>mid){
            while(j<=high){
                arr1[k++]=arr[j++];
            }
        }
        else{
            while(i<=mid){
                arr1[k++]=arr[i++];
            }
        }
        for(int m=0,n=low;m<arr1.length;m++,n++){
            arr[n]=arr1[m];
        }
    }

    public static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

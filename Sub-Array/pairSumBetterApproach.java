import java.util.Scanner;

public class pairSumBetterApproach {

    public static boolean pairSum(int arr[],int n,int k){
        int low=0;
        int high=n-1;
        while(low<high){
            if(arr[low]+arr[high]==k){
                System.out.println(low+" "+high+" are the index where we get our k");
                return true;
            }
            else if(arr[low]+arr[high]<k){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target price which you want to get : ");
        int k = sc.nextInt();
        System.out.println(pairSum(arr, n, k));
    }
}

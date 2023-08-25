import java.util.Scanner;

public class maximumCircularSubarraySum {

    public static int kadane(int arr[],int n){
        int currentSum = 0;
        int maxSum=-1;
        for(int i=0;i<n;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int wrapSum;
        int nonWrapSum;

        nonWrapSum = kadane(arr,n);
        int totalSum=0;

        for(int i=0;i<n;i++){
            totalSum=totalSum+arr[i];
            arr[i]=-arr[i];
        }

        wrapSum=totalSum+kadane(arr, n);

        System.out.println(Math.max(nonWrapSum, wrapSum));

        



    }
}

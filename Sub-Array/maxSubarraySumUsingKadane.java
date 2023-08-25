import java.util.Scanner;

public class maxSubarraySumUsingKadane {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int currentSum=0;
        int maxSum=-1;
        for(int i=0;i<n;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
}

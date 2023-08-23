import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {7,8,3,1,2};

        // time complexity = O(n^2)
        // bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

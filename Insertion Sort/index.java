import java.util.Scanner;

public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int swapCount = 0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                swapCount++;
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("Swapcount of this code is : "+swapCount);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

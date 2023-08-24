import java.util.Scanner;

public class arraySortedStrictlyIncreasing {

    public static boolean checkSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            // array is sorted till now
            return checkSorted(arr, index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(checkSorted(arr, 0));

    }
}

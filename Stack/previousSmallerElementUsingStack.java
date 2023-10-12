import java.util.Scanner;
import java.util.*;

public class previousSmallerElementUsingStack {

    public static void previousSmallerElement(int a[]){
        Stack<Integer> s =new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek() >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(s.peek()+" ");
            }
            s.push(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        previousSmallerElement(arr);
    }
}

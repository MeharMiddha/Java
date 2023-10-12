import java.util.*;

public class nextSmallerElementUsingStack {

    public static void nextSmallerElement(int arr[]){
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                // System.out.print(-1+" ");
                arr2.add(-1);
            }
            else{
                // System.out.print(s.peek()+" ");
                arr2.add(s.peek());
            }
            s.push(arr[i]);
        }
        Collections.reverse(arr2);
        for(int i=0;i<arr2.size();i++){
            System.out.print(arr2.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextSmallerElement(arr);
    }
}

import java.util.*;

public class largestReactangularHisto {

    public static int[] prevSmaller(int a[]){
        int ps[]=new int[a.length];
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;

    }

    public static int[] nextSmaller(int a[]){
        int ns[]=new int[a.length];
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                arr.add(-1);
            }
            else{
                arr.add(s.peek());
            }
            s.push(i);
        }
        Collections.reverse(arr);
        for(int i=0;i<s.size();i++){
            ns[i]=arr.get(i);
        }
        return ns;

    }

    public static int maxArea(int a[]){
        int maxArea=0;
        int ps[]=prevSmaller(a);
        int ns[]=nextSmaller(a);
        for(int i=0;i<a.length;i++){
            int curr = (ns[i]-ps[i]-1)*a[i];
            maxArea = Math.max(maxArea,curr);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxArea(arr));
    }
}

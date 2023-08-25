import java.util.Scanner;

public class insertingAtParticularIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<n;i++){
            sb.insert(arr[i]+1, '*');
        }
        System.out.println(sb.toString());
    }
}

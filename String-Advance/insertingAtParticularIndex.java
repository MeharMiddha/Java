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
        String res="";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(i==arr[count]){
                res=res+'*';
                count++;
            }
            res=res+str.charAt(i);
        }
        System.out.println(res);
    }
}

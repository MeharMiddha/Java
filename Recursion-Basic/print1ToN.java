import java.util.Scanner;

public class print1ToN {

    public static void print(int n,int count){
        if(count==n+1){
            return ;
        }
        System.out.print(count+" ");
        print(n,count=count+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        print(n,1);
    }
}

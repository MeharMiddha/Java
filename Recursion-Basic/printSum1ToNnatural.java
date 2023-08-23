import java.util.Scanner;

public class printSum1ToNnatural {

    // public static void printNatural(int n,int sum){
    //     if(n==0){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum=sum+n;
    //     n--;
    //     printNatural(n, sum);

    // }

    // ALTER

    public static void printSum(int i,int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printSum(i+1,n,sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        // printNatural(n,0);
        printSum(1, n, 0);
    }
}

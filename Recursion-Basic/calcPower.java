import java.util.Scanner;

public class calcPower {

    public static int calcPower(int x, int n){
        // Base Case
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // Kaam
        return x*calcPower(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x =sc.nextInt();
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}

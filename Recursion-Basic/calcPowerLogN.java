import java.util.Scanner;

public class calcPowerLogN {

    public static int calcPower(int x, int n){
        // Base Case
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // Kaam
        // if n is even
        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else{ // n is odd
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n =sc.nextInt();
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}

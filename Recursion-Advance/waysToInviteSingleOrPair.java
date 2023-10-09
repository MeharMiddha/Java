import java.util.Scanner;

public class waysToInviteSingleOrPair {

    public static int callGuests(int n){

        if(n<=1){
            return 1;
        }

        // Single
        int way1 = callGuests(n-1);

        // Pair
        int way2 = (n-1)*callGuests(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(callGuests(n));
    }
}

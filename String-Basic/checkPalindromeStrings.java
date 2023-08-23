import java.util.Scanner;

public class checkPalindromeStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        String str2 = sb.toString();
        if(str1.equals(str2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

import java.util.Scanner;

public class convertingIntToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        String str=String.valueOf(i);
        System.out.println(i+100);
        System.out.println(str+100);
    }
}

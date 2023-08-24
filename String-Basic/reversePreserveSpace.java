import java.util.Scanner;

public class reversePreserveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String res=sb.toString();
        System.out.println(res);
    }
}

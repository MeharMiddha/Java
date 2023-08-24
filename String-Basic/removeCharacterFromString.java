import java.util.Scanner;

public class removeCharacterFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int pos=sc.nextInt();
        System.out.println(str.substring(0, pos)+str.substring(pos+1));
    }
}

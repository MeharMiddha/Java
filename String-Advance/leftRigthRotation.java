import java.util.Scanner;

public class leftRigthRotation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int pos = sc.nextInt();
        
        // for left rotation
        String str2="";
        for(int i=pos;i<str.length();i++){
            str2=str2+str.charAt(i);
        }
        for(int i=0;i<pos;i++){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);

        // for right rotation
        StringBuilder sb=new StringBuilder(str2);
        System.out.println(sb.reverse());

    }
}

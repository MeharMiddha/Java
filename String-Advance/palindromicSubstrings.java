import java.util.Scanner;

public class palindromicSubstrings {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String str2=str.substring(i, j);
                StringBuilder sb= new StringBuilder(str2);
                sb.reverse();
                String str3=sb.toString();
                if(str2.equals(str3)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

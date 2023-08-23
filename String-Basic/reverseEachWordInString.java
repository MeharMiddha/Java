import java.util.Scanner;

public class reverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        String ch="";
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                ch=ch+str.charAt(i);
            }
            else{
                StringBuilder sb=new StringBuilder(ch);
                sb.reverse();
                String str3=sb.toString();
                str2=str2+str3+" ";
                ch="";
            }
        }
        System.out.println(str2);
    }
}

import java.util.Scanner;

public class capitalizeEachWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String ch="";
        str1=str1+" ";
        String str2="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' '){
                ch=ch+str1.charAt(i);
            }
            else{
                char a=ch.charAt(0);
                a=Character.toUpperCase(a);
                str2=str2+a+ch.substring(1)+" ";
                ch="";
            }
        }
        System.out.println(str2);
    }
}

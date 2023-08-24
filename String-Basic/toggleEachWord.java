import java.util.Scanner;

public class toggleEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        String ch="";
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                ch=ch+str.charAt(i);
            }
            else{
                str2=str2+ch.charAt(0);
                for(int j=1;j<ch.length();j++){
                    char a=ch.charAt(j);
                    if(Character.isUpperCase(a)){
                        a=Character.toLowerCase(a);
                        str2=str2+a;
                    }
                    else{
                        a=Character.toUpperCase(a);
                        // System.out.println(a);
                        str2=str2+a;
                    }
                }
                str2=str2+" ";
                ch="";
            }
        }
        System.out.println(str2);
    }
}

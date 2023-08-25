import java.util.Scanner;

public class frequencyOfEachChar {

    public static boolean check(String str,char a){
        for(int i=0;i<str.length();i++){
            if(a==str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count;
        String str2="";
        for(int i=0;i<str.length();i++){
            if(check(str2, str.charAt(i))){
                str2=str2+str.charAt(i);
            }
        }

        for(int i=0;i<str2.length();i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(str2.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.print(str2.charAt(i));
            System.out.print(count);
        }

    }
}

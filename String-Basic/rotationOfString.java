import java.util.Scanner;

public class rotationOfString {

    public static boolean checkRotation(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        String str3=str1+str2;
        if(str3.contains(str2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(checkRotation(str1, str2));
    }
}

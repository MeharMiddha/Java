import java.util.Scanner;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str2="";
        int count=0;
        str2=str2+str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str2.charAt(count)==str.charAt(i)){
                continue;
            }
            else{
                str2=str2+str.charAt(i);
                count++;
            }
        }
        System.out.println(str2);
    }
}

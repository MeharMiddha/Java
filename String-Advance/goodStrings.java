import java.util.Scanner;

public class goodStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String str2="";
        int count=0;
        int maxCount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                count++;
                str2=str2+str.charAt(i); 
                maxCount=Math.max(count, maxCount);
            }
            else{
                str2="";
                count=0;
            }
        }
        System.out.println(maxCount);
    }
}

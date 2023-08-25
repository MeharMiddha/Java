import java.util.Scanner;

public class frequencyCharConsec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int count=1;
        String str2=str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }
            else{
                str2=str2+count+"";
                count=1;
                str2=str2+str.charAt(i);
            }
        }
        System.out.println(str2+count);
    }
}

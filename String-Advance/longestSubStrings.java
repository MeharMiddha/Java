import java.util.Scanner;
import java.util.*;

public class longestSubStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int res=0;
        for(int i=0;i<str.length();i++){
            boolean var[]=new boolean[256];
            for(int j=i;j<str.length();j++){
                if(var[str.charAt(j)]==true){
                    break;
                }
                else{
                    res=Math.max(res, j-i+1);
                    var[str.charAt(j)]=true;
                }
            }
            var[str.charAt(i)]=false;
        }
        System.out.println(res);
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class allUniqueSubsequence {

    public static void printUnique(String str,int index,String str2,HashSet<String> set){

        if(index==str.length()){
            if(set.contains(str2)){
                return;
            }
            else{
                System.out.println(str2);
                set.add(str2);
                return;
            }
        }

        char currChar = str.charAt(index);

        // to be
        printUnique(str, index+1, str2+currChar, set);

        // not to be
        printUnique(str, index+1, str2, set);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashSet<String> set=new HashSet<String>();
        String str2="";
        printUnique(str, 0, str2, set);

    }
}

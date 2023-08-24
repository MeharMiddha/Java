import java.util.Scanner;

public class allSubsequenceOfString {

    public static void printSubsequence(String str,int index,String str2){
        if(index==str.length()){
            System.out.println(str2);
            return;
        }
        char currChar = str.charAt(index);

        // to be
        printSubsequence(str, index+1, str2+currChar);


        // not to be
        printSubsequence(str, index+1, str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String str2="";
        printSubsequence(str, 0, str2);
    }
}

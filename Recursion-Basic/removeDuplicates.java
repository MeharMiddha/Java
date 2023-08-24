import java.util.Scanner;

public class removeDuplicates {

    public static boolean[] map = new boolean[26];


    public static void removeDuplicates(String str,int index,String str2){
        if(index==str.length()){
            System.out.println(str2);
            return;
        }
        char currChar=str.charAt(index);
        if(map[currChar-'a']){
            removeDuplicates(str, index+1, str2);
        }
        else{
            str2=str2+currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, index+1, str2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String str2="";
        removeDuplicates(str, 0, str2);

    }
}

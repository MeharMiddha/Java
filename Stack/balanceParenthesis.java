import java.util.Scanner;
import java.util.*;

public class balanceParenthesis {

    public static boolean isOpening(char c){
        return c=='(' || c=='{' || c=='[';
    }

    public static boolean isMatching(char a, char b){
        return (a=='(' && b==')') || (a=='{' && b=='}')  || (a=='[' && b==']');
    }

    public static boolean isParenthesIsMatching(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            if(isOpening(curr)){
                s.push(curr);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!isMatching(s.peek(),curr)){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.println(isParenthesIsMatching(str));
    }
}

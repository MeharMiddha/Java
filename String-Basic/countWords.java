import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){

            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}

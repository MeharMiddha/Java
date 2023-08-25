import java.util.Scanner;

public class frequencyCharConsecutive {
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
        int length;
        for(int i=0;i<str2.length();i++){
            length=0;
            for(int j=0;j<str.length();j++){
                if(str2.charAt(i)==str.charAt(j)){
                    length++;
                }
                if(length>1){
                    if(str2.charAt(i)==str.charAt(j)){
                        break;
                    }
                }
            }
            System.out.print(str2.charAt(i));
            System.out.print(length);
        }
    }
}

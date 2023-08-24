import java.util.Scanner;

public class moveXtoEnd {

    public static void moveXtoEnd(String str,int index,int count,String str2){
        if(index==str.length()){
            for(int i =0;i<count;i++){
                str2=str2+'x';
            }
            System.out.println(str2);
            return;
        }
        if(str.charAt(index)=='x'){
            count++;
            moveXtoEnd(str, index+1, count,str2);
        }
        else{
            str2=str2+str.charAt(index);
            moveXtoEnd(str, index+1, count,str2);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str2="";
        moveXtoEnd(str,0,0,str2);

    }
}

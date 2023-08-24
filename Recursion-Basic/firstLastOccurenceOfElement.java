import java.util.Scanner;

public class firstLastOccurenceOfElement {

    public static int first = -1;
    public static int last = -1;

    public static void firstLastOccurence(String str,char ele,int index){
        if(index==str.length()){
            System.out.println("First Occurrence is : "+first);
            System.out.println("Last Occurrence is : "+last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar==ele){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }

        firstLastOccurence(str, ele, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        char ele = sc.next().charAt(0);
        firstLastOccurence(str1, ele, 0);
    }
}

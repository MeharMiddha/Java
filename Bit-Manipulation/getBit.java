import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5; // 0101
        int pos =2;
        int bitMask = 1<<pos;  //0100
        if((bitMask & n) == 0){     // 0100 & 0101 = 0100
            System.out.println("bit was 0");
        }
        else{
            System.out.println("bit was 1");
        }

    }
}

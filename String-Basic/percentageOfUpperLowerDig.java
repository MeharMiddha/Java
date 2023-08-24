import java.util.Scanner;

public class percentageOfUpperLowerDig {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int totalchar=str.length();
        int upperCase = 0;
        int lowerCase=0;
        int digits=0;
        int specialCharacter=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(Character.isUpperCase(a)){
                upperCase++;
            }
            else if(Character.isLowerCase(a)){
                lowerCase++;
            }
            else if(Character.isDigit(a)){
                digits++;
            }
            else{
                specialCharacter++;
            }
        }
        double upperPercentage = (upperCase*100)/totalchar;
        double lowerPercentage = (lowerCase*100)/totalchar;
        double digitPercentage = (digits*100)/totalchar;
        double specialPercentage = (specialCharacter*100)/totalchar;
        System.out.println(upperPercentage+"%");
        System.out.println(lowerPercentage+"%");
        System.out.println(digitPercentage+"%");
        System.out.println(specialPercentage+"%");
    }
}

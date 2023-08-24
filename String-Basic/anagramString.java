import java.util.Arrays;
import java.util.Scanner;

public class anagramString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int arr1[]=new int[str1.length()];
        int arr2[]=new int[str2.length()];
        String r1="";
        String r2="";
        for(int i=0;i<str1.length();i++){
            arr1[i]=(int)str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            arr2[i]=(int)str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            r1=r1+(char)arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            r2=r2+(char)arr2[i];
        }
        if(r1.equals(r2)){
            System.out.println(str1+" "+str2+" are Anagram");
        }
        else{
            System.out.println(str1+" "+str2+" are not an Anagram");
        }
    }
}

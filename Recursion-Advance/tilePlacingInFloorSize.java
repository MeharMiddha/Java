import java.util.Scanner;

public class tilePlacingInFloorSize {

    public static int placeTiles(int n,int m){

        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }


        // Vertically Placed Tiles
        int vertPlacements = placeTiles(n-m, m);

        // Horizontally Placed Tiles
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements+horPlacements;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(placeTiles(n, m));
    }
}

import java.util.*;

public class totalPathsInMaze {

    public static int countPaths(int i, int j, int n, int m){

        // Base Case
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }

        // Move Downwards
        int downPaths = countPaths(i+1, j, n, m);


        // Move Right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(countPaths(0, 0, n, m));
    }
}

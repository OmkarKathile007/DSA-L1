package Recursion;

public class TilesProblem {
    public static int NumberofTiles(int n){
        if (n==0 || n==1){
            return 1;
        }
        int vertical=NumberofTiles(n-1);
        int horizontal=NumberofTiles(n-2);
        int Total_Tiles=vertical+horizontal;
        return Total_Tiles;
    }
    public static void main(String[] args) {
        System.out.println(NumberofTiles(5));
    }
}

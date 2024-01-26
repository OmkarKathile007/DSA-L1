package Strings;

public class P2_ShortestPath {
    public static float ShortPath(String str){
        int x=0;
        int y=0;
        for (int i=0;i<=str.length()-1;i++){
            char dir = str.charAt(i);
            if (dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
            else if (dir=='S'){
                y--;
            }
            else{
                y++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        float fr =(float) Math.sqrt(x2+y2);
        return fr;
    }
    public static void main(String[] args) {
        String str="WNEEESWSESWWWNWS";
        System.out.println(ShortPath(str));
    }
}

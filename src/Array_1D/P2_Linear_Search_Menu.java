package Array_1D;

import java.util.Scanner;

public class P2_Linear_Search_Menu {

    public static String FoodItems(String arr[],String food){
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(food)){
                return i +" ";
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[]= {"Vadapav","Kachori","Pattice","Samosa","Dosa","Uttapa","Idli"};
        System.out.println("Enter Your Food Item");
        String food = sc.next();
        String list = FoodItems(menu,food);
        if(list==null){
            System.out.println("Food Item Not Available");
        }
        else{
            System.out.println("Food item Found at list no :"+list);
        }

    }
}

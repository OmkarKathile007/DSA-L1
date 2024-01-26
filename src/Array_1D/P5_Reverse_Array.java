package Array_1D;

public class P5_Reverse_Array {
    public static void Reverse(int numbers[]){
        int first = 0;
        int last =numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        Reverse(numbers);
        for (int i=0;i<numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

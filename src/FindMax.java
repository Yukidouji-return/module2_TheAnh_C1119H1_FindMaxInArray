
public class FindMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int Max = 0;
        for (int value : array) {
            if (value >= Max) {
                Max = value;
            }
        }
        System.out.println("Max num in array is : " + Max);
    }
}
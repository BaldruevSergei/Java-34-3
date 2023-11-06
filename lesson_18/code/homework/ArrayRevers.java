package homework;

public class ArrayRevers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        printarr(array);

    }

    public static void printarr(int[] arr) {
        for (int i = 8; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
















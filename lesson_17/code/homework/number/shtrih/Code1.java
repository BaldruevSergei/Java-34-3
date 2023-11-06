package homework.number.shtrih;

public class Code1 {
    public int type1;

    public Code1(int type1) {
        this.type1 = type1;
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }

    public static int Length(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s++;
        }
        return s;
    }

    public static int Summ(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = arr[i] + s;
        }
        return s;
    }
    // public void Verefication(int a){
    //    if ()


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void split() {

        System.out.println("-------------------------------");}
}

package practics;

public class Abitureint {
    public static void main(String[] args) {
        //  объявили и заполнили массив
        int[] marks = {2, 3, 3, 1, 4, 5, 2, 1, 1, 3, 2};

        int sumOfmarks = 0;
        for (int i = 0; i < marks.length; i++) {
          //  sumOfmarks = sumOfmarks + marks[i]; // длинный способ
            sumOfmarks += marks[i]; // короткая запись

        }

        double averadeMark = (double) sumOfmarks / marks.length;
        System.out.println("Average mark =  " + averadeMark);
        System.out.printf("Average mark: %.2f", averadeMark);
    }
}

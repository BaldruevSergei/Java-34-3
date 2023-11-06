package homework.array;
//Задание 4. (на повторение и закрепление) Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
// Найдите среднюю величину по всем четным элементам массива. Разработайте соответсвующий тест (набор тестов).
public class ArrayNumber {
    int arr[] = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};


    public double arraySumDigitABS(int[] arr) { // метод ищет среднюю величину по модулю по всем четным элементам массива
        int sum = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += Math.abs(arr[i]);
                k++;

            }
        }
        return Math.round((sum / (double) k));

    }

    public double arraySumDigitNoABS(int[] arr) {  // метод ищет среднюю величину с учетом знака числа  по всем четным элементам массива
        int sum = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += (arr[i]);
                k++;

            }
        }
        return Math.round((sum / (double) k));
    }
}

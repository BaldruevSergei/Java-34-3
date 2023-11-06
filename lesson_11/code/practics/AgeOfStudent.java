package practics;

public class AgeOfStudent {
    public static void main(String[] args) {

        int[] ageOfStudent = {30, 18, 45, 52, 43, 45, 61, 38, 40, 35, 36, 45, 47, 34, 29, 22, 18};
        int indexMax = 0;

        // Ищем максимальный
        int max = ageOfStudent[0]; // это первый кандидат на maximum
        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] > max) {
                max = ageOfStudent[i]; // взяли максимум
                indexMax = i; // взяли его индекс
            }
        }
        System.out.println("Max age: " + max);
        System.out.println("Index max " + indexMax);

        int indexMin = 0;
        int min = ageOfStudent[0]; // это первый кандидат на maximum
        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] < min) {
                min = ageOfStudent[i]; // взяли максимум
                indexMin = i; // взяли его индекс
            }
        }
        System.out.println("Min age: " + min);
        System.out.println("Index min  " + indexMin);


        // ищем дубликаты
        // идем по всем элементам массива, начиная с 0 -го элемента и для него ищем совпадения
        // ответ выглядит так- ест дубликат его индекс , всего столько дубликатов
        int dublicate = ageOfStudent[0]; // кандидат на дубликаты
        int dCount = 0; // счетчик дубликата
        int index = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            for (int j = i + 1; j < ageOfStudent.length; j++) {
                if (ageOfStudent[i] == ageOfStudent[j]){
                    dublicate = ageOfStudent[i];
                    dCount++;
                    index = j;
                    System.out.println("Dublicate : " + dublicate + "Index  " + index);
                    System.out.println("Quality of dublicate : " + dCount);


                }
            }


        }



    }}
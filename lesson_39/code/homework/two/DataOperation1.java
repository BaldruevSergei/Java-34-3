package homework.two;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

// Задача 2.(*) В классе DateOperation (см. package homework), реализовать метод sortStringDates,
// принимающий массив дат в виде массива данных типа String, и возвращающий отсортированный массив дат.
// Для проверки используйте класс DateOperationTest с Unit-тестами.
public class DataOperation1 {
    public static void main(String[] args) {

        String[] dataOperation1 = {"1982/03/11", "1978/04/30", "2011/05/15", "2007/06/26", "2019/11/12","2018/08/11", };


        System.out.println("Array before sort " + Arrays.toString(dataOperation1));
        sortStringDates((dataOperation1));
       // Arrays.sort(dataOperation1);
        System.out.println("Array after sort " + Arrays.toString(dataOperation1));

    }
        public static String[] sortStringDates (String[]arr){
            Arrays.sort(arr); // сортирую в начале в стрингах
            for (int i = 0; i < arr.length; i++) {
                LocalDate[] dates = new LocalDate[]{LocalDate.parse(arr[i], DateTimeFormatter.ofPattern("yyyy/MM/dd"))};

            }


            return arr;

        }


        void printDate () {

        }
    }




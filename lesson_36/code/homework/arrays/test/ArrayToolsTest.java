package homework.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import homework.arrays.utils.ArrayTools;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;


    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 3, 54, 5, 6, 6, 7, 8, 6, 4, 5, 6, 7, 8, 11};
        arrStr = new String[]{"One", "Two", "three", "four", "five"};

    }

    @Test
    void printArray() {
        System.out.println("===============test Print Arrat=============");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void trstSearch() {
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 7);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 10);
        System.out.println("index = " + index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("=============Test Predicate=====         ");
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n < 5;
            }
        };
        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 10);
        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }

    @Test
    void testBubbleSort() {
        System.out.println("===== testBubbleSort =====");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testBubbleSortComparator() {
        System.out.println("===== testBubbleSortComparator =====");
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> n2 - n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());
        ArrayTools.printArray(arrStr);
    }

    //Напишите OddEvenComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел
    // в следующем порядке: Четные целые числа должны идти перед нечетными числами.
    @Test
    void testOddEvenComparator() {
        System.out.println("================testOddEvenComparator=================");
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> n2 % 2 - n1 % 2);
        ArrayTools.printArray(arrNum);

    }

    @Test
    void testOdEvenComparator2() {
        Integer[] origin = {1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1;
            }
            if (n1 % 2 == 0 && n2 % 2 == 0) {
                return n1 - n2;
            }
            if (n1 % 2 != 0 && n2 % 2 != 0) {
                return n2 - n1;
            }


            return 0;
        };


        Arrays.sort(origin,comparator);
        System.out.println(Arrays.toString(origin));
}



    private void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==================================");
    }
}












  

















































package practice.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;


class CatTest {
    Cat[] cat;

    @BeforeEach
    void setUp() {
        cat = new Cat[4];
        cat[0] = new Cat(101, "Tushka", "brit", 5, 3.5);
        cat[1] = new Cat(102, "Geny", "sfinks", 1, 1.2);
        cat[2] = new Cat(103, "OOshka", "pers", 9, 5.0);
        cat[3] = new Cat(103, "Sey", "maikun", 2, 8.5);



    }
    @Test
    void testCatSort(){
        System.out.println("=========================================");
        printArray(cat);
        System.out.println("=========================================");
        Arrays.sort(cat);
        printArray(cat);

    }
    @Test
    void testSortComparator() {
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge() ;
            }
        };
        printArray(cat);
        Arrays.sort(cat, catComparator);
        System.out.println("==== sort by name ==============");
        printArray(cat);

    }



    public void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package practics;
// Задача 1. Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины
// до тех пор, пока они там есть. Последнее сообщение: "Яблоки кончились!".
public class Apples {

    public static void main(String[] args) {

        int apples = 30; // стартовые значения
        int counter  = 0; // счетчик
        int appesInLoCycle = apples; // параметр

        while (appesInLoCycle > 0){

            System.out.println("Take one apple from basket");
            appesInLoCycle--;
            //
            counter++; // количество выполненных операций
            System.out.println("The rest of apples" + appesInLoCycle);
        }
        System.out.println("The job in done, total apples " + counter + "  added in pie. ");
    }
}

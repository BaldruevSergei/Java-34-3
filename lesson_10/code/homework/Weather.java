package homework;
//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю. Выведите
// на печать температуру, которая была во вторник и затем в четверг. Найти среднюю температуру за прошлую неделю.
public class Weather {
    public static void main(String[] args) {
        double[] arrayTemp ={-10.2, 12, 11, 0, -3, 7, 4};
        System.out.println(arrayTemp[1]);
        System.out.println(arrayTemp[3]);
        double result = 0;

        for (double d : arrayTemp){
            result += d;

        }
        System.out.println("Среднее арифметическое  " + Math.ceil(result / arrayTemp.length));
    }
}

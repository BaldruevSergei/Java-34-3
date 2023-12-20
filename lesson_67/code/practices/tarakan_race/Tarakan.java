package practices.tarakan_race;

import java.util.Random;

public class Tarakan implements  Runnable{
//Создать приложение-игру «TarakansRace» Таракан - поток, выполняющий цикл итераций.
// На каждой итерации поток выводит свой собственный номер и переходит врежим сна на случайное
// количество миллисекунд [2-5]. Диапазон времени сна должен быть одинаковым для всех тараканов.
// Таракан, закончивший круг первым, считается победителем.
//
//Приложение должно принимать количество тараканов и расстояние (колличество итераций) из
// консольного ввода/вывода.
//
//В конце игры должно быть распечатано следующее сообщение “Congratulations to tarakan #X (winner)”
// где Х - номер таракана-победителя.

    String name; // имя  или (ID)

    static  int distance; // спросим у пользователя
    static  int minSleepTime = 2;
    static  int maxSleepTime = 5;
    static String winner;  // метод ФИНИШ поле победитель
    static Random random = new Random();

    // constr


    public Tarakan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDistance() {
        return distance;
    }

    public static void setDistance(int distance) {
        Tarakan.distance = distance;
    }

    public static int getMinSleepTime() {
        return minSleepTime;
    }

    public static void setMinSleepTime(int minSleepTime) {
        Tarakan.minSleepTime = minSleepTime;
    }

    public static int getMaxSleepTime() {
        return maxSleepTime;
    }

    public static void setMaxSleepTime(int maxSleepTime) {
        Tarakan.maxSleepTime = maxSleepTime;
    }

    public static String getWinner() {
        return winner;
    }

 /*   public static void setWinner(String winner) {
        Tarakan.winner = winner;
    }*/

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Tarakan.random = random;
    }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            int sleepTime = maxSleepTime + random.nextInt(maxSleepTime + 1 - minSleepTime); // от левого до правого(он входит)
            try {
                Thread.sleep(sleepTime); // положили спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " is moving "); // этот таракан ползет
        }
        // доклад о пиходе к финишу
        System.out.println(name + "FINISHED ");
         // у каждого таракана есть шанс добежать до этой строчки программы
        if(winner == null) {
            winner = name; // принцип "оплодотворения - сперматозоида"
        }

    }
}

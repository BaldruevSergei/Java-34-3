package practices.tarakan_race;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TarakanraceAppl {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of tarakans: ");
        int nTarakans = Integer.parseInt(br.readLine());
        System.out.println("Input distance");
        int distance = Integer.parseInt(br.readLine());
        Tarakan.setDistance(distance); // всем тараканам назначили дистанцию (в статичское поле)

        Thread[] tarakans = startRace(nTarakans); // старт гонки
        waitFinish(tarakans); // все потоки соединились к main
        System.out.println("Congratulation  to the Winner " + Tarakan.getWinner());
    }


    private static Thread[] startRace(int nTarakans) {
        Thread[] threads = new  Thread[nTarakans];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Tarakan("Tarakan # " + (i + 1))); // Новый Thread которому  передали новый процесс на базе Runable

        }
        // запускаем треды
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        return threads;
    }
    private static void waitFinish(Thread[] tarakans) {
        for (int i = 0; i < tarakans.length; i++) {
            try {
                tarakans[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

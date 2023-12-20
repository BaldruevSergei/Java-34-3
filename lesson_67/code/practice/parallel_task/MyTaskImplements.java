package practice.parallel_task;

public class MyTaskImplements implements Runnable{

    // fields

    String name; // имя задачи
    int max; // дос скольки досчитать

    // constructor


    public MyTaskImplements(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + " task started .");
       // Считаем в цикле от 0 до max

        for (int i = 0; i < max; i++) {
            System.out.println(name + "count " + i); // доклад на каждом шаге
                      try {
               Thread.sleep(10); // положили поток спать
          } catch (InterruptedException e) {
               throw new RuntimeException(e);
          }
        }
        System.out.println(name + " task finished.");
    }
}

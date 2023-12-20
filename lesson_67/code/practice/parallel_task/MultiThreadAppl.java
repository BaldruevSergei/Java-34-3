package practice.parallel_task;

public class MultiThreadAppl {
    private static final int MAX = 10;
    private static final int SIZE = 3;
    //Чтобы новый тред стартовал, надо создать объект типа Thread передав в конструктор
    // объект типа Runnable, и после этого вызвать у объекта типа Thread метод start.


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started"); // начал работать первый thread

        MyTaskImplements task1 = new MyTaskImplements("Parallel one", MAX); // создали задачу
        MyTaskExtends task2 = new MyTaskExtends("Parallel two", MAX); // создали третью задачу
        Thread thread1 = new Thread(task1); // создаем новый thread  (новый поток) и передали ему эту задачу
        Thread thread2 = new Thread(task2);  // создаем еще один  thread  (новый поток) и передали ему третью  задачу
        Thread[] threads = new  Thread[SIZE];
        thread1.start(); // поток запустили
        thread2.start(); // поток запустили

        // создаем масив паралелльных  задач на базе класса Implements Runnable
        MyTaskImplements[] task = new MyTaskImplements[SIZE];
        for (int i = 0; i < task.length; i++) {
            task[i] = new MyTaskImplements("Name # " + i, MAX);
        }


        // массив на 3 потока

        for (int i = 0; i < threads.length; i++) {

            threads[i] = new Thread(task[i]);
        }
        for (int i = 0; i <threads.length; i++) {
            threads[i].start();
           // threads[i].join(); так делать не надо
        }
        for (int i = 0; i < MAX; i++) {
            System.out.println("Main coun = " + i); // докладывает майн
            try {
            Thread.sleep(10); // положили поток спать
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
        }

        thread1.join(); // присоединения в идущему процессу
        thread2.join();
        for (int i = 0; i < threads.length; i++) { //  присоединяем в майн
            threads[i].join();
        }
        System.out.println("Main thread finished.");
    }
}

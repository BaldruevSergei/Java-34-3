package practices;
// Задание 2. Родители позволяют ребенку играть на компьютере 1 час. Напишите программу, которая будет реагировать на полученную в школе оценку:

import java.util.Scanner;

//        "Молодец!", время для игр на компьютере увеличивается на 30 мин.
//        "Хорошо", ты можешь играть на компьютере обычные 60 минут.
//        "Посредственно.", время для игр уменьшается на 30 мин.
//        "Плохо!", сегодня никаких игр на компьютере.
//        "Позор семьи!", никаких игр на компьютере 2 дня.
public class Evaluation {
    public static void main(String[] args) {

        int timeForGame = 60; // Сколько разрешено играть на компьютере

        Scanner scaner = new Scanner(System.in); // включили ввод данных с клавы
        System.out.println("Input today's mark:"); // приглашение к вводу
        int mark = scaner.nextInt(); // получение оценки с клавы

        switch (mark){
            case 1: {
                System.out.println("Молодец!, время для игр на компьютере увеличивается на 30 мин." + timeForGame);
                timeForGame = timeForGame + 30; // увеличили время
                break;
            }
            case 2: {
                System.out.println("Sher gut" +timeForGame);
                break;
            }
            case 3: {
                System.out.println("No so good!");
                timeForGame = timeForGame -30;
                break;
            }
            case 4: {
                System.out.println("Very bad!");
                timeForGame = 0;
                break;
            }
            case 5: {
                System.out.println("Shame you!");
                System.out.println("No games for 2 days");
                break;
            }
            default: { // если пользватель ввле что-то другое
                System.out.println("Wrong input!");
            }

        }


    }
}

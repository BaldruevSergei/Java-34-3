package homework.box;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ShipmentAppl {
    public static void main(String[] args) {


//Создайте класс ShipmentAppl с методом main
        List<Container> containers = generateContainers();

        // Задание 2. Подсчитайте общее количество посылок во всех ящиках и их общий вес.
     int totalParcelsCount = containers.stream()                            // делаем  stream контейнеров
                .flatMap(container -> StreamSupport.stream(container.spliterator(), false))
                .mapToInt(Container::getTotalParcelsCount)
                .sum();

        double totalParcelsWeight = containers.stream()
                .flatMap(container -> StreamSupport.stream(container.spliterator(), false))
                .mapToDouble(Container::getTotalParcelsWeight)
                .sum();

        System.out.println("Задание 2:");
        System.out.println("Общее количество посылок: " + totalParcelsCount);
        System.out.println("Общий вес посылок: " + totalParcelsWeight + " кг");

        //Задание 3. Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
       // String containerWithMaxParcelsLabel = containers.stream()
                //.max(Comparator.comparingInt(Container::getTotalParcelsCount))
                //.map(Container::getLabel)
                //.orElse(null);

       // System.out.println("Задание 3:");
       // System.out.println("Label контейнера с максимальным количеством посылок: " + containerWithMaxParcelsLabel);

        // Задание 4. Найдите все контейнеры с максимальным количеством посылок.
       /* List<Container> containersWithMaxParcels = containers.stream()
                .filter(container -> container.getTotalParcelsCount() == totalParcelsCount)
                .collect(Collectors.toList());

        System.out.println("\nЗадание 4:");
        System.out.println("Контейнеры с максимальным количеством посылок:");
        containersWithMaxParcels.forEach(container -> System.out.println(container.getLabel()));*/


    }

    private static List<Container> generateContainers() {
        Random random = new Random();
        int containerCount = random.nextInt(11) + 10; // случайное количество контейнеров от 10 до 20
        List<Container> containers = new ArrayList<>();

        for (int i = 0; i < containerCount; i++) {
            String containerLabel = "Container-" + (i + 1);
            List<Box> boxes = generateBoxes();
            containers.add(new Container(containerLabel, boxes));
        }

        return containers;
    }

    private static List<Box> generateBoxes() {
        Random random = new Random();
        int boxCount = random.nextInt(11) + 10; // случайное количество коробок от 10 до 20
        return Stream.generate(() -> generateParcels()).limit(boxCount).map(Box::new).collect(Collectors.toList());
    }

    private static List<Parcel> generateParcels() {
        Random random = new Random();
        int parcelCount = random.nextInt(6) + 10; // случайное количество посылок от 5 до 10
        return Stream.generate(() -> new Parcel(2.0)).limit(parcelCount).collect(Collectors.toList());
    }
}



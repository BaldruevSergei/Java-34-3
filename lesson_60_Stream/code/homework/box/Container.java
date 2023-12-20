package homework.box;

import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

// Задание 1. Создайте класс Container с полями: String label (маркировка) и List - список коробок с посылками.
public class Container implements Iterable<Box> {
    private String label;
    private static List<Box> boxes;

    public Container(String label, List<Box> boxes) {
        this.label = label;
        this.boxes = boxes;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

    public static int getTotalParcelsCount(Box parcels) {
        return boxes.stream().flatMap(box -> StreamSupport.stream(box.spliterator(), false)).mapToInt(Parcel -> 1).sum();
    }

    public static double getTotalParcelsWeight(Box parcels) {
        return boxes.stream().flatMap(box -> StreamSupport.stream(box.spliterator(), false)).mapToDouble(Parcel::getWeight).sum();
    }



}
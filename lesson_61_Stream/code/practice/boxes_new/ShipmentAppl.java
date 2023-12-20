package practice.boxes_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipmentAppl {
    private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    private static final int MIN_BOXES = 10;
    private static final int MAX_BOXES = 20;
    private static final int MIN_PARCELS = 5;
    private static final int MAX_PARCELS = 10;

    private static Random random = new Random();

    public static void main(String[] args){
        List<Container> containers = new ArrayList<>();


        
        int numContainer = new Random().nextInt(MIN_CONTAINERS,MAX_CONTAINERS);
        int numBoxes = new Random().nextInt(MIN_BOXES,MAX_BOXES);
        int numParcels = new Random().nextInt(MIN_PARCELS,MAX_PARCELS);

        for (int i = 0; i < numContainer; i++) {
            List<Box> boxes = new ArrayList<>();
            for (int j = 0; j <numBoxes ; j++) {
                List<Parcel> parcels = new ArrayList<>();
                for (int k = 0; k < numParcels; k++) {
                    parcels.add(new Parcel(2.0));
                }
                //boxes.add(new Box(parcels));
            }

            containers.add(new Container("Container " + (i + 1), boxes));
        }
/*
        long totalParcelsCount = containers.stream()
                .flatMap(container -> container.getListBoxes().stream())
                .flatMap(box -> box.getParcels().stream())
                .count();
        double totalParcelsWeight = containers.stream()
                .flatMap(container -> container.getListBoxes().stream())
                .flatMap(box -> box.getParcels().stream())
                //.mapToDouble(Parcel::)
                //.sum();
        System.out.println("Total parcels count: " + totalParcelsCount);
        System.out.println("Total parcels weight: " + totalParcelsWeight + " kg");*/

    }

}

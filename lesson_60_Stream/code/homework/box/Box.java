package homework.box;

import java.util.Iterator;
import java.util.List;

// // Создайте класс Box с полем: List - список посылок. Классы Container и Box являются итерируемыми.
public class Box implements Iterable<Parcel>{
    private List<Parcel> parcels;

    public Box(List<Parcel> parcels) {
        this.parcels = parcels;
    }
    public List<Parcel> getParcels() {
        return parcels;
    }
    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}


package practice.boxes_new;

import homework.box.Parcel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel> { // перебираем посылки в ящике
    // поле
    List<Parcel> parcels;

  /*  public Box() {
        parcels = new ArrayList<>();
    }*/
    // конструктор
    public Box(List<Parcel> parcels){
        this.parcels = new ArrayList<>();
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

   /* public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }*/
    // в коробку надо будет добавить задуманное число посылок
    // этот метод добавляет посылку в список посылок
    public boolean addParcel(Parcel parcel){
        return parcels.add(new Parcel(2.0)); // добавляем посылку в бокс
    }

    public int quantity(){
        return parcels.size();
    }
    // вес коробки = сумме весов всех посылок
    public double weightBox(){
        return parcels.stream()
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}


package practice.computers.model1;

public class SmartPhone  extends  Laptop{
    private int camera;
    private String os;
    private String network;


    public SmartPhone(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight, int camera, String os, String network) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.camera = camera;
        this.os=os;
        this.network= network;
    }

    @Override
    public String toString() {
        return super.toString() +  "SmartPhone{" +
                "camera=" + camera +
                ", os='" + os + '\'' +
                ", network='" + network + '\'' +
                "} " ;
    }
}


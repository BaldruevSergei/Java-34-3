package homework.animal.type;

public class Cat extends Petty {

    private  String breed;
    private  int growtn;
    private int weight;

    public Cat(String nickname, String kindom, String type, String breed, int growth, int weight) {
        super(nickname, kindom, type);
        this.breed = breed;
        this.growtn = growth;
        this.weight = weight;
    }

    public void toVoice(){
        super.toVoice();
        System.out.println("May");
    }
}


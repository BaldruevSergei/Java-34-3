package homework.animal.type;

public class Dog extends Petty {

    private  String breed;
    private  int growtn;
    private int weight;

    public Dog(String nickname, String kindom, String type, String breed, int growtn, int weight) {
        super(nickname, kindom, type);
        this.breed =breed;
        this.growtn =growtn;
        this.weight=weight;
    }
    public void toVoice(){
        super.toVoice();
        System.out.println( " Gav ");
    }
    public void   toEat(){
        weight = weight + 3;
        System.out.println("I am too many eat my new  weigth " + weight);

}}

package homework.pet.type;

public class Pet {
    // поля класса

    private int Id;
    private String type;
    private int age;
    private String nickname;

    public Pet(int id, String type, int age, String nickname) {
        Id = id;
        this.type = type;
        this.age = age;
        this.nickname = nickname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void  displayPet(){
        System.out.println("  id  " + Id    + "   type   " + type + "  age  " + age + "  nickname  " + nickname);
    }
    public  void  sleep(){
        System.out.println("pet sleep ! ");
    }
    public  void  meat(){
        System.out.println("Hrum Hrum ");
    }
    public void go(){
        System.out.println("Go out");
    }
}

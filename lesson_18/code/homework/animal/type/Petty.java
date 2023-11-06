package homework.animal.type;

public class Petty {
    private String nickname;
    private String kindom;
    private String type;

    public Petty(String nickname, String kindom, String type) {
        this.nickname = nickname;
        this.kindom = kindom;
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getKindom() {
        return kindom;
    }

    public void setKindom(String kindom) {
        this.kindom = kindom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void toVoice() {
        System.out.println(" The " + nickname);
    }
}

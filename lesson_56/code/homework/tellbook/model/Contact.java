package homework.tellbook.model;

public class Contact {
    private String name ;

    private  String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String lastName) {
        name = name;

        this.phoneNumber = phoneNumber;


    }
}

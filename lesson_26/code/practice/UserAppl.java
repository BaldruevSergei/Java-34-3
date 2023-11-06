package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail.com", "Mfvv11  f*"); // создаем пользователя

        System.out.println(user); // печатаем

        user.setEmail("peter@gmail.com");
        System.out.println(user); // печатаем
    }
}
//1) min 8 symbols
//    2) min one symbol of uppercase
//    3) min one symbol of lowercase
//    4) min one digit
//    5) min one special symbol (!%@*&)
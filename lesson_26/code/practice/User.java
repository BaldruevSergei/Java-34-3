package practice;
// istokgor@mail.ru
//1) @ exists and only one -> @ только одна
//2) dot after @ -> после @ должна быть как минимум одна точка (.) после @
//3) after last dot minimum 2 symbols -> после последней точки должно быть минимум 2 символа
//4) alphabetic, digits, _ , - , . , @ -> разрешены  буквы алфавита, цифры и некоторые служебный символы
// */
public class User {

    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid");
        }
    }





    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@');// ищем индекс @ (index = 10)
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) { // @ проверяем наличие @ и что она одна
            return false; // вернем false

        }
        if (email.indexOf('.', indexAt) == -1) { // не нашлась точка, начиная с позиции @
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) { // более 1-го символа после 1 точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') // отрицание всего
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }

        }
        return true;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
            String  str = password;

            System.out.println(" Your Password " + password +  " is  valid");
        } else {
            System.out.println("Password not valid");
        }
    }
    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */   //В классе User, который делали в классной работе, реализовать метод валидации пароля.
    // В классе UserAppl, в методе main, проверить правильность работы валидатора.
    // Помните, что подход к валидации пароля, отличается от подхода к валидации емейла.
    // Валиден пароль или нет, мы можем сообщить только после того, как проверим все символы в пароле.
    // Поэтому в цикле, в котором мы проверяем поочередно каждый символ пароля, надо где-то сохранить информацию
    // о каждой проверке (массив типа boolean). И после цикла, проанализировать эту информацию.
    private boolean validatePassword(String password) {
        boolean[] array = new boolean[4];
        if (password.length() >= 8) { // здесь сразу отсекаем пароль меньше 8 символов

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    array[0] = true;
                }
                if ((c >= 'a' && c <= 'z')) {
                    array[1] = true;
                }
                if (c >= '0' && c <= '9') {
                    array[2] = true;
                }
                if ((c == '!') || (c == '%') || (c == '@') || (c == '*') || (c == '&')) {
                    array[3] = true;
                }
            }
            return array[0] && array[1] && array[2] && array[3]; //  если условие выполняется, то пароль valid

        }
        return false;
    }












    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}

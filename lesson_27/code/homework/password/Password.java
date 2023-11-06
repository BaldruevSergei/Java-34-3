package homework.password;

public class Password {
    public boolean validatePassword(String password) {
        boolean[] array = new boolean[5];
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
                if (c == ' '){      // условие когда встречается хотя бы один пробел в пароле
                    array[4] =false;
                }
            }
            return array[0] && array[1] && array[2] && array[3]&& array[4]; //  если условие выполняется, то пароль valid

        }
        return false;
    }


    public boolean validateEmail(String email) {
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
}

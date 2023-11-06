package homework.password;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
Password password;



    @BeforeEach
    void setUp() {
        password = new Password();
    }
    //1) min 8 symbols
//    2) min one symbol of uppercase
//    3) min one symbol of lowercase
//    4) min one digit
//    5) min one special symbol (!%@*&)
    @Test
    void validatePasswordTest() {
        String str = "Amk! sk79s";
        assertEquals(true,password.validatePassword(str));
    }

    @Test
    void validateEmailTest() {
        String str = "Istokgor@mail.ru";
        assertEquals(true,password.validateEmail(str));
    }
}
package practice.sentecies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceTest {
Sentence sentence;
    @BeforeEach
    void setUp() {
         sentence = new Sentence();
    }

    @Test
    void countWordsTest() {
        String str = "sdsdc $ * & sdds";
        assertEquals(2, sentence.countWords(str));
    }

    @Test
    void countSymbolsTest() {
        String str = "One Two . Ther%!";
        assertEquals(16,sentence.countSymbols(str));
    }
}
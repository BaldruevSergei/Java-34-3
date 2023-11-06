package practice.sentecies;

public class Sentence {
     // поле класса типа Sentence
    // Count words in Sentence
    public  int countWords(String str) {
        String[] words = str.split(" ");
        String symbols = " !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪¢£¤¦§¨©ªº«»¬®¯°‰´µ¶·¸¹¿←↑→↓↔⇒⇐⇔⇑⇓↵♠♣♥♦◊○●◄▼►▲■▪▫♀♂™•";// строка специальных символов
        String[] symbolsArr = symbols.split("");

        int n = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < symbolsArr.length - 1; j++) {

                if (symbolsArr[j].equals(words[i])) {
                    n++;
                }
            }

        }
        return words.length -n;
        // return words.length- n;
    }

      //  System.out.println(words.length);
      //  System.out.println(n);




    // Count symbols in  Sentence

    public  int countSymbols(String str) {
        String[] symbols = str.split("");
        return symbols.length;
        // TODO исключить пробелы из результата метода
    }


}


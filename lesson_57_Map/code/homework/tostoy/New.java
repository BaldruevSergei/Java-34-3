package homework.tostoy;

import java.util.HashMap;
import java.util.Random;
import java.util.stream.IntStream;

public class New{

    public static void main(String[] args) {
        int maxNumbers = 1_000_000;
        Random random = new Random();

        HashMap<Integer, Long> digitFrequencyMap = IntStream.range(0, maxNumbers)
                .mapToObj(i -> random.nextInt(maxNumbers))
                .flatMap(number -> String.valueOf(number).chars().mapToObj(c -> c - '0'))
                .collect(HashMap::new, (map, digit) -> map.merge(digit, 1L, Long::sum), HashMap::putAll);

        digitFrequencyMap.forEach((digit, frequency) ->
                System.out.println("Digit: " + digit + ", Frequency: " + frequency));
    }
}


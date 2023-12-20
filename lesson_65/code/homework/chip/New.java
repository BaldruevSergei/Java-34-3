package homework.chip;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class New {
    public static void main(String[] args) {
        String fullName = "Potter Mrs. Thomas Jr (Lily Alexenia Wilson)";
        // Удаляем пробелы из строки
        String noSpacesName = fullName.replaceAll("\\s", "");

        // Используем регулярное выражение для удаления символов кроме букв внутри кавычек
        Pattern pattern = Pattern.compile("\"[^\"]*\"");
        Matcher matcher = pattern.matcher(noSpacesName);

        StringBuilder result = new StringBuilder();
        int lastIndex = 0;

        while (matcher.find()) {
            result.append(noSpacesName, lastIndex, matcher.start());
            result.append(matcher.group(0).replaceAll("[^a-zA-Z]", ""));
            lastIndex = matcher.end();
        }

        result.append(noSpacesName, lastIndex, noSpacesName.length());

        System.out.println("Cleaned Name: " + result.toString());
    }
}

package homework.two_file;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
//В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
//Имена файлов принимать через массив args. Два файла считаем одинаковыми,
//если у них одинаковая длина, и на тех же позициях стоят те же байты.
//Результат должен быть выведен на консоль в виде сообщения.

public class CompareFileAppl {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CompareFileAppl file1 file2");
            return;
        }

        String fileName1 = args[0];
        String fileName2 = args[1];

        try (FileInputStream file1 = new FileInputStream("./distr/Утверждаю.txt");
             FileInputStream file2 = new FileInputStream("./distr/Утверждаю1.txt")) {

            if (areFilesEqual(file1, file2)) {
                System.out.println("Files are equal.");
            } else {
                System.out.println("Files are not equal.");
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    private static boolean areFilesEqual(FileInputStream file1, FileInputStream file2) throws IOException {
        int bufferSize = 4096;
        byte[] buffer1 = new byte[bufferSize];
        byte[] buffer2 = new byte[bufferSize];

        int bytesRead1, bytesRead2;

        do {
            bytesRead1 = file1.read(buffer1);
            bytesRead2 = file2.read(buffer2);

            if (bytesRead1 != bytesRead2 || !Arrays.equals(buffer1, buffer2)) {
                return false;
            }

        } while (bytesRead1 != -1 && bytesRead2 != -1);

        return true;
    }
}



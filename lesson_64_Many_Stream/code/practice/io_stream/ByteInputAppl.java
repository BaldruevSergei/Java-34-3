package practice.io_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputAppl {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("./distr/Утверждаю.txt");

           try {
               /*System.out.println("Available: " + fin.available()); //
               int a = fin.read();
               System.out.println(a);
               System.out.println("Available: " + fin.available());
                a = fin.read();
               System.out.println("Available: " + fin.available());

               // кАК СЧИТАТЬ ИЗ ФАЙЛА
               // Option 1*/
             /*  int a = fin.read();
               while (a   !=-1) {
                   System.out.println(a);
                   a = fin.read(); // 257 -256 = 1 получаем на выходе
               }*/

               // Option 2
             /*  int length = fin.available(); // сколько байт доступно для чтение
               for (int i = 0; i < length; i++) {
                   int a = fin.read();
                   System.out.println(a);
               }*/
                // option 3
               int length = fin.available(); // сколько байт доступно для чтения
               byte[] arr = new byte[length];
               fin.read(arr);
               for (byte b : arr) {
                   System.out.println(b);
               }

           }
           catch (IOException e) {
               throw  new RuntimeException(e);
           }
     }

}

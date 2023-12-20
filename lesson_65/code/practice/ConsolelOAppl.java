package practice;

import java.io.*;

public class ConsolelOAppl {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name");
        String str =br.readLine();
        System.out.println(str);

        PrintWriter pw = new PrintWriter(new FileWriter(str, true));
        System.out.println("Type the text here, pls");
        str = br.readLine();
        while (!"stop".equalsIgnoreCase(str)) {
            pw.println(str);
            System.out.println("Type the text here, pls");
            str = br.readLine();
                    }
        pw.flush();
        pw.close();
    }
}
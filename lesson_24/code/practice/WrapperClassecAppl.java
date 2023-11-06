package practice;

public class WrapperClassecAppl {
    public static void main(String[] args) {
        // количество цифр  в числе , версия 2 (делим на 10 до поучения 0 цикл while)
        Integer x = 1987654321;
        String st = x.toString();
        int l = st.length();
        System.out.println("Number of digits in " + x+  " = " + l);
        System.out.println(x.MAX_VALUE);
        double y = 32456.78;
        String st1 = x.toString();
        System.out.println("Number of digits in " + x + " = " + st1.length());

        // присвоение и вычисчления
        int n =20;
        Integer m = 10;
        System.out.println(" n = " + n);
        System.out.println("m = "+ m);
        m = m + n; // автораспоковка и автоупаковка
        System.out.println("m + n  = " + m);
        Double pi = 3.14;
        double circeLength = 2 * pi * 10;

        System.out.printf("circe Lenght = %.2f" , circeLength);
        System.out.println();
        // константы  классов - оберток
        System.out.println(" --------------- Constant of Wrapper Classes");
        System.out.println("Integer MAX" + Integer.MAX_VALUE);
        System.out.println("Integer MIN" + Integer.MIN_VALUE);
        System.out.println("Long MAX" + Long.MAX_VALUE);
        System.out.println("Long MIN" + Long.MIN_VALUE);
        System.out.println(" Double MAX" + Double.MAX_VALUE);
        System.out.println(" Double MIN" + Double.MIN_VALUE);

        // обработка деления на 0

        System.out.println("----------- Not-aNumber (NAN) ------------------- ");
        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)){
            System.out.println("Wrong operation or wrong result");


        }  else {
            System.out.println(a);
        }

        System.out.println("Parsing String to number");
        String str = "0987654321";
        int num = Integer.parseInt(str);
        System.out.println("String " + str + " = " + num);

        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1);
        System.out.println("Exp = " + exp);
    }

}

package practice;

public class StringBuilderAppl {
    public static void main(String[] args) {
        // StringBuilder - это класс в нем есть полезные методы для работы со строками
        //
                String str = "Java";
                // str= str + "_" + 11
                str = str.concat("_"); // concat - склеивание
                str = str.concat("" + 11); // к строке добавдяем примитив
                System.out.println(str);

                StringBuilder sb = new StringBuilder("Java");
                System.out.println(sb);
                sb.append("_").append(11);
                System.out.println(sb);
                sb.reverse(); // строка задом наперед
                System.out.println(sb);
                // можно ли вернуть тип StringBuilder обрато в String?
                str = sb.toString();
                System.out.println(str);
            }
        }




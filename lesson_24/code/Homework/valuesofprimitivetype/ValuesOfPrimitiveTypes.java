package Homework.valuesofprimitivetype;

import com.sun.jdi.CharType;

public class ValuesOfPrimitiveTypes {
    public static void main(String[] args) {

//byte long double float short char int long double float
        int x = 0;

        for (int i = 0; i < args.length; i++) {
              if  (args[i].equals("byte")){

                System.out.print("Byte MAX  " + Byte.MAX_VALUE + "  ");
                System.out.print("Byte MIN  " + Byte.MIN_VALUE + "  ");
                System.out.println();
                x++;
            }
            else  if (args[i].equals("short")){

                System.out.print("Shot MAX  " + Short.MAX_VALUE + "  ");
                System.out.print("Shot MIN  " + Short.MIN_VALUE + "  ");
                System.out.println();
                x++;
            }

            else  if (args[i].equals("int")) {

                System.out.print("Int MAX  " + Integer.MAX_VALUE + "  ");
                System.out.print("Int MIN  " + Integer.MIN_VALUE + "  ");
                System.out.println();
                x++;
            }
            else if (args[i].equals("char")) {

                System.out.print("Char MAX  " + Character.MAX_VALUE + "  ");
                System.out.print("Char MIN  " + Character.MIN_VALUE + "  ");
                System.out.println();
                x++;

            }
            else if (args[i].equals("long")) {

                System.out.print("Long MAX  " + Long.MAX_VALUE + "  ");
                System.out.print("Long MIN  " + Long.MIN_VALUE + "  ");
                System.out.println();
                x++;
            }
            else if (args[i].equals("float")) {
                String str6 = args[i];
                System.out.print("Float MAX  " + Float.MAX_VALUE + "  ");
                System.out.print("Float MIN  " + Float.MIN_VALUE + "  ");
                System.out.println();

            }
             else if (args[i].equals("double")) {

                System.out.print("Double MAX  " + Double.MAX_VALUE + "  ");
                System.out.print("Fouble MIN  " + Double.MIN_VALUE + "  ");
                System.out.println();
                x++;
            }
             else {
                  System.out.println("Wrong type");
              }




        }

        };

    }




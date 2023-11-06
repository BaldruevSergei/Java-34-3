package practics;

public class App {
    public static void main(String[] args) {
        double constanta = pi();
        System.out.println(constanta);
        printPi(constanta);
        double res = circleLenght(100);
        System.out.println("L = " + res);
    }
    public static double circleLenght(double radius){
        double l = 2 * pi() * radius;
        return l;
    }
    public static double pi(){
        double pi = 3.1415926;
        return pi;
    }
    public static void printPi(double p){
        System.out.println("Pi = " + p );
    }
}




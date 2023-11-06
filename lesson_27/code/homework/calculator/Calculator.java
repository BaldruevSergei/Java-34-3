package homework.calculator;
//Задача 1. Реализовать 5 методов для калькулятора (сложение, вычитание, умножение, деление с остатком,
// целая часть от деления), который работает с целыми числами. Покрыть все методы тестами.
public class Calculator {



        public int addition(int a, int b){
            int d = b + a;

            return d;
        }
        public int substraction ( int a, int b){
            int d = a - b;
            return d;
        }
        public int multiplication ( int a, int b){
            int d = a * b;
            return d;
        }
        public double division ( int a, int b){
            double d = a / b;
            return d;
        }

        public float DivisionRemainder ( int a, int b){
            float d = a % b;
            return d;
        }


    }


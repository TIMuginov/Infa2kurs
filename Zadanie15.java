import java.util.Scanner;

public class Zadanie15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите количество разбиений для 1вой функции: ");
        double n1 = sc.nextDouble();
        System.out.println( Integral1(-Math.PI, Math.PI, n1));
        System.out.print(" Введите количество разбиений для 2ой функции: ");
        double n2 = sc.nextDouble();
        System.out.println( Integral2(-Math.PI, Math.PI, n2));
        System.out.print(" Введите количество разбиений для 3ей функции: ");
        double n3 = sc.nextDouble();
        System.out.println( Integral3(-Math.PI, Math.PI, n3));
    }

    static double Function1(double x) {

        return 2 * Math.sin(x) + 1;
    }
    static double Function2(double x) {

        return -(Math.pow(x/Math.PI,2))-2*x+5*Math.PI;
    }
    static double Function3(double x) {

        return 0.5*Math.pow(Math.cos(x),2)+1;
    }


    static double Integral1(double a, double b, double n) {
        int i;
        double result;
        double h;//шаг
        result = 0;
        h = (b - a) / n;
        for (i = 0; i < n; i++) {
            result += Function1(a + i  * h);
            result *= h;
        }
        return result;
    }


    static double Integral2(double a, double b, double n) {
        int i;
        double result;
        double h;//шаг
        result = 0;
        h = (b - a) / n;
        for (i = 0; i < n; i++) {
            result += Function2(a + i  * h);
            result *= h;
        }
        return result;
    }
    static double Integral3(double a, double b, double n) {
        int i;
        double result;
        double h;//шаг
        result = 0;
        h = (b - a) / n;
        for (i = 0; i < n; i++) {
            result += Function3(a + i  * h);
            result *= h;
        }
        return result;
    }}





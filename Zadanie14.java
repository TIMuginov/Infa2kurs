import static java.lang.Math.*;

public class Zadanie14 {

    public static double f1(double x) { ///для первой функции

        return (x * sin(x)) - 0.5;

    }
    public static void Popolam1( double eps,  double a, double b,double c) {

        do {
            c = (a + b) / 2;
            if (f1(c) == 0) break;
            if (f1(c) * f1(a) < 0)
                b = c;
            else
                a = c;
        }

        while ((b - a) > eps);

        System.out.println("Для 1 функции = " + (b + a) / 2);
        System.out.println("f1(x) =" + f1(c));

    }

    public static double f2(double x2) {

        return log10(pow(x2, 2)-3*x2+2);

    }

    public static void Popolam2( double eps,  double a, double b,double c) {

        do {  c=(a+b)/2;
            if(f2(c)==0) break;
            if(f2(c)*f2(a)<0)
                b=c;
            else
                a=c;

        }
        while ((b-a)>eps) ;
        System.out.println("Для 2 функции = "+(b+a)/2);
        System.out.println("f2(x) ="+f2(c));

    }

    public static double f3(double x3) {

        return log10(pow(x3, 2)-3*x3+2);

    }

    public static void Popolam3( double eps,  double a, double b,double c) {

        do {  c=(a+b)/2;
            if(f3(c)==0) break;
            if(f3(c)*f3(a)<0)
                b=c;
            else
                a=c;

        }
        while ((b-a)>eps) ;

        System.out.println("Для 3 функции = "+(b+a)/2);
        System.out.println("f3(x) ="+f3(c));

    }
    public static double f4(double x4) {

        return 0.5* tan((2/3)*(x4+ PI/4))-1;

    }

    public static void Popolam4( double eps,  double a, double b,double c) {

        do {  c=(a+b)/2;
            if(f4(c)==0) break;
            if(f4(c)*f4(a)<0)
                b=c;
            else
                a=c;

        }
        while ((b-a)>eps) ;

        System.out.println("Для 4 функции = "+(b+a)/2);
        System.out.println("f4(x) ="+f4(c));

    }
    public static void main(String[] args) {

        Popolam1(0.0001,0, PI, 0);
        System.out.println();

        Popolam2(0.0001,0,0.9, 0);
        System.out.println();

        Popolam3(0.0001, 2.1,5, 0);
        System.out.println();

        Popolam4(0.0001, PI,2* PI, 0);

    }



}
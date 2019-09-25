public class Zadanie11 {

        public static void main(String[] args) {


            System.out.println("Значения первой функции");
            f1();
            System.out.println();
            System.out.println("Значения второй функции");
            f2();
            System.out.println();
            System.out.println("Значения третьей функции");
            f3();
            System.out.println();
            System.out.println("Значения четвёртой функции");
            f4();

        }
        public static void f1() {

            double x,y;

            for (x=-2*Math.PI;x<=2*Math.PI;x+=Math.PI/6) {

                y=2*Math.sin(x)+1;
                System.out.println(y);
            }
        }

        public static void f2() {

            double x,y;
            for (x=-2*Math.PI;x<=2*Math.PI;x+=Math.PI/6) {
                y=Math.pow((x/Math.PI)-1,2);
                System.out.println(y);

            }}
        public static void f3() {
            double x,y;
            double b=2*Math.PI;
            for (x=-2*Math.PI;x<=b;x+=Math.PI/6) {

                y=(-Math.pow(x/Math.PI,2))-2*x+5*Math.PI;

                System.out.println(y);
            }}

        public static void f4() {

            double x,y;

            for (x=-2*Math.PI;x<=2*Math.PI;x+=Math.PI/6) {

                y=0.5*Math.pow(Math.cos(x), 2)+1;

                System.out.println(y);
            }


        }}

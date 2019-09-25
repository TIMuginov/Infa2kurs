public class Zadanie23 {


        public static void main(String[] args) {


            double b = 2 * Math.PI;
            for (double i = -2 * Math.PI; i <= b; i += Math.PI / 6) {

                c1 lambda = (y, x) -> y = 0.5 * Math.pow(Math.cos(x), 2) + 1;
                double x = 0;
                x += i;
                double y = 0;
                System.out.println(lambda.result(y, x));
            }
        }
        interface c1 {
            double result(double y, double x);
        }


    }




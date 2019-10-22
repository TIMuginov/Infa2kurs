
import java.util.*;

public class FirstQest {
    public static void main(String[] args) {
        StackBack();
        revStackBack();
qu();
    }
  public static void StackBack(){

     int chislo=1234567;


        Stack<Byte>TipoArr=new Stack<Byte>();

        while (chislo!=0){
            TipoArr.push((byte)(chislo%10));
            chislo/=10;

            while (!TipoArr.isEmpty()){
                System.out.println(TipoArr.pop());
            }

        }

    }
    public static void revStackBack() {
        System.out.println("реверсивный стэк");
        int K = 1;

        int chislo = 23456543;
        Stack<Byte> TipoArr = new Stack<Byte>();

        while (chislo != 0) {
            if ((chislo = chislo / 10) > 0) {
                K++;
            }
            chislo /= 10;

        }
        while (K != 0) {

            TipoArr.push((byte) (chislo / Math.pow(10, K - 1)));
            chislo -= ((int) (chislo / Math.pow(10, K - 1))) * Math.pow(10, K - 1);
            K--;
        }
        while (!TipoArr.isEmpty()){
            System.out.println(TipoArr.pop());
        }}
        public static void qu(){
            System.out.println("QU");

            LinkedList<Integer> myQueue = new LinkedList<>();

            myQueue.add(1);
            myQueue.add(2);
            myQueue.add(3);
            myQueue.add(4);
            myQueue.add(5);
            myQueue.add(6);
            for(int pq : myQueue) {
                System.out.println(pq);


            }
            System.out.println("QU Reverse");


            LinkedList<String> queue = new LinkedList<>();
            queue.addAll(Arrays.asList("1", "2", "3", "4","5","6"));
            Collections.reverse(queue);

            while (! queue.isEmpty()) {
                System.out.println(queue.pop());
            }
        }

        }

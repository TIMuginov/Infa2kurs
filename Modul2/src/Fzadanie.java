import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fzadanie {


    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\2\\Desktop\\deusvult.txt");
        BufferedReader br = new BufferedReader(file);
        List<String> list=new ArrayList();
        String line=br.readLine();
        int i=0;
        while (line != null) {
            list.add(line);
            System.out.println(list.get(i));
            i++;
            line = br.readLine();
        }

        System.out.println("Сортировка по алфавиту");
        Collections.sort(list);
        System.out.println(list);


        System.out.println("Сортировка по длине строки");
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);


        System.out.println("Сортировка в лексикографичсеком порядке");
        list.sort(Comparator.naturalOrder());
        System.out.println(list);


        System.out.println("Сортировка по количеству заглавыных латинских букв в строке(по убыванию)");
        ComparatorUpper myPriceComparator = new ComparatorUpper();
        list.sort(myPriceComparator);
        System.out.println(list);

    }

    static class ComparatorUpper implements Comparator<String> {
        @Override
        public int compare(String s, String t1) {
            int a = 0, b = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) a++;
            }
            for (int i = 0; i < t1.length(); i++) {
                if (Character.isUpperCase(t1.charAt(i))) b++;
            }
            return Integer.compare(b, a);
        }
    }
}



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashSet;

public class Programm0 {

    // построчное считывание файла
    public static void main(String[] args) {
        String line = null;
        tablica();

        try {
            File file = new File("/C:\\Users\\2\\IdeaProjects\\untitled\\src\\module0");

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);
            int i = 1;

            line = reader.readLine();
            while (line != null) {
                System.out.printf("\n%-4d|%-57s|%-11s|%-11d|%14d|%14d|%14d\n", i, line, palindrome(line), line.length(), sizeOfBytes(line),24354, 32332);// место этих цифр нужно вызывать методы Хартли и Шенон,но я не сделал.
                cherta();
                i++;
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cherta() {
        for (int i = 0; i < 140; i++) {
            System.out.print("-");
        }
    }

    public static void tablica() {
        cherta();
        System.out.printf("\n%-4s|%-57s|%-11s|%34s", "№", "Cлово", "", "Количество информации\n");
        cherta();
        System.out.printf("\n%-4s|%-57s|%-11s|%-11s|%-14s|%-14s|%-14s", "", "", "", "Кол-во", "байт, размер", "бит,", "бит,");
        System.out.printf("\n%-4s|%-57s|%-11s|%-11s|%-14s|%-14s|%-14s", "", "", "палиндром", "символов", "в программе", "по Хартли", "по Шеннону\n");
        cherta();
    }

    public static int sizeOfBytes(String s) {
        byte[] i = s.getBytes();
        return i.length;
    }

    public static char palindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        boolean anotherS = s.equalsIgnoreCase(reversed);
        char plus = '+', minus = '-';
        if (anotherS) {
            return plus;

        } else {
            return minus;
        }
    }}

  /*  public static double Hartly(String s) {
        int size=(int)countUniqueCharacters(s);//колво букв в строке
    double I=size*Math.log10(33)/Math.log10(2);
return I;


    }
    public static double countUniqueCharacters(String s) {
        return s.chars().distinct().count();


    }
}


*/




    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileReader;
    import java.util.Scanner;
    import java.util.Stack;


    public class Persona40 {
       static Scanner sc=new Scanner(System.in);
        private String name, surname, sex;
        private int age;



    public Persona40(String name,String surname,String sex,int age){
        this.age=age;
        this.name=name;
        this.sex=sex;
        this.surname=surname;
    }
    public String toString(){
        return surname+" "+name+" "+sex+" "+age;
    }

        public static void main(String[] args) {

            Persona40 p=new Persona40(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
            System.out.println(p);
            System.out.println(p.toString());
            Stack<Persona40>stack=new Stack<>();
            stack.push(p);

            System.out.println("Все данные по стэк:"+stack);
            sc.close();
        }
    }
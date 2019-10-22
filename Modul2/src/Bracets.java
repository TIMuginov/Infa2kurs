import java.util.Scanner;
import java.util.Stack;

public class Bracets {
  static  Scanner sc=new Scanner(System.in);


  public static Boolean hmBr(String str){
      Stack<Character>stack=new Stack<>();
      char CharArr[]=str.toCharArray();

          for (char br : CharArr) {
              if (br == '(' | br== '[' | br == '{')
                 stack.push(br);

              else if (br == ')' | br == ']' | br == '}') {
                  if (br == ')' &&  stack.pop() == '(')
                      continue;
                  else if (br == ']' &&  stack.pop() == '[')
                      continue;
                  else if (br == '}' &&  stack.pop() == '{')
                      continue;
                  else
                      return false;
              }
          }

          return  stack.isEmpty();
      }

    public static void main(String[] args) {

        System.out.println(hmBr(sc.nextLine()));
        sc.close();
    }
    }


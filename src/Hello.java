import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        new Thread(()->{
            int goal  = 5;
            int counter  = 0;
            boolean repeating = true;
            while(repeating) {
                System.out.println("pasza");
                counter++;
                if (counter == goal) {
                    repeating = false;
                }
            }
            System.out.println("Counts time " +  counter);
        }).start();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Type name");
        String name = scanner.nextLine(); //Zwraca String i przechodzi do nowej linijki
        System.out.println("hello " + name);
        System.out.println("add age");
        int age = scanner.nextInt();
        System.out.println("age " + age);
    }

}
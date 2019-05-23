/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scnr.next();

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello, " + name + "!"); 
        } else {
            System.out.println("You aren't Alice or Bob... go away!");
        }
    }
}

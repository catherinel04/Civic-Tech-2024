import java.util.*;
import java.lang.Math;

public class CivicTech2024{

    public static void main(String[] args) {
        String out;
        
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the age of the user: ");
        int age = console.nextInt();
        System.out.print("Enter the DEI score: ");
        int dei = console.nextInt();
        System.out.print("Enter the edu score: ");
        int edu = console.nextInt();
        System.out.print("Enter the environ score: ");
        int environ = console.nextInt();
        System.out.print("Enter the infrastructure score: ");
        int in = console.nextInt();
        System.out.print("Enter the safety score: ");
        int safe = console.nextInt();
        System.out.print("Enter the transportation score: ");
        int trans = console.nextInt();
        System.out.print("Enter the local facilities score: ");
        int loc = console.nextInt();

        int fac = trans + loc + in;

        if (age < 15){
            out = "Sullivan";
        } else {
            int maxx = Math.max(dei, edu);
            maxx = Math.max(maxx, environ);
            maxx = Math.max(maxx, safe);
            maxx = Math.max(maxx, fac);
            if (maxx > 70){
                out = "Hacker";
            }
            if (maxx == dei){
                out = "Loop";
            }
            if (maxx == edu){
                out = "Linked Lists";
            }
            if (maxx == environ){
                out = "Github";
            } 
            if (maxx == safe){
                out = "Queue";
            }
            if (maxx == fac){
                out = "Stack";
            }
        }

        System.out.print("You are sorted into type: ");
        System.out.println(out);
}}

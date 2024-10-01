
package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(number1,number2);
    }
    public static void divisibleByThreeInRange(int number1, int number2) {
        for (int i = number1; i <number2+1; i++) {
            if(i%3==0) {
                System.out.println(i);
            }
        }
    }
 }

    
    

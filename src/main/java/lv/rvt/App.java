
package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number");
        int number2 = Integer.valueOf(scanner.nextLine());
if (number1 > number2) {
       System.out.println("Greater number is : "+number1);
}
else if (number2 > number1){
    System.out.println("Greater number is: "+number2);
}
else{
    System.out.println("The nubers are equal!");
}
    }
}
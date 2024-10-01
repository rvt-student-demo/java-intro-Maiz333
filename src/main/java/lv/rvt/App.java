
package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
public static void main(String[] args)
{
    Scanner reader = new Scanner(System.in);

    System.out.print("Give numbers: ");
    int sum = 0;
    int CountNumbers = 0;
    int videjais = 0;
    int odd = 0;
    int even = 0;

    while (true) {
        int input = Integer.valueOf(reader.nextLine());


        if (input < 0) {
            System.out.print("Thx!Bye!");
            break;
        }

        sum += input;
        CountNumbers++;
        videjais=sum/CountNumbers;
        if(input%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println();
    System.out.println("Sum: " + sum);
    System.out.println("numbers: " + CountNumbers);
    System.out.println("average: " + videjais);
    System.out.println("even: " + even);
    System.out.println("odd: " + odd);
}
}
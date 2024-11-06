package lv.rvt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics totalStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
    
            totalStatistics.addNumber(number);
            
            if (number % 2 == 0) {
                evenStatistics.addNumber(number);
            } else {
                oddStatistics.addNumber(number);
            }
        }


        System.out.println("Sum: " + totalStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}

package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWritter;
import java.until.Scanner;
public class App
{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person pers1 = new Person("John");
        Person antti = new Person("Antti");

        pers1.printPerson();
        System.out.println("");

        pers1.growOlder();
        for (int i=0;i<35;i++){
                pers1.growOlder();
        }

        pers1.printPerson();
}
}
   

    
    

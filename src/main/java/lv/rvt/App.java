
package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        printTriangle(4);
    }
    public static void printStars(int number) {
        int i = 1;
        while (i<number) {
                System.out.print("*");
                i++;
            }
            System.out.println();
     }
        public static void printSquare(int size) {
            System.out.println();
            int i = 1;
            while (i-1<size) {
                System.out.print("****");
                System.out.println();
                i++; 
            }
        }
        public static void printRectangle(int width, int height) {
            System.out.println();
            
            int a=1;
            while(a-1<height) { 
                int i = 1;
                while (i<width) {
                    System.out.print("*");
                    i++; 
            }
            System.out.println();
            a++;
        }
    }
    public static void printTriangle(int size) {
        System.out.println();
        int i = 1;
        while(i-1<size+1){
            int a = 1;
            while(a<i){
                System.out.print("*");
            a++; 
            }
            System.out.println();
            i++; 
        }
        
    }
}

    
    


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
        printTriangleTwo(4);
        christmasTree(4);
        christmasTree(10);
    }
    public static void printStars(int number) {
        int i = 0;
        while (i<number) {
                System.out.print("*");
                i++;
            }
    
     }
     public static void printSpaces(int number) {
        int i = 0;
        while (i<number) {
                System.out.print(" ");
                i++;
            }

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
    public static void printTriangleTwo(int size) {
        System.out.println();
        for(int i =0; i<size;i++){
            printSpaces(size-(i+1));
            printStars(i+1);
            System.out.println();
        }
    }
    public static void christmasTree(int height) {
        System.out.println();
        for(int i =0; i<height;i++){
             int a =1;
            printSpaces(height-(i));
            printStars(i+1);
            if(i>0){
                printStars(i);
         }
            System.out.println();
        }
            
        printSpaces(height-(1));
        printStars(3);
        System.out.println();
        printSpaces(height-(1));
        printStars(3);
        System.out.println();
            
    }
}


    
    

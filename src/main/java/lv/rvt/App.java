package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;


import org.w3c.dom.css.Counter;
public class App{
public static void main(String[] args) throws Exception{
    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

    System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  
    System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   
}
}

package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.css.Counter;
public class App
{
public static void main(String[] args) throws Exception {
        Timer timer = new Timer();

while (true) {
        System.out.println(timer);
        timer.advance();

        try {
                Thread.sleep(10);
        } catch (Exception e) {

        }
}
}
}

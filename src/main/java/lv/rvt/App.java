package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App 
{
    public static void main( String[] args )
    {
        long lastId = -1;
        try (BufferedReader reader = Utils.getReader("data.csv")) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter writter = Utils.getWriter("data.csv")) {
            // writter.newLine();
            // writter.write("2, user, 123");
            // writter.flush();
        
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}

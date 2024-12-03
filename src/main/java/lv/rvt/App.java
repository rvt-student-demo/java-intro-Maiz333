package lv.rvt;

import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> persons = PersonManager.getPersonList();
        Person person = new Person("Jegors", 16, 81, 196);

        for (Person person : persons) {
            System.out.println(person);
        }
        PersonManager.addPerson(person);
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    }
}

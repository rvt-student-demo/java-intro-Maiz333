package lv.rvt;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
        this.age = 0;

    }
    public void growOlder(){
        if(this.age<30){
        this.age++;
        }
    }
    public void printPerson(){
        System.out.println(this.name+ ", age"+ this.age+ " year");
    }
}
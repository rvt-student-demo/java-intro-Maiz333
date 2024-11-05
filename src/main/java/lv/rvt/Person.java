package lv.rvt;

public class Person {
    private String name;
    private int age;
    private String group;
    private int weight;
    private int height;

    public Person(String name){
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;

    }
    public void growOlder(){
        if(this.age<30){
        this.age++;
        }
    }
    public boolean isOfLeagalAge(){
        return this.age>=18;
    }
    public String getName(){
        return this.
        group;
    }
    public void setGroup(String group){
        this.name = name;
    }
    public void printPerson(){
        System.out.println(this.name+ ", age"+ this.age+ " year");
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }
    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
}
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
        this.age = age;

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
        name;
    }
    public void setGroup(String group){
        this.name = name;
    }
    public String toString(){
        return this.name + ", BMI: " + this.bodyMassIndex()
            + ", maximum heart rate: " + this.maximumHeartRate();
    }
    public void printPerson(){
        System.out.println(this.name+ ", age"+ this.age+ " years");
    }

    }
    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }
    public double maximumHeartRate(){
    return 206.3 - (0.711 * this.age);

    }

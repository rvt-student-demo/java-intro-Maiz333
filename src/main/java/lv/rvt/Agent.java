package lv.rvt;

public class Agent {
    private String name1;
    private String name2;
    public Agent(String initialVards, String initialUzvards){
        this.name1 = initialVards;
        this.name2 = initialUzvards;
    }
    public String toString(){
        return "My name is "+this.name2+", "+this.name1+" "+this.name2;
    }

}
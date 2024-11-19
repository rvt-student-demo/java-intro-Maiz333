package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private int weight;
    private int location;
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.weight = weight;
        this.location = location;
    }
    public Product(String name){
        this.name=name;
        this.location = "shelf";
        this.weight=1;
    }
    public Product(String name, String location){
        this.name=name;
        this.location = location;
        this.weight=1;
    }   
    public Product(String name, int weight){
        this.name=name;
        this.weight = weight;
        this.location="shelf";
    }
    public Product(String name, String location, int weight){
        this.name=name;
        this.weight=weight;
        this.location=location;
    
    }
    public String getName(){
        return name;
    }
    public String getWeight(){
        return weight;
    }
    public String getLocation(){
        return location;
    }
    @Override
    public String toString(){
        return this.name+ "("+this.weight+") can be found from the", +this.location;
}
}
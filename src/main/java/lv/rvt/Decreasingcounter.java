package lv.rvt;

public class Decreasingcounter {
    private int value;   
    
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }
    
    public void printValue() {
        System.out.println("value: " + this.value);
    }
    public void reset(){
        value=0;
        }
    
    public void decrement() {
        if(value>0){
        value=value-1;
        }
    }

}


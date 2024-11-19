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
    
    public void increase(int increaseBy){
            this.value+=increaseBy;
        }
    public void decrease(int decreaseBy){
        if((this.value-decreaseBy)>0){
            this.value-=decreaseBy;
        }
        else{
            this.value=0;
        }
    }

    public String toString(int value){
        return this.value;
    }
}


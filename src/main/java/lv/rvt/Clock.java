package lv.rvt;


public class Clock {
    private int value;
    private int limit;
    
    public Clock(int limit) {
        this.limit = limit;
        this.value = 0;
    }
    
    public void advance() {
        this.value+=1;
    
        if (this.value >= this.limit){
            this.value = 0;
        }
    }
    public int value(){
        return this.value;
    }
            
    public String toString() {
        if (this.value<10){
        return "0"+this.value;
    }
    return ""+this.value;
}
}

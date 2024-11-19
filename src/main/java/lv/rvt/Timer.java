package lv.rvt;

public class Timer {
    private ClockHand hundred;
    private ClockHand sec;

    public Timer() {
        this.hundred = new ClockHand(100);
        this.sec = new ClockHand(60);

}
public void advance() {
    this.sec.advance();

        if (this.sec.value() == 0) {
            this.hundred.advance();
        }
    }

    public String toString() {
        return this.hundred+ ":"+this.sec;
    }
}

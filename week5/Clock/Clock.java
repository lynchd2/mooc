public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
      this.hours = new BoundedCounter(hoursAtBeginning);
      this.minutes = new BoundedCounter(minutesAtBeginning);
      this.seconds = new BoundedCounter(secondsAtBeginning);
    }

    public void tick(){
      if(this.seconds.getValue() == 59) {
        this.seconds.setValue(0);
        this.minutes.setValue(this.minutes.getValue() + 1);
      }else {
        this.seconds.next();
      }
      if(this.minutes.getValue() == 59) {
        this.minutes.setValue(0);
        this.hours.setValue(this.hours.getValue() + 1);
      }   
      if(this.hours.getValue() == 23) {
        this.hours.setValue(0);
      }
    }

    public String toString() {
      return String.format("%02d", this.hours.getValue()) + ":" + String.format("%02d", this.minutes.getValue()) + ":" + String.format("%02d", this.seconds.getValue());
    }
}
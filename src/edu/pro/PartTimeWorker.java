package edu.pro;
/*
  @author   george
  @project   code-for-refactoring
  @class  PartTimeWorker
  @version  1.0.0 
  @since 06.12.22 - 15.50
*/

public class PartTimeWorker extends Worker {
    private int rate;
    private int hours;

    public PartTimeWorker(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return this.rate;
    }

    public int getHours() {
        return this.hours;
    }
}

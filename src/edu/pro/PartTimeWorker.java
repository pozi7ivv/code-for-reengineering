package edu.pro;
/*
  @author   george
  @project   code-for-refactoring
  @class  PartTimeWorker
  @version  1.0.0 
  @since 06.12.22 - 15.50
*/

public class PartTimeWorker {
    private String name;
    private  int rate;
    private  int hours;

    public PartTimeWorker(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public PartTimeWorker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}

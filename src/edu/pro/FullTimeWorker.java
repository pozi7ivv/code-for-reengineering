package edu.pro;
/*
  @author   george
  @project   code-for-refactoring
  @class  FullTimeWorker
  @version  1.0.0 
  @since 06.12.22 - 15.46
*/

public class FullTimeWorker extends Worker {
    private int salary;

    public FullTimeWorker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }
}

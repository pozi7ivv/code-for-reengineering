package edu.pro;
/*
  @author   george
  @project   code-for-refactoring
  @class  FullTimeWorker
  @version  1.0.0 
  @since 06.12.22 - 15.46
*/

public class FullTimeWorker {
    private String name;
    private int salary;

    public FullTimeWorker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public FullTimeWorker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

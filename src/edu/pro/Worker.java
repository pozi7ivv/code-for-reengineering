package edu.pro;

public abstract class Worker {
    protected String name;

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }
}

package com.springcore.ref;

public class test2 {
    private int test2var;

    public int getTest2var() {
        return test2var;
    }

    public void setTest2var(int test2var) {
        this.test2var = test2var;
    }

    public test2() {
        super();
    }
    public test2(int test2var) {
        this.test2var = test2var;
    }

    @Override
    public String toString() {
        return "test2{" +
                "test2var=" + test2var +
                '}';
    }
}

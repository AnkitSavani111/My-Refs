package com.springcore.ref;

public class test1 {
    private int test1var;
    private test2 objecttest2;

    public test1() {
        super();
    }

    public test1(int test1var, test2 objecttest2) {
        this.test1var = test1var;
        this.objecttest2 = objecttest2;
    }

    @Override
    public String toString() {
        return "test1{" +
                "test1var=" + test1var +
                ", objecttest2=" + objecttest2 +
                '}';
    }

    public int getTest1var() {
        return test1var;
    }

    public void setTest1var(int test1var) {
        this.test1var = test1var;
    }

    public test2 getObjecttest2() {
        return objecttest2;
    }

    public void setObjecttest2(test2 objecttest2) {
        this.objecttest2 = objecttest2;
    }
}

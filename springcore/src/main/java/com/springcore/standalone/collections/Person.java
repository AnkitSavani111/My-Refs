package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;

    private Map<String, Integer> feeStructure;

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person(List<String> friends, Map<String, Integer> feeStructure, Properties properties) {
        this.friends = friends;
        this.feeStructure = feeStructure;
        this.properties = properties;
    }

    private Properties properties;
    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Person() {
        super();
    }

    public Person(List<String> friends, Map<String, Integer> feeStructure) {
        super();
        this.friends = friends;
        this.feeStructure = feeStructure;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

}

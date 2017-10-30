package com.test;

public class People {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "People{name: " + this.name + ", age:" + this.age + "}";
    }
}
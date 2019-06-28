package com.company;

public class ClassSingleton {
    private static ClassSingleton ourInstance;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ClassSingleton getInstance(String name) {
        if(ourInstance == null){
            ourInstance = new ClassSingleton(name);
        }
        return ourInstance;
    }

    //constructor
    private ClassSingleton(String name) {
        this.name = name;
    }
}

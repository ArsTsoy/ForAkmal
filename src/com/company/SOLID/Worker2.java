package com.company.SOLID;

public class Worker2 implements Cookable, Workable, Cleanable {

    public void serveFood(){
        System.out.println("I'm serving some food");
    }

    @Override
    public void cleanRoom() {
        System.out.println("clean");
    }

    @Override
    public void cook(String food) {
        System.out.println("cook");
    }

    @Override
    public void doSomeWork() {
        System.out.println("do some work");
    }
}

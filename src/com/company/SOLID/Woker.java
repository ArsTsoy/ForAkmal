package com.company.SOLID;

public class Woker implements Cleanable, Workable, Cookable {

    @Override
    public void doSomeWork(){
        System.out.println("I'doing some work");
    }

    @Override
    public void cook(String food){
        System.out.println("Not cooking");
    }

    @Override
    public void cleanRoom(){
        System.out.println( "No");
    }
}

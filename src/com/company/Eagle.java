package com.company;

public class Eagle extends Animal{
    public void fly(){
        System.out.println("Орлы летят на высоком уровне чем вороны");
    }
    @Override
    public void aVoid() {
        fly();
    }
}
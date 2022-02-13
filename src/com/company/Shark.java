package com.company;

public class Shark extends Animal{
    public void attack(){
        System.out.println("Акулам свойственно аттаковать на слабых они цари в воде");
    }
    @Override
    public void aVoid() {
        attack();
    }
}

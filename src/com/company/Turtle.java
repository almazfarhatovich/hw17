package com.company;

public class Turtle extends Animal{
    public void swim(){
        System.out.println("Черепахи медленны в суше, но они как молнии в воде");
    }
    @Override
    public void aVoid() {
        swim();
    }
}

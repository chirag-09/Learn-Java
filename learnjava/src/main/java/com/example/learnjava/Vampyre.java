package com.example.learnjava;

public class Vampyre extends Enemy {
    public Vampyre(String name,int hitPoint) {
        super(name,hitPoint,3);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }

}

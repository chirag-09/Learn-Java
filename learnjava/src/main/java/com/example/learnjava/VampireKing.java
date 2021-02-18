package com.example.learnjava;


import java.util.Random;

public class VampireKing extends Vampyre{
    public VampireKing(String name) {
        super(name,160);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }

    public boolean dodges(){
        Random random=new Random();
        int chance= random.nextInt(6);
        if(chance>2){
            System.out.println("dracula dodges");
            return true;
        }
        return false;
    }
}

package com.example.learnjava;

public class Enemy {
    private String name;
    private int hitPoint;
    private int lives;

    public Enemy(String name, int hitPoint, int lives) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitpoint=this.hitPoint-damage;
        if(remainingHitpoint>0) {
            setHitPoint(remainingHitpoint);
            System.out.println("I took "+ damage+" point damage and have "+remainingHitpoint+" hitpoints left");
        }
        else {
            this.lives-=1;
            if(this.lives>0) {
                setHitPoint(hitPoint);
                System.out.println("i have lost a life");
            }
            else
                System.out.println("no lives left");
        }
    }

    public void showInfo(){
        System.out.println("name: "+this.name+" lives :"+this.lives+" hitpoints "+this.hitPoint);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}

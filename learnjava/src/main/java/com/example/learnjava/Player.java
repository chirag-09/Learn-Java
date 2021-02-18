package com.example.learnjava;

import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private  Weapon weapon;
    private ArrayList<Loot> inventory;


    public Player(){
        this("Unknown Player");
    }
    public  Player(String handle){
        this(handle,1);
//        handleName=handle;
//        lives=3;
//        level=1;
//        score=0;
    }

    public  Player(String  handle,int startingLevel){
//        this.handleName=handle;
//        this.lives=3;
//        this.level=startingLevel;
//        this.score=0;
        setHandleName(handle);
        setLevel(startingLevel);
        setLives(3);
        setScore(0);
        setDefaultWeapon();
        inventory=new ArrayList<>();   //initialize inventory toa new empty list
    }

    public void setDefaultWeapon(){
        this.weapon=new Weapon("sword",1200,900);
    }

    public  void  setNameAndLevel(String name,int level){
        setHandleName(name);
        setLevel(level);
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if(handle.length()<3)
            return;
        this.handleName = handle;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;                               //because we dont want player to change the inventor compleatly
//    }                                                                only add or remove items
    public  void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }
    public boolean dropLoot(Loot loot){
        if(this.inventory.contains(loot)){
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public boolean dropLoot(String dropLoot){
        for(Loot current:inventory){
            if(current.getName().equals(dropLoot)) {
                inventory.remove(current);
                return true;
            }

        }
        return false;
    }

    public  void showInventory()
    {
        for(Loot i:inventory)
            System.out.println(i.getName());
        System.out.println("=========================");
    }
    public int score(){
        int total=0;
//        for(int i=0;i<inventory.size();i++){
        for(Loot current:inventory){
//            Loot current=inventory.get(i);
            total+=current.getValue();
        }
        return total;
    }
}

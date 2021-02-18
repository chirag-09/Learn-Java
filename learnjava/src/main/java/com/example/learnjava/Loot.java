package com.example.learnjava;

enum LootType {POTION,RING,ARMOR}
public class Loot {
    private String name;
    private LootType loot;
    private int value;

    public Loot(String name, LootType loot, int value) {
        this.name = name;
        this.loot = loot;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LootType getLoot() {
        return loot;
    }

    public void setLoot(LootType loot) {
        this.loot = loot;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

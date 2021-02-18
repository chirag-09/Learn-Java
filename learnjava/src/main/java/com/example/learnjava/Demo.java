package com.example.learnjava;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
//        Player tim = new Player();
//        tim.setNameAndLevel("tim", 5);
//        System.out.println(tim.getHandleName());
//        System.out.println("lives" + tim.getLives());
//        System.out.println("level" + tim.getLevel());
//        System.out.println(tim.getWeapon().getName());
//        Weapon myAxe = new Weapon("axe", 30, 60);
//        tim.setWeapon(myAxe);
//        System.out.println(tim.getWeapon().getName());
//
//        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
//        tim.pickUpLoot(redPotion);
//        tim.pickUpLoot(new Loot("chest armour", LootType.ARMOUR, 10));
//        tim.pickUpLoot(new Loot("ring", LootType.RING, 10));
//        tim.pickUpLoot(new Loot("Invisible spl", LootType.POTION, 10));
//        tim.showInventory();
//
////        Loot bluePotion=new Loot("Blue Potion",LootType.POTION,5);
//        boolean wasDeleted = tim.dropLoot(redPotion);
//        System.out.println(wasDeleted);
//        tim.showInventory();
//
//        Enemy enemy=new Enemy("test enemy",10,3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(10);
//        enemy.showInfo();
//
//        Troll uglyTroll=new Troll("ugly");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(33);
//
//        Vampyre vlad=new Vampyre("vlad",60);
//        vlad.showInfo();
//        vlad.takeDamage(8);
//        vlad.showInfo();
//
//        VampireKing vk=new VampireKing("vampire king");
//        vk.showInfo();
//        vk.takeDamage(160);
//        vk.showInfo();
//
//        while(vk.getLives()>0){
//            if(vk.dodges()){
//                continue;
//            }
//            vk.takeDamage(160);
//            vk.showInfo();
//        }
//    }
        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());
    }
}

package by.pvt.zoopark;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animals dog1 = new Dog("Rex", "Ovcarka", 12, "Green", 15, "Meat");
        Animals dog2 = new Dog("Kelly", "Ovcarka", 10, "Yellow", 15, "Meat");
        Animals dog3 = new Dog("Pork", "Ovcarka", 13, "Red", 15, "Meat");
        Animals bird1 = new Bird("Vorobey", 1000, "Grey", 8, "bread");
        Animals bird2 = new Bird("Solovei", 800, "Grey", 9, "bread");
        Animals bird3 = new Bird("Orel", 1300, "Grey", 12, "mouse");
        Animals lion1 = new Lion("Roccy", "Man", 130, "Orange", 20, "Meat");
        Animals lion2 = new Lion("Tim", "Man", 134, "Yellow", 20, "Meat");
        Animals lion3 = new Lion("Nicky", "Woman", 100, "Orange", 20, "Meat");

        Zoo zoo1 = new Zoo();
        zoo1.getAnimalsZoo(dog1);
        zoo1.getAnimalsZoo(dog2);
        zoo1.getAnimalsZoo(dog3);
        zoo1.getAnimalsZoo(bird1);
        zoo1.getAnimalsZoo(bird2);
        zoo1.getAnimalsZoo(bird3);
        zoo1.getAnimalsZoo(lion1);
        zoo1.getAnimalsZoo(lion2);
        zoo1.getAnimalsZoo(lion3);
        zoo1.callSound();
    }
}

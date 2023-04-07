package by.pvt.zoopark;

import java.util.Arrays;

public class Zoo {

    private Animals[] animals = new Animals[0];

    public void getAnimalsZoo(Animals animales) {

        int numOfLength = animals.length;
        if(numOfLength == 0) {
            animals = new Animals[1];
            animals[0] = animales;
        }
        else {
            Animals[] copyAnimals = new Animals[animals.length +1];
            for(int i =0; i < animals.length +1; i++) {
                if(i != animals.length) {
                    copyAnimals[i] = animals[i];
                }
                else {
                    copyAnimals[i] = animales;
                }
            }
            animals = copyAnimals;
        }
    }

    public void callSound() {
        for(Animals animal: animals) {
            animal.sound();
        }
    }
}

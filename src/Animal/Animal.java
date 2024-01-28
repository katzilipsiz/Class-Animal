package PracticeTasks.Task11;

import java.util.Arrays;

public abstract class Animal {
    String name;
    String[] eat = new String[3];

    protected void makeNoise() {
        System.out.println("Животное издает звук");
    }

    protected void eat() {
        System.out.println("Животное питается: " + Arrays.toString(eat));
    }

    protected String getDescription() {
        System.out.println("Описание животного: ");
        return null;
    }

    public Animal(String name) {
        this.name = name;
        for (String s : this.eat) {
            s = Arrays.toString(eat);
        }
    }
}

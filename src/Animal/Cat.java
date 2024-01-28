package PracticeTasks.Task11;

import java.util.Arrays;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Кот мурлычит.");
    }

    @Override
    protected void eat() {
        System.out.println("Кот питается: " + Arrays.toString(eat));
    }

    @Override
    protected String getDescription() {
        String description = """
                Ко́шка (лат. Felis catus) — домашнее животное, одно из наиболее популярных[1] (наряду с собакой) «животных-компаньонов»[2][3][4].
                                
                С точки зрения научной систематики, домашняя кошка — млекопитающее семейства кошачьих отряда хищных. Одни исследователи рассматривают домашнюю кошку как подвид дикой кошки[5], другие — как отдельный биологический вид[6].
                """;
        return description;
    }
}

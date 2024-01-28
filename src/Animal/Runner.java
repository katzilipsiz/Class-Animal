package PracticeTasks.Task11;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Вилсон");
        Cat cat = new Cat("Катуэль");
        Bear bear = new Bear("Боряшкин");
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = bear;

        String[] s = {"Рыба", "Корм", "Мыши"};
        cat.eat = s;
        dog.eat = s;
        bear.eat = s;

        for (var animal : animals) {
            animal.makeNoise();
            animal.eat();
        }

        System.out.println("==========================================");

        for(Animal veterinarian1 : animals) {
            veterinarian.treatAnimal(veterinarian1);
        }
    }
}

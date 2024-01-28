package PracticeTasks.Task11;

import java.util.Arrays;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    protected void eat() {
        System.out.println("Собака питается: " + Arrays.toString(eat));
    }

    @Override
    protected String getDescription() {
        String description = """
                Домашняя собака была описана как самостоятельный биологический вид Canis familiaris Линнеем в 1758 году; в настоящее время данное научное название признаётся организациями, такими как Американское общество маммалогов[2][3][4]. Некоторые источники (например, ITIS и MSW3) признают собаку подвидом волка (Canis lupus familiaris)[5][6]. В русскоязычных письменных источниках слово «собака» в значении соответствующего животного встречается по крайней мере с 1475 года (начиная с грамоты князя Андрея Васильевича Меньшого Кириллову монастырю)[7][8].
                """;
        return description;
    }
}

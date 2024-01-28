package PracticeTasks.Task11;

import java.util.Arrays;

public class Bear extends Animal {
    public Bear(String name) {
        super(name);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Медведь рычит.");
    }

    @Override
    protected void eat() {
        System.out.println("Медведь питается: " + Arrays.toString(eat));
    }

    @Override
    protected String getDescription() {
        String description = """
                Медве́жьи[1] (лат. Ursidae) — семейство млекопитающих отряда хищных. Отличаются от других представителей псообразных более коренастым телосложением. Медведи всеядны, хорошо лазают и плавают, быстро бегают, могут стоять и проходить короткие расстояния на задних лапах. Имеют короткий хвост, длинную и густую шерсть, а также отличное обоняние. Охотятся вечером или на рассвете.
                """;
        return description;
    }
}

package chapter01.item02.builder;

public class BuilderTest {

    public static void main(String[] args) {
        new NutritionFactsLombok.NutritionFactsLombokBuilder()
                .calories(10)
                .carbohydrate(10)
                .build();
    }
}

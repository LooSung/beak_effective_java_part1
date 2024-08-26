package chapter01.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFactsLombok {
    private final int servingSize;  // 필수 매개변수
    private final int servings;     // 필수 매개변수

    private final int calories;     // 선택 매개변수
    private final int fat;          // 선택 매개변수
    private final int sodium;       // 선택 매개변수
    private final int carbohydrate; // 선택 매개변수

    public static void main(String[] args) {
        // 필수 매개변수와 선택 매개변수를 설정하여 객체를 생성
        NutritionFactsLombok cocaCola = new NutritionFactsLombokBuilder()
                .servingSize(100)
                .servings(10)
                .build();

        // 결과 확인
        System.out.println(cocaCola.toString());
    }
}

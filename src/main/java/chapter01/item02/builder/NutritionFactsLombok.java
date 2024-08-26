package chapter01.item02.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderMethodName = "hiddenBuilder")
public class NutritionFactsLombok {
    private final int servingSize;  // 필수 매개변수
    private final int servings;     // 필수 매개변수
    private final int calories;     // 선택 매개변수
    private final int fat;          // 선택 매개변수
    private final int sodium;       // 선택 매개변수
    private final int carbohydrate; // 선택 매개변수

    // 필수 매개변수를 받는 생성자 역할을 하는 빌더 메서드
    public static NutritionFactsLombokBuilder builder(int servingSize, int servings) {
        return hiddenBuilder()
                .servingSize(servingSize)
                .servings(servings);
    }

    public static void main(String[] args) {
        // 필수 매개변수와 선택 매개변수를 설정하여 객체를 생성
        NutritionFactsLombok cocaCola = NutritionFactsLombok.builder(240, 8)
                .calories(100)   // 선택 매개변수
                .sodium(35)      // 선택 매개변수
                .carbohydrate(27) // 선택 매개변수
                .build();

        // 결과 확인
        System.out.println(cocaCola);
    }
}

package chapter01.item02.javabeans;

// 코드 2-2 자바빈즈 패턴 - 일관성이 깨지고, 불변으로 만들 수 없다. (16쪽)
public class NutritionFacts {
    // 필드 (기본값이 있다면) 기본값으로 초기화된다.
    private int servingSize  = -1; // 필수; 기본값 없음
    private int servings     = -1; // 필수; 기본값 없음
    private int calories     = 0;
    private int fat          = 0;
    private int sodium       = 0;
    private int carbohydrate = 0;
    private boolean healthy;

    public NutritionFacts() { }

    // 점층적 생성자 패턴 (생성자 체이닝), 많이 사용하는 변수를 계속 적으로 참조해서 매서드를 만든다.!
    // 생성자를 생성할때 어떤 것을 변수로 써야하는지 모른다... (인텔리제이 에서는 Command + P 로하면 보이지만) 가시성이 떨어진다...
    // ex) public NutritionFacts(servingSize , servings) { }
    // ex) public NutritionFacts(servingSize , servings, calories ...) { }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public static void main(String[] args) {
        // 밑에 처럼 @Setter를 사용하게 되면, 불변객체로 만들기 어렵다.
        // 내가 어디까지 기본적으로 Set을 해줘야하지? 강제적으로 하기 어렵다.
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);

        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}

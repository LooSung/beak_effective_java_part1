package chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    // private로 매서드를 생성하고
    private Settings() {}

    // Get을 하는 Instance로 만들면 다른 곳에서 사용하더라도
    // 하나의 Hashcode로 결과가 나오면서 자기 자신이 Control 할 수 있다.
    private static final Settings SETTINGS = new Settings();
    public static Settings getInstance() {
        return SETTINGS;
    }

}

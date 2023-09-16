// 접근제어자가 private 으로 설정되었다면 private 가 붙은 변수나 메서드는 해당 클래스 안에서만 접근이 가능하다.

public class Private {
    private String secret;

    private String getSecret() {
        return this.secret;
    }
}
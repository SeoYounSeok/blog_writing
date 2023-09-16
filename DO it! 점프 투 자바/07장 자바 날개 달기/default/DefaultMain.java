// 접근 제어자를 별도로 설정하지 않는다면 변수나 메서드는 default 접근 제어자가 자동으로 설정되어 동일한 패키지 안에서만 접근이 가능하다.

package seo;

public class DefaultMain {
    String lastName = "Youn";

    public static void main(String[] args) {
        Default seo = new Default();
        System.out.println(seo.lastName);
    }

}
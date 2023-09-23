import java.util.*;

public class StreamYes {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data) // IntStream 을 생성한다.
                .boxed() // IntStream 을 Stream<Integer> 로 변경한다.
                .filter((a) -> a % 2 == 0) // 짝수를 뽑아낸다.
                .distinct() // 중복을 제거한다.
                .sorted(Comparator.reverseOrder()) // 역순으로 정렬한다.
                .mapToInt(Integer::intValue) // Stream<Integer> 를 IntStream 으로 변경한다.
                .toArray() // int[] 배열로 반환한다.
                ;
    }
}

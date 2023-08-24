package syncronized;

public class CustomerBiz {
    public static void main(String[] args) {
        Taskable task = new Taskable();

        // 스레드 3개
        Thread th0 = new Thread(task);
        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task);

        // 스레드 실행
        th0.start();
        th1.start();
        th2.start();
    }
    
}

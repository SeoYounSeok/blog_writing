class Updater {
    void update(int count) {
        count ++;
    }
}

class Counter {
    int count = 0;
}

public class Sample {
    public static void main(String[] args) {

        Counter myCounter = new Counter();
        System.out.println("before update : " + myCounter.count);

        Updater myUpdater = new Update();
        myUpdater.update(myCounter.count);
        System.out.println("after update : " + myCounter.count);
    }
}
package syncronized;

public class AccountBiz {
    // 10000 원 출금 한도의 통장
    public final int limit = 10000;
    // 통장 잔액 50000 원
    public int balance = 50000; 

    public synchronized int doWithdraw(int money){
        if (money > limit) {
            return balance;
        }

        for (int i = 0; i < 3; i ++) {
            try {
                // 출금 금액 빼기
                balance -= money;

                Thread thread = Thread.currentThread();
                System.out.println(thread.getName()+ "님께서 출금을 하셨습니다. 잔액은 " + balance + " 입니다.");
                Thread.sleep(500);

            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
        return balance;
    }
}
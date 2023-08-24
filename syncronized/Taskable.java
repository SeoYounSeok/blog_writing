package syncronized;

public class Taskable implements Runnable{
    AccountBiz accountBiz = new AccountBiz();
    @Override
    public void run() {
        // 1000원 씩 출금
        accountBiz.doWithdraw(1000);
    }
}
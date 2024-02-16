package dev.prometheus_dev;


import org.junit.jupiter.api.Test;

public class demo {

    @Test
    public void threadTest() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("스레드 실행! : " + finalI);
                System.out.println(Thread.currentThread().getName());
            });
            thread.setDaemon(true); // 스레드를 백그라운드 스레드로 설정
            thread.start();
        }

        System.out.println("메인 스레드 종료");
    }




    @Test
    public void t1(){
        new Thread(()-> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }).start();

    }

    static class MyRun implements Runnable {

        @Override
        public void run() {
            System.out.println("hello");
        }
    }
}

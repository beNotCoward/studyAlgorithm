package com.lentouqin.lettcode2023;

public class ThreadDemo {

    //定义一百张票
    public static Integer ticker = 100;

    public static void main(String[] args) {

        // 需求，火车站有4个窗口
        // 太原到合肥100张票
        // 1000人抢票

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if(ticker > 0){
                    ticker--;
                    System.out.println(Thread.currentThread().getName()+"出票成功，已经卖出:"+(100-ticker)+"票，剩余票数为："+ticker);
                }
            }
        };
        for (int i=1;i < 1000;i++){
            int num = i % 4 +1;
            if(num == 1){
                Thread t1 = new Thread(runnable, "售票窗口1+++");
                t1.start();
            }else if (num == 2){
                Thread t2 = new Thread(runnable, "售票窗口2+++");
                t2.start();
            }else if (num == 3){
                Thread t3 = new Thread(runnable, "售票窗口3+++");
                t3.start();
            }else {
                Thread t4 = new Thread(runnable, "售票窗口4+++");
                t4.start();
            }
        }

    }
}

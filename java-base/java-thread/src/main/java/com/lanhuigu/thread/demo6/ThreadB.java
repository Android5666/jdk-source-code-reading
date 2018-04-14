package com.lanhuigu.thread.demo6;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: ThreadB
 * @Package: com.lanhuigu.thread.demo6
 * @date 2018/4/14 13:37
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100 ; i++) {
                DataTools.tl.set("B_Thread_" + System.currentTimeMillis());
                // 获取当前线程私有数据
                System.out.println("线程Ｂ获取的值：" + DataTools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

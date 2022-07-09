package h_thread.g_synchronized;

class Window implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            sell();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void sell() {
        //同步代码块
        //括号中要放入对每一个线程都等价的对象，这样只有获取该对象锁的线程才能执行代码块中的内容
        synchronized (this) {
            if (ticket <= 0)
                return;
            ticket--;
            System.out.print(Thread.currentThread().getName());
            System.out.println("-售卖票：" + (100 - ticket));
        }
    }
}

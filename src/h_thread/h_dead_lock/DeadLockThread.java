package h_thread.h_dead_lock;

class DeadLockThread implements Runnable {
    private final static Object o1 = new Object();
    private final static Object o2 = new Object();
    private final boolean flag;

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //以下代码会出现死锁
        //线程1已经获取了o1的锁，之后必须获取o2的锁才能继续运行并放回o1的锁
        //线程2已经获取了o2的锁，之后必须获取o1的锁才能继续运行并放回o2的锁
        //因此形成了矛盾，两个线程都无法继续运行，因此线程卡死，进入死锁状态
        if (flag) {
            synchronized (o1) {
                System.out.println("o1");
                synchronized (o2) {
                    System.out.println("o2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println("o2");
                synchronized (o1) {
                    System.out.println("o1");
                }
            }
        }
    }
}

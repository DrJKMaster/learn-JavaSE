package h_thread.f_thread_state;

class Thread1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("thread-0 睡眠 0.4s");
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = new Thread(new Thread2());
        thread.start();
        System.out.println("thread-1 开始");
        try {
            System.out.println("thread-1 join");
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

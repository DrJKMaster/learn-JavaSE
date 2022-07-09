package h_thread.f_thread_state;

class Thread2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("thread-1 睡眠 0.4s");
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

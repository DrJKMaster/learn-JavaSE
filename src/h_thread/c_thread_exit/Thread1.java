package h_thread.c_thread_exit;

class Thread1 implements Runnable {
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println("线程名：" + Thread.currentThread().getName() + "：" + (++count));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

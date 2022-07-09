package h_thread.d_common_method;

class Thread1 implements Runnable {
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println("线程名：" + Thread.currentThread().getName() + "：" + (++count));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

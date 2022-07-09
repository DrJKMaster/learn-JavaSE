package h_thread.d_common_method;

class Thread2 implements Runnable {
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        for (count = 0; count < 5; count++) {
            System.out.println("thread-1：" + (count + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

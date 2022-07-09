package h_thread.c_thread_exit;

class Test {
    public static void main(String[] args) {
        //通过为 run 中的循环设置条件，并在其他线程中更改条件的方法实现线程中断
        Thread1 thread1 = new Thread1();
        new Thread(thread1).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.setLoop(false);
    }
}

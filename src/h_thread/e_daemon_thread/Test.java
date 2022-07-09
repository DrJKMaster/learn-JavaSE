package h_thread.e_daemon_thread;

class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DaemonThread());
        //设置 thread 为守护线程：当父线程执行完毕后，子线程随之终止
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(1);
        System.out.println("main 线程结束");
    }
}

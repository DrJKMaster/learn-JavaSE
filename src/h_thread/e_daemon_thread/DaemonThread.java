package h_thread.e_daemon_thread;

class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("hhh");
        }
    }
}

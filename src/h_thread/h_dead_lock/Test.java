package h_thread.h_dead_lock;

class Test {
    public static void main(String[] args) {
        new Thread(new DeadLockThread(true)).start();
        new Thread(new DeadLockThread(false)).start();
    }
}

package h_thread.f_thread_state;

class Test {
    public static void main(String[] args) throws InterruptedException {
        //线程状态共六种
        //1.NEW：未启动的线程
        //2.RUNNABLE：正在运行的线程
        //2.1.(不可见)READY：挂起的线程（线程运行后，会等待被线程调度器执行，在此之前线程都处于挂起状态）
        //2.2.(不可见)RUNNING：实际正在被运行的线程
        //3.TERMINATED：结束运行的线程
        //4.BLOCKED：阻塞的线程（被 synchronized 阻塞的进程）
        //5.WAITING：等待的线程（等待一段时长不定的时间，如 join, yield）
        //6.TIMED_WAITING：超时等待的线程（等待一段时长确定的时间，如 sleep）
        Thread thread = new Thread(new Thread1());

        System.out.println("thread-0 线程被创建");
        System.out.println(thread.getState());//1.NEW

        thread.start();
        System.out.println("thread-0 开始");
        System.out.println(thread.getState());//2.RUNNABLE

        Thread.sleep(200);
        System.out.println(thread.getState());//6.TIMED_WAITING

        Thread.sleep(400);
        System.out.println(thread.getState());//5.WAITING

        Thread.sleep(400);
        System.out.println(thread.getState());//3.TERMINATED
    }
}

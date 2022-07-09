package h_thread.b_thread_create;

class Test {
    public static void main(String[] args) {
        //实现了 Runnable 接口
        //调用 run 方法时，run 中的内容在主线程运行(main)
        new Thread1().run();
        new Thread1().run();

        //继承了 Thread 类
        //调用 start 方法时，创建新线程运行 run 方法，主线程继续运行接下来的语句(thread-0)
        //start 方法中最关键的一步是通过 start0 方法创建线程并调用 run 方法
        //start0 方法是一个 native 方法，由 C/C++ 编写而成，在源码中无法查看
        new Thread2().start();
        new Thread2().start();

        //使用如下方法创建线程并运行，更好地体现线程概念
        //1.使得 Thread1 可以实现继承其他类
        //2.使得多个线程可以共享同一份资源
        Thread1 thread1 = new Thread1();
        new Thread(thread1).start();
        new Thread(thread1).start();

        //线程间无依赖关系
        //如：new Thread2().start()执行后
        //main 线程没有其它语句，直接退出，而 thread-0 与 thread-1 线程继续执行
        //所有线程执行完毕后，进程被关闭
        //可以使用 JConsole 工具查看线程状况：开始执行后在终端输入 JConsole
    }

    public static void Method() {
        System.out.println("线程名：" + Thread.currentThread().getName());
        int i = 0;
        while (i < 4) {
            System.out.println(++i);

            //需要处理可能会发生的线程中断异常
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

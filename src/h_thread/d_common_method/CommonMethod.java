package h_thread.d_common_method;

class CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        //线程常用方法
        //1.setName：设置线程名称
        //2.getName：返回线程名称
        //3.start：创建线程并调用 run 方法
        //4.run：调用 run 方法
        //  线程优先级：1（最低） ~ 10（最高）
        //5.setPriority：更改线程优先级
        //6.getPriority：获取线程优先级
        //7.sleep：暂停线程

        //8.interrupt：中断线程休眠，使之继续执行
//        Thread thread = new Thread(new Thread1());
//        thread.start();
//        Thread.sleep(1000);
//        thread.interrupt();
        //按照源代码可知，thread-1 每次输出都会休眠 10 秒
        //而如果对其进行线程中断操作，则会跳过休眠阶段直接开始下一次循环

        //9.yield：礼让，如果资源丰富则不成功
        //10.join：插队，如果插队成功，则会将本线程的剩余任务全部执行完成再归还资源
        Thread thread = new Thread(new Thread2());
        thread.start();
        thread.join(); //join 前面是要插队的线程
        Thread.yield(); //yield 是静态方法，关联本进程
        System.out.println("main线程结束");
    }
}

package h_thread.g_synchronized;

class Test {
    public static void main(String[] args) {
        Window window = new Window();
        for (int i = 0; i < 9; i++) {
            new Thread(window, "窗口" + (i + 1)).start();
        }

        //这样操作，可能会出现同一张票售卖多次、售卖不存在的票等现象
        //解决方案
        //1.给 run 方法加上 synchronized
        //解决了问题，但没有实现三个窗口同时售票
        //2.将 run 方法的一个子集做成方法并对这个方法加锁
        //3.将 run 方法的一个子集加上同步代码块

        //synchronized 也可加在代码块上

        //synchronized 静态代码块写法
        //synchronized (类名.class) {}
    }
}

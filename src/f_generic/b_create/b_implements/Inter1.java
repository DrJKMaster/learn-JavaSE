package f_generic.b_create.b_implements;

//泛型的标识符一般是单个的大写字母
class Inter1<T, R> implements Inter<T, R> {
    //以泛型为类型的变量数组不能被初始化
    T elem = null;
    R[] elems;
    //R[] elems = new T[8];

    //静态成员变量与静态方法不能使用泛型
    static void ss() {
        System.out.println("ss");
    }

    @Override
    public void f(T t, R r) {
        System.out.println("f");
    }
}

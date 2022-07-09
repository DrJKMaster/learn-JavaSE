package f_generic.b_create.b_implements;

//实现或继承接口时，需要指定接口中的泛型类型
//1.可以指定为具体类型：implements GenericInter<String, Character>
//2.可以指定为泛型类型：implements GenericInter<T, R>，此时实现的类也需要传入泛型

interface Inter<T, R> {
    //接口中的成员都是静态的，因此不能使用泛型属性
    //T a;

    void f(T t, R r);
}

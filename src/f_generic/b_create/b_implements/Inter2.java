package f_generic.b_create.b_implements;

//泛型的标识符一般是单个的大写字母
class Inter2 implements Inter<String, Character> {
    @Override
    public void f(String s, Character character) {
        System.out.println("f");
    }
}

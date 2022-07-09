package b_class.b_extend;

class Test {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getName());
        System.out.println(son.getSuperName());
        Father fs = new Son();
        System.out.println(son.getClass());
        System.out.println(fs.getClass());
    }
}

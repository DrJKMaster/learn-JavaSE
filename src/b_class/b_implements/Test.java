package b_class.b_implements;

class Test {
    public static void main(String[] args) {
        work(new Inter1());
        work(new Inter2());
    }

    private static void work(Inter inter) {
        inter.start();
        inter.end();
    }
}

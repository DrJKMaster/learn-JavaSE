package e_exception.b_try_catch_finally;

class Test {
    public static void main(String[] args) {
        try {
            String[] strings = new String[2];
            System.out.println(strings[0].equals(strings[1]));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
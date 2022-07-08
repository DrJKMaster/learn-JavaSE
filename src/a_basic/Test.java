package a_basic;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        testScanner();
        System.out.println(getSum(1, 2, 3));
    }

    private static void testScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入名字：");
        String name = scanner.next();
        System.out.println("名字是：" + name);

        System.out.print("请输入工资：");
        int salary = scanner.nextInt();
        System.out.println("工资是：" + salary);
    }

    private static int getSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}

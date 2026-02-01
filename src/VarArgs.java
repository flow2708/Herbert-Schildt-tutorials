public class VarArgs {
    void test(int a, int b, int ... c) {
        System.out.println(a);
        System.out.println(b);
        for (int num : c) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        new VarArgs().test(1, 2, 3, 4, 5, 6, 7);
    }
}
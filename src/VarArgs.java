public class VarArgs {
    void test(int a, int b, int ... c) {
        System.out.println(a);
        System.out.println(b);
        for (int num : c) {
            System.out.println(num);
        }
    }
    void test(boolean ... a) {
        for (boolean bool : a) {
            System.out.println(bool);
        }
    }
    public static void main(String[] args) {
        VarArgs va = new VarArgs();
        va.test(1, 2, 3, 4, 5, 6, 7);
        va.test(true, false, true, true, false);
    }
}
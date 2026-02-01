public class Vars {
    public static void main(String[] args) {
        var a = 5;
        var b = 5.00;
        var c = 5.0;
        var d = "hello";
        var e = false;
        var f = new int[10];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        for (int i = 0; i < f.length; i++) {
            f[i] = 5;
        }
        for (int integer : f) {
            System.out.println(integer);
        }
    }
}
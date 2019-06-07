public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.print(b.m2() + ", ");
        System.out.print(b.m3() + ", ");
        System.out.print(b.m4() + ", ");
        System.out.print(b.m5() + ", ");
        System.out.print(c.m3() + ", ");
        System.out.print(c.m4() + ", ");
        System.out.print(c.m5() + ", ");
        System.out.print(c.m6()+ ".");

    }
}

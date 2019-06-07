
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception {
        List<String> b = new ArrayList<String>();
        b.add("test");
        b.add("exam");
        b.add("test");
        b.set(2,"exam");
        System.out.println(b.size());

        SoccerTeam team = new SoccerTeam("", "U");
        A();
    }
    public static void A() {
        try{
            B();
        } catch (Exception e) {
            System.out.println("CATCH A");
        }
    }
    public static void B() throws Exception {
        try{
            C();
        } catch (Exception e) {
            System.out.println("CATCH B");
        }
    }
    public static void C() throws Exception {
        D();
    }
    public static void D() throws Exception {
        throw new Exception();
    }
}

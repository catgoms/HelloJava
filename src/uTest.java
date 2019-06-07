import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class uTest {

    StaffName testName;
    @Before
    public void makeName() {
        testName = new StaffName("Alan", "Turing");
    }
    @Test
    public void testTitling() {
        assertEquals("Dr A. Turing", testName.titledName("Dr"));
    }

}

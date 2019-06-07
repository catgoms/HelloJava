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

    @Test(expected = Exception.class)
    public void Test1() throws Exception {
        String emptyString = "";
        SoccerTeam team = new SoccerTeam(emptyString, "Dark Knights");
        assertEquals(team.getOfficialName(), emptyString);
    }

    @Test
    public void Test2() throws Exception {
        SoccerTeam team1 = new SoccerTeam("Gotham City", "Dark Knights");
        SoccerTeam team2 = new SoccerTeam("Metropolis", "Men of Steel");
        team1.playMatch(3, 0);
        team2.playMatch(0, 3);
        assertEquals(team1.compareTo(team2), -1);
    }

}

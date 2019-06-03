import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Darren Shankland", "NY643333C", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Darren Shankland", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("NY643333C", developer.getnInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(26000, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(250, developer.payBonus(), 0.0);
    }
}

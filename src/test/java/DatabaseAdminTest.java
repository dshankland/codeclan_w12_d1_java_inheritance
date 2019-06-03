import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dbAdmin;

    @Before
    public void setUp() throws Exception {
        dbAdmin = new DatabaseAdmin("Neal Peggs", "HH44335566A", 28000);
    }

    @Test
    public void hasName() {
        assertEquals("Neal Peggs", dbAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("HH44335566A", dbAdmin.getnInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(28000,dbAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(1000);
        assertEquals(29000, dbAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(280, dbAdmin.payBonus(), 0.0);
    }
}

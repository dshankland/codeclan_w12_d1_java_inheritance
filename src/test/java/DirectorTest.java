import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Mr Big", "NY1234567A", 50000, "Management", 100000);
    }

    @Test
    public void hasName() {
        assertEquals("Mr Big", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("NY1234567A", director.getnInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary(), 0.0);
    }

    @Test
    public void hasBudget() {
        assertEquals(100000, director.getBudget(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(50);
        assertEquals(50050, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000, director.payBonus(), 0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRaiseCannotBeNegative() {
        director.raiseSalary(-11000);
    }

    @Test
    public void canChangeName() {
        director.setName("John Williams");
        assertEquals("John Williams", director.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void cantChangeNameToNull() {
        director.setName("");
    }

}

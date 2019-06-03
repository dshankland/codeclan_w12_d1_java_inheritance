import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("John Williamson", "NY6412345", 30000, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("John Williamson", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("NY6412345", manager.getnInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDept() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(35000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, manager.payBonus(), 0.0);
    }
}

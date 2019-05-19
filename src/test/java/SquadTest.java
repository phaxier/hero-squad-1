import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        assertTrue(squad instanceof Squad);
    }
    @Test
    public void squad_instantiatesWithName_String() {
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        assertEquals("Mbogi", squad.getName());
    }
    @Test
    public void squad_instantiatesWithCause_String() {
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        assertEquals("Save the universe", squad.getCause());
    }
    @Test
    public void squad_instantiatesWithMaximum_String() {
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        assertEquals("12", squad.getMax());
    }
    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        Squad squadTwo = new Squad("Radion", "Save the people", "13");
        assertEquals(true, Squad.all().contains(squad));
        assertEquals(true, Squad.all().contains(squadTwo));
    }
    @Test
    public void clear_emptiesAllCategoriesFromList_0() {
        Squad squadTwo = new Squad("Radion", "Save the people", "13");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
}
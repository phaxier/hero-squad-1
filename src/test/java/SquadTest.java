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
}
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
    public void clear_emptiesAllSquadsFromList_0() {
        Squad squadTwo = new Squad("Radion", "Save the people", "13");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
    @Test
    public void getId_squadsInstantiateWithAnId_6() {
        Squad squad = new Squad("Radion", "Save the people", "13");
        assertEquals(6, squad.getId());
    }
    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        Squad squadTwo = new Squad("Radion", "Save the people", "13");
        assertEquals(Squad.find(squadTwo.getId()), squadTwo);
    }
    @Test
    public void getTasks_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad squadTwo = new Squad("Radion", "Save the people", "13");
        assertEquals(0, squadTwo.getHeroes().size());
    }
    @Test
    public void addTask_addsTaskToList_true() {
        Squad squadTwo = new Squad("Radion", "Save the people", "13");
        Hero hero = new Hero("Juan","8","speed", "faster bird");
        squadTwo.addHero(hero);
        assertTrue(squadTwo.getHeroes().contains(hero));
    }
}
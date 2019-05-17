import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("",0,"","");
        assertTrue(hero instanceof Hero);
    }
    @Test
    public void Task_instantiatesWithName_String() {
        Hero hero = new Hero("Jon",7,"sleep","light");
        assertEquals("Jon", hero.getName());
    }
    @Test
    public void Task_instantiatesWithAge_int() {
        Hero hero = new Hero("Jon",7,"sleep","light");
        assertEquals(7, hero.getAge());
    }
    @Test
    public void Task_instantiatesWithPower_String() {
        Hero hero = new Hero("Jon",7,"sleep","light");
        assertEquals("sleep", hero.getPower());
    }
}

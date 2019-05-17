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
    @Test
    public void Task_instantiatesWithWeakness_String() {
        Hero hero = new Hero("Jon",7,"sleep","light");
        assertEquals("light", hero.getWeakness());
    }
    @Test
    public void all_returnsAllInstancesOfHero_true(){
        Hero heroOne = new Hero("Yani",9,"laziness", "weights");
        Hero heroTwo = new Hero("Juan",10,"speed", "faster bird");
        assertTrue(Hero.all().contains(heroOne));
        assertTrue(Hero.all().contains(heroTwo));
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero hero = new Hero("Juan",10,"speed", "faster bird");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test
    public void getId_heroesInitiateWithAnID_1(){
        Hero.clear();
        Hero hero = new Hero("Juan",10,"speed", "faster bird");
        assertEquals(1, hero.getId());
    }
}

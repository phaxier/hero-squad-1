import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero hero = new Hero("",0,"","");
        assertTrue(hero instanceof Hero);
    }
}

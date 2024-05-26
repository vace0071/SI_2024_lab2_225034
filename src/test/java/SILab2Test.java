import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void testEveryBranch() {
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 600));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Jabuka", null, 200, 0.1F)), 600));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Jabuka", "ABC789", 200, 0.1F)), 600));
        assertTrue(SILab2.checkCart(List.of(new Item("Jabuka", "987654", 200, 0.1F)), 600));
        assertFalse(SILab2.checkCart(List.of(new Item("Wrap", "065432", 200, 0.1F), new Item("Unknown", "876543", 900, 0)), 600));
    }

    @Test
    void testMultipleCase() {
        assertTrue(SILab2.checkCart(List.of(new Item("Banana", "335678", 150, 0.2F)), 700));
        assertTrue(SILab2.checkCart(List.of(new Item("Banana", "035678", 250, 0)), 700));
        assertTrue(SILab2.checkCart(List.of(new Item("Banana", "135678", 250, 0.2F)), 700));
        assertTrue(SILab2.checkCart(List.of(new Item("Banana", "035678", 250, 0.2F)), 700));
    }
}

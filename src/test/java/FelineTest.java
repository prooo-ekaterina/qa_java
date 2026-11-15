import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgReturnsEnteredNumber() {
        assertEquals(10, feline.getKittens(10));
    }
}
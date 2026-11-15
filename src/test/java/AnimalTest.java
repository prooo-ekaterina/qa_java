import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private final Animal animal = new Animal();

    @Test
    public void getFoodReturnHerbivoreFoodForHerbivore() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodReturnsFelineFoodForFeline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, animal.getFood("Хищник"));
    }

    @Test
    public void getFoodThrowsException() throws Exception {
        try {
            animal.getFood("Неизвестный вид");
        } catch (Exception exception) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }

    }

    @Test
    public void getFamilyReturnsFamilyList() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}

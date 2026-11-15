import com.example.Cat;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Predator mockPredator;

    @Test
    public void maneForMale() throws Exception {
        Lion lion = new Lion("Самец", mockPredator);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void noManeForFemale() throws Exception {
        Lion lion = new Lion("Самка", mockPredator);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void throwsExceptionForInvalidData() throws Exception {
        try {
            Lion lion = new Lion(null, mockPredator);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(mockPredator.eatMeat()).thenReturn(expected);

        Lion lion = new Lion("Самец", mockPredator);
        assertEquals(expected, lion.getFood());
    }
}

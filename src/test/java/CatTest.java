import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
   private Feline mockFeline;

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.eatMeat()).thenReturn(expected);

        Cat cat = new Cat(mockFeline);
        assertEquals(expected, cat.getFood());
    }


}

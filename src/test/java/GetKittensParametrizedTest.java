import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensParametrizedTest {

    Feline feline = new Feline();
    private final int number;
    private final int expected;

    public GetKittensParametrizedTest(int number, int expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensNumber() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {10, 10},
        };
    }

    @Test
    public void kittensNumber() {
        int actual = feline.getKittens(number);
        assertEquals(expected, actual);
    }


}


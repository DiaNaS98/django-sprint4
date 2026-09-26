import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class lionParameterizedTests {

private final String sex;
private final boolean hasMane;

    public lionParameterizedTests(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

@Parameterized.Parameters
public static Object[][] lionsData() {
    return new Object[][]{
            {"Самец", true},
            {"Самка", false},
            {"Неведома зверушка", false}
}; }


@Test
public void dispalysIfLionHasAManeRegardingToItsSexTest() throws Exception {
Feline mockFeline = Mockito.mock(Feline.class);
Lion lion = new Lion(sex, mockFeline);
assertEquals(hasMane, lion.doesHaveMane());
    }
}


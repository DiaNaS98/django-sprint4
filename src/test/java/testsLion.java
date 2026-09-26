import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class testsLion {

@Mock
private Feline mockFeline;

@Test
public void returnCorrectFoodListForMaleTest() throws Exception {
    Lion lion = new Lion("Самец", mockFeline);
    List<String> foodList = List.of("Рыба, птица");
    Mockito.when(mockFeline.getFood("Хищник")).thenReturn(foodList);
    List<String> actualFoodList = lion.getFood();
    assertEquals(foodList, actualFoodList);
}

    @Test
    public void returnCorrectFoodListForFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", mockFeline);
        List<String> foodList = List.of("Крокодил, кайот, рысь");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(foodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(foodList, actualFoodList);
    }

}


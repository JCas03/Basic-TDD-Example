import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MagicNumberTest {

    @Test
    void shouldReturnTrueWhenSumOfTwoNumbersIsEqualsTo10(){
        MagicNumber magicNumber = new MagicNumber();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(4);
        int magicNumberSum = 10;
        boolean hasPairExist = magicNumber.hasPairExist(list,magicNumberSum);
        Assertions.assertTrue(hasPairExist);
    }

    @Test
    void shouldReturnFalseWhenSumOfTwoNumbersIsNotEqualTo10(){
        MagicNumber magicNumber = new MagicNumber();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        int magicNumberSum = 10;
        boolean hasPairExist = magicNumber.hasPairExist(list,magicNumberSum);
        Assertions.assertFalse(hasPairExist);
    }
}

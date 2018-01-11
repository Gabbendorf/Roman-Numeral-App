import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterTest {

    private static NumberConverter numberConverter;

    @BeforeClass
    public static void newConverter() {
        numberConverter = new NumberConverter();
    }

    @Test
    public void convertsZero() {
        assertEquals("", numberConverter.convertedNumber(0));
    }

    @Test
    public void convertsOne() {
        assertEquals("I", numberConverter.convertedNumber(1));
    }

    @Test
    public void convertsTwo() {
        assertEquals("II", numberConverter.convertedNumber(2));
    }

    @Test
    public void convertsFour() {
        assertEquals("VI", numberConverter.convertedNumber(6));
    }

    @Test
    public void convertsFive() {
        assertEquals("V", numberConverter.convertedNumber(5));
    }

    @Test
    public void convertsSix() {
        assertEquals("VI", numberConverter.convertedNumber(6));
    }

    @Test
    public void convertsNine() {
        assertEquals("IX", numberConverter.convertedNumber(9));
    }

    @Test
    public void convertsTen() {
        assertEquals("X", numberConverter.convertedNumber(10));
    }

    @Test
    public void convertsEleven() {
        assertEquals("XI", numberConverter.convertedNumber(11));
    }

    @Test
    public void convertsTwenty() {
        assertEquals("XX", numberConverter.convertedNumber(20));
    }

    @Test
    public void convertsForty() {
        assertEquals("XL", numberConverter.convertedNumber(40));
    }

    @Test
    public void convertsFifty() {
        assertEquals("L", numberConverter.convertedNumber(50));
    }

    @Test
    public void convertsNinety() {
        assertEquals("XC", numberConverter.convertedNumber(90));
    }

    @Test
    public void convertsHundred() {
        assertEquals("C", numberConverter.convertedNumber(100));
    }

    @Test
    public void convertsFourHundred() {
        assertEquals("CD", numberConverter.convertedNumber(400));
    }

    @Test
    public void convertsFiveHundred() {
        assertEquals("D", numberConverter.convertedNumber(500));
    }

    @Test
    public void convertsNineHundred() {
        assertEquals("CM", numberConverter.convertedNumber(900));
    }

    @Test
    public void convertsThousand() {
        assertEquals("M", numberConverter.convertedNumber(1000));
    }

    @Test
    public void convertsThreeThousandSevenHundredEightySix() {
        assertEquals("MMMDCCLXXXVI", numberConverter.convertedNumber(3786));
    }
}

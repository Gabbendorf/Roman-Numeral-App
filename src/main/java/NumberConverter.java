import java.util.LinkedHashMap;
import java.util.Map;

public class NumberConverter {

    private Map<Integer, String> converter = new LinkedHashMap<>();

    public NumberConverter() {
        converter.put(1000, "M");
        converter.put(900, "CM");
        converter.put(500, "D");
        converter.put(400, "CD");
        converter.put(100, "C");
        converter.put(90, "XC");
        converter.put(50, "L");
        converter.put(40, "XL");
        converter.put(10, "X");
        converter.put(9, "IX");
        converter.put(5, "V");
        converter.put(4, "IV");
        converter.put(1, "I");
    }

    public String convertedNumber(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();
        for (int number : converter.keySet()) {
            while (arabicNumber >= number) {
                romanNumber.append(converter.get(number));
                arabicNumber -= number;
            }
        }
        return romanNumber.toString();
    }
}

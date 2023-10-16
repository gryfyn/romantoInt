import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
    }

    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        }
    
        int convertedNumber = 0;
        int prevValue = 0;
    
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (!map.containsKey(currentChar)) {
                // Invalid character
                return 0;
            }
    
            Integer currentValue = map.get(currentChar);
    
            if (currentValue == null) {
                // Handle the case where the map returns null
                throw new IllegalArgumentException("Unexpected null value for character: " + currentChar);
            }
    
            if (currentValue < prevValue) {
                convertedNumber -= currentValue;
            } else {
                convertedNumber += currentValue;
            }
    
            prevValue = currentValue;
        }
    
        return convertedNumber;
    }
    

    public static void main(String[] args) {
        // Example of how to use the RomanNumeral class
        RomanNumeral romanNumeralConverter = new RomanNumeral();
        
        // Replace "XII" with the Roman numeral you want to convert
        String romanNumeral = "M";
        
        int result = romanNumeralConverter.romanToInt(romanNumeral);
        System.out.println("Conversion result: " + result);
    }
}

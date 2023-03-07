import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> recurringChar = new LinkedHashMap<>();
        recurringChar.put(str.charAt(0), 1);

        for(int index = 1; index < str.length(); index++) {
          if(recurringChar.containsKey(str.charAt(index))) {
            recurringChar.put(str.charAt(index), recurringChar.get(str.charAt(index)) + 1);
          }

          else
            recurringChar.put(str.charAt(index), 1);
        }

        int maxValue = Collections.max(recurringChar.values());

        for (Map.Entry<Character, Integer> entry : recurringChar.entrySet()) {
          if(entry.getValue() == maxValue)
            return entry.getKey();
        }

        return ' ';
    }
}

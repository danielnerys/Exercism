import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> letters = new HashSet<>(26);
        for(char ch: input.toCharArray()){
            if (Character.isAlphabetic(ch)){
                letters.add(Character.toLowerCase(ch));
            }
          }
        return letters.size() == 26;
    }

}

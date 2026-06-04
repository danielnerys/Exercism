import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    static void main(String[] args) {
        Set<Character> letters = HashSet.newHashSet(26);
        System.out.println(new PangramChecker().isPangram("Thequickbrownfoxjumpsoverthelazydog"));
        String teste = "The quick brown fox jumps over the lazy dog.";
        for(char ch: teste.toCharArray()){
            if(ch != ' ' && ch != '.' && ch!='-'){
                letters.add(Character.toLowerCase(ch));
            }

        }

        System.out.println();
        System.out.println(letters.size());
        System.out.println(letters);




    }




    public static int segundoMaior(List<Integer> numeros) {
        int maior = 0;
        int segundomaior = 0;
        for (Integer i : numeros) {
            if (i > maior) {
                segundomaior = maior;
                maior = i;
            } else if (i > segundomaior && i != maior) {
                segundomaior = i;
            }
        }
        return segundomaior;

    }
}
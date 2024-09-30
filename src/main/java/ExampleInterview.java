import java.util.List;

public class ExampleInterview {
    public static void main(String[] args) {

    }
    public String noVowels(String s) {
        List<Character> list = List.of('a', 'o', 'e', 'i');
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                result += s.charAt(i);
            }
        }
        return result;
    }
}

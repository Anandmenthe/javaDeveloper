import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfcharacter {

    public static void main(String[] agrs){

        String inputString = "Java Concept Of The Day";
        List<String> inputStrings = Arrays.asList("Java Concept Of The Day" , "Java Concept Of The Day");

        Map<Character, Long > charCount = inputString.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
        Map<String,Long> StringCount= inputStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(StringCount);
    }
}

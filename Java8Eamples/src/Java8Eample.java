import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Java8Eample {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        List<Integer> input = Arrays.asList(1, 2, 3,3,4,4, 5, 6);
        List<Integer> s =  input.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        Set<Integer> k = input.stream().collect(Collectors.toSet());
        Set<Integer> seen = new HashSet<>();
        List<Integer> sameNumber = input.stream().filter(n->!seen.add(n)).collect(Collectors.toList());
        System.out.println("i = " + s);
        System.out.println("i = " + sameNumber);


       // --------------------------------------------------------------------------------------->
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        //3 minimum Numbers

        System.out.println("-----------------");

        System.out.println("Minimum 3 Numbers");

        System.out.println("-----------------");

        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        //3 Maximum Numbers

        System.out.println("-----------------");

        System.out.println("Maximum 3 Numbers");

        System.out.println("-----------------");

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}



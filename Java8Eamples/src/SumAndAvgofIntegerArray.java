import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAvgofIntegerArray {

    public static void main(String[] args)
    {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);

        List<Integer> b =Arrays.asList(45, 12, 56, 15, 24, 75, 31, 8);
        int Listsum = b.stream()
                .mapToInt(Integer::intValue) // Or mapToInt(i -> i)
                .sum();
        OptionalDouble ListAvg = b.stream()
                .mapToInt(Integer::intValue) // Or mapToInt(i -> i)
                .average();
        System.out.println("Sum = "+Listsum);
        System.out.println("Average = "+ListAvg);


    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);

            Integer number = list.stream().reduce(0, Integer::sum);
            System.out.println("Сумма чисел: " + number);

            System.out.print(" Средий арифметическое чисел: ");
            list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);

            Map<Integer, Integer> countByNumber = new HashMap<>();
            for (Integer m : list) countByNumber.merge(m, 1, Integer::sum);
            System.out.println(countByNumber);
        }
}

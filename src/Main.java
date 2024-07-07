import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    Код должен работать с любой последовательностью и объемом списка чисел.
     */

    public static void printOddNumbers(List<Integer> nums) {
        List<Integer> oddNumbers = nums.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);
    }

    /*
    Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
    Код должен работать с любой последовательностью и объемом списка чисел.
     */

    public static void printEvenNumbers(List<Integer> nums) {
        List<Integer> oddNumbers = nums.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);
    }

    /*
    Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
    Код должен работать с любой последовательностью и объемом списка слов.
     */

    public static void printUniqueWords(List<String> nums2) {
        Set<String> uniqueWords = new HashSet<>(nums2);
        uniqueWords.forEach(System.out::println);
    }

    /*
    Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
    Код должен работать с любой последовательностью и объемом списка слов.
     */

    public static void printTakes(List<String> nums2) {
        Map<String, Integer> vault = new HashMap<>();
        for (String takes : nums2){
            vault.put(takes, vault.getOrDefault(takes, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : vault.entrySet()) {
            String takes = entry.getKey();
            int count = entry.getValue();
            int dublicat = count - 1;
            System.out.println(takes + " - " + dublicat);
        }
    }

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        printOddNumbers(nums);

        printEvenNumbers(nums);

        List<String> nums2 = Arrays.asList("card", "soft", "soft", "retry", "safari", "safari", "puls");

        printUniqueWords(nums2);

        printTakes(nums2);
    }
}

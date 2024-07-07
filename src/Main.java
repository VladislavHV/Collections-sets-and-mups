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
        Set<Integer> oddNumbers = new TreeSet<>();
        for (Integer number : nums){
            if (number % 2 == 0) {
                oddNumbers.add(number);
            }
        }
        for (Integer number : oddNumbers) {
            System.out.println(number);
        }
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
            System.out.println(entry.getKey() + " - " + (entry.getValue() - 1));
        }
    }

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        printOddNumbers(nums);

        printEvenNumbers(nums);

        List<String> nums2 = Arrays.asList("card", "soft", "soft", "soft", "retry", "safari", "safari", "puls", "soft", "soft");

        printUniqueWords(nums2);

        printTakes(nums2);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 4, 3, 9, 2, 4));

        //Task1
        Main.printOnlyOddNumbers(nums);

        //Task2
        Main.printOvenNumbersWithoutRepetitionsInAscendingOrder(nums);

        List<String> strings = new ArrayList<>(List.of("Eight", "One", "Seven", "Two", "Three", "Two",
                "Four", "Five", "One", "Two", "One", "Six", "Seven"));

        //Task3
        Main.printUniqueWords(strings);

        //Task4
        Main.printNumberOfRepeatedWords(strings);

        nums = new ArrayList<>(List.of(2, 3, 4, 4, 5, 5, 6, 7, 4, 3, 9, 2, 4, 8, 2, 7));



    }

    public static void printOnlyOddNumbers(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>(nums);
        for (Integer num : newNums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOvenNumbersWithoutRepetitionsInAscendingOrder(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>(nums);
        Set<Integer> set = new HashSet<>(newNums);
        newNums.clear();
        newNums.addAll(set);

        Collections.sort(newNums);

        for (Integer num : newNums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printUniqueWords(List<String> strings) {
        List<String> newStrings = new ArrayList<>(strings);
        Set<String> set = new HashSet<>(newStrings);
        newStrings.clear();
        newStrings.addAll(set);
        System.out.println(newStrings);
        System.out.println();
    }

    public static void printNumberOfRepeatedWords(List<String> strings) {
        List<String> uniqueStrings = new ArrayList<>(strings);
        Set<String> set = new HashSet<>(uniqueStrings);
        uniqueStrings.clear();
        uniqueStrings.addAll(set);
        for (String uniqueString : uniqueStrings) {
            int count = Collections.frequency(strings, uniqueString);
            if (count > 1) {
                System.out.print(uniqueString + ": " + count);
                System.out.println();
            }
        }
    }





}
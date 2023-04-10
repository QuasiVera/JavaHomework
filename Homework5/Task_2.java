import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        String userInput = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, \n" +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, \n" +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        List<String> inputList = new ArrayList<String>(Arrays.asList(userInput.split("\\s*(,|\n)\\s*")));
        HashMap<String, Integer> names = new HashMap<>();

        for (String person : inputList) {
            String temp = person.split(" ")[0];
            if (names.containsKey(temp)) {
                names.compute(temp, (k, v) -> v += 1);
            } else {
                names.put(temp, 1);
            }
        }
        // System.out.println(names);
        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(names.entrySet());
        sortedNames.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(sortedNames);
    }
}

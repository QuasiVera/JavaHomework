package Homework6;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<String, String> parametersMap = new HashMap<>();
        Set<Notebook> set = new HashSet<>();

        setNotebooks(set);
        setParameters(parametersMap);
        sortedNotebooks(parametersMap, set);

    }

    // ------------ создание ассортимента ноутбуков

    static void setNotebooks(Set<Notebook> set) {
        Notebook model1 = new Notebook(8, 256, "Windows 11", "black");
        Notebook model2 = new Notebook(4, 128, "Windows 10", "black");
        Notebook model3 = new Notebook(4, 256, "Windows 10", "gray");
        Notebook model4 = new Notebook(8, 512, "Free DOS", "gray");
        Notebook model5 = new Notebook(16, 256, "Windows 11", "black");
        Notebook model6 = new Notebook(8, 256, "Mac OS", "black");
        Notebook model7 = new Notebook(8, 512, "Mac OS", "gray");
        Notebook model8 = new Notebook(16, 512, "Mac OS", "gray");

        set.add(model1);
        set.add(model2);
        set.add(model3);
        set.add(model4);
        set.add(model5);
        set.add(model6);
        set.add(model7);
        set.add(model8);
    }

    static void setParameters(Map<String, String> parametersMap) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n Выберите параметр: \n 1 - Оперативная память" +
                    " \n 2 - Объем жесткого диска \n 3 - Операционная система \n 4 - Цвет \n 0 - Показать ноутбуки \n");
            String choice = in.next();
            String parameter;
            switch (choice) {
                case "1":
                    parameter = "ram";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен минимальный объем ОЗУ ");
                    break;
                case "2":
                    parameter = "hdd";
                    recording(parametersMap, parameter);
                    System.out.println("\n Добавлен минимальный объем ЖД");
                    break;
                case "3":
                    parameter = "os";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен тип ОС ");
                    break;
                case "4":
                    parameter = "color";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен цвет ");
                    break;    
                case "0":
                    flag = false;
                    System.out.println("Подходящие варианты:");
                    break;
                default:
                    break;
            }
        }
    }

    // ----------- создание списка критериев с нужными значениями

    static void recording(Map<String, String> parametersMap, String parameter) {
        System.out.println("\n Введите необходимое/минимальное значение параметра " + parameter + "\n");
        Scanner in = new Scanner(System.in);
        String value = in.nextLine();
        if (parametersMap.containsKey(parameter)) {
            parametersMap.put(parameter, value);
            System.out.println("\n Значение перезаписано\n");
        } else {
            parametersMap.put(parameter, value);
            System.out.println("\n Значение принято\n");
        }
        System.out.println(parametersMap);

    }

    // ----------- выбор ноутбуков, соответствующих заданным критериям

    static void sortedNotebooks(Map<String, String> parametersMap, Set<Notebook> set) {
        int i = 1;
        for (Notebook notebook : set) {
            boolean validate = true;
            for (Map.Entry<String, String> entry : parametersMap.entrySet()) {
                if (entry.getKey().equals("ram")) {
                    if (!(notebook.getRam() >= Integer.parseInt(entry.getValue()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("hdd")) {
                    if (!(notebook.getHdd() >= Integer.parseInt(entry.getValue()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("os")) {
                    if (!(notebook.getOs().toLowerCase().contains(entry.getValue().toLowerCase()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("color")) {
                    if (!notebook.getColor().toLowerCase().contains(entry.getValue().toLowerCase())) {
                        validate = false;
                        
                    }
                }
            }
            if (validate) {
                System.out.println("Вариант " + i + " " + notebook);
                i++;
            }
        }
    }

}

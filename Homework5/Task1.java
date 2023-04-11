

import java.util.*;
/*
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
 */

public class Task1 {
    public static void main(String[] args) {
        phoneBookMain();

    }
    
    
    //----------------------- Меню

    static void phoneBookMain() {
        Map<String, List<String>> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in, "CP866");
        boolean flag = true;
        while (flag) {
            System.out.println("\n Выберите действие: \n 1 - Добавить запись в справочник" +
                    " \n 2 - Поиск по фамилии \n 3 - Вывести весь справочник \n 4 - Выход \n");
            String choice = in.next();
            switch (choice) {
                case "1":
                    recording(phoneBook);
                    System.out.println("Добавлено\n");
                    break;
                case "2":
                    search(phoneBook);
                    System.out.println("Поиск завершен");
                    break;
                case "3":
                    System.out.println("Весь справочник \n");
                    System.out.println(phoneBook);
                    break;
                case "4":
                    flag = false;
                    System.out.println("Справочник успешно закрыт");
                    break;
                default:
                    break;
            }
        }
    }
    
    //----------------------- Запись в книгу

    static void recording(Map<String, List<String>> phoneBook) {
        Scanner in = new Scanner(System.in, "CP866");
        System.out.println("Введите ФИО через пробел");
        String data = in.nextLine();
        System.out.println("Введите номер телефона");
        String number = in.nextLine();

        if (phoneBook.containsKey(data)) {
            List<String> list = phoneBook.get(data);
            list.add(number);
        } else {
            List<String> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(data, list);
        }
    }

    //----------------------- Поиск по книге

    static void search(Map<String, List<String>> phoneBook) {
        Scanner in = new Scanner(System.in, "CP866");
        System.out.println("Введите ФИО через пробел");
        String data = in.nextLine();
        
        for (String record : phoneBook.keySet()) {
            if (record.toLowerCase().contains(data.toLowerCase())) {
                List<String> list = phoneBook.get(record);
                System.out.println(record + list);
            }
        }  
    }
    

}

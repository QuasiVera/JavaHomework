package Homework2;

import java.io.IOException;
import java.util.logging.*;

/*
 * Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} Задача написать метод(ы), 
 * который распарсить строку и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика. 
 * Студент Петрова получил 4 по предмету Информатика. Студент Краснов получил 5 по предмету Физика. 
 * Используйте StringBuilder для подготовки ответа
 */
public class Task_1 {
    static Logger logger;

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        loggerSettings(logger);

        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        parsing(text, logger);
    }
    
    static void loggerSettings(Logger logger) {
        FileHandler fh;
        try {
            fh = new FileHandler("homework2/log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info("Тестовое логирование ");
        } catch (SecurityException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }

    }

    static void parsing(String text, Logger logger) {
        text = text.replaceAll("[\\[\\]{\"]", "");
        // text = text.replace("{", " ").replace("["," ").replace("]","
        // ").replace("\""," "); *Сохранение для меня

        String[] students;
        try {
            students = text.split("},"); // если формат строки будет другой, то будет исключение java.util.regex.PatternSyntaxException
            logger.log(Level.INFO, "Строка успешно разделена");

            for (String note : students) {
                String[] temp = note.split(",");
                String[] name = temp[0].split(":");
                String[] ball = temp[1].split(":");
                String[] lesson = temp[2].split(":");
                lesson[1] = lesson[1].replace("}", "");

                StringBuilder sb = new StringBuilder();
                sb.append("Студент ");
                sb.append(name[1]);
                sb.append(" получил ");
                sb.append(ball[1]);
                sb.append(" по предмету ");
                sb.append(lesson[1]);
                System.out.println(sb.toString());
                // System.out.println("Студент "+name[1]+" получил "+ball[1]+" по предмету
                // "+lesson[1]); *Сохранение для меня
            }
            logger.log(Level.INFO, "Данные из строки успешно получены");
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
            logger.log(Level.INFO, "Даные из строки не получены");
        }
    }
}

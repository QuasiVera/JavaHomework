package Homework2;

/*
 * Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} Задача написать метод(ы), 
 * который распарсить строку и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика. 
 * Студент Петрова получил 4 по предмету Информатика. Студент Краснов получил 5 по предмету Физика. 
 * Используйте StringBuilder для подготовки ответа
 */
public class Task_1 {
    public static void main(String[] args) {
        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        text = text.replaceAll("[\\[\\]{\"]", "");
        //text = text.replace("{", " ").replace("["," ").replace("]"," ").replace("\""," ");
        String[] students = text.split("},");

        for(String note : students)
        {
            String[] temp = note.split(",");
            String [] name = temp[0].split(":");
            String [] ball = temp[1].split(":");
            String [] lesson = temp[2].split(":");
            lesson[1] = lesson[1].replace("}", "");
            
            StringBuilder sb = new StringBuilder();
                sb.append("Студент ");
                sb.append(name[1]);
                sb.append(" получил ");
                sb.append(ball[1]);
                sb.append(" по предмету ");
                sb.append(lesson[1]);
                System.out.println(sb.toString());
            
            //System.out.println("Студент "+name[1]+" получил "+ball[1]+" по предмету "+lesson[1]);

        }
    }
}

package Homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;

/*
 * 3. *Получить исходную json строку из файла, используя FileReader или Scanner
 */

public class Task_3 {
    static Logger logger;

    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger(Task_3.class.getName());
        loggerSettings(logger);

        BufferedReader br = new BufferedReader(new FileReader("Homework2/Journal.json"));
        String str;
        StringBuilder res = new StringBuilder();
        while ((str = br.readLine()) != null) {
            res.append(str);
        }
        System.out.printf("Получено: \n %s", res.toString());
        logger.info("Считывание прошло успешно");
        br.close();

    }

    static void loggerSettings(Logger logger) {
        FileHandler fh;
        try {
            fh = new FileHandler("Homework2/log1.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info("Файл log1.txt создан ");
        } catch (SecurityException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
    }

}

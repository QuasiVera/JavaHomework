package Homework2;

import java.io.*;
import java.util.logging.*;


/*
 * 3. *Получить исходную json строку из файла, используя FileReader или Scanner
 */

public class Task_3 {
    static Logger logger;
    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger(Task_3.class.getName());
        FileHandler fh;
        try {
            fh = new FileHandler("log1.txt");
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

        BufferedReader br = new BufferedReader(new FileReader("Journal.json"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        logger.info("Считывание прошло успешно");
        br.close();

    }
    
}

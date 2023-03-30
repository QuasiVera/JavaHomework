package Homework2;

import java.io.*;
import java.io.IOException;

/*
 * 3. *Получить исходную json строку из файла, используя FileReader или Scanner
 */

public class Task_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Journal.json"));
        String str;
        while ((str = br.readLine()) != null) {
        System.out.println( str);
        }
        br.close();

    }
    
}

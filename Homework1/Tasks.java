import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        Task4();
        }
    
        static void Task1() {
        /*
        Вычислить n-ое треугольное число (сумма чисел от 1 до n)
         */
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число n: ");
            int n = in.nextInt();
            in.close();
            int sum = 0;
            if (n<0) {  System.out.println("Введено отрицательное число");}
            else if (n == 0 || n == 1) {  System.out.printf("Cумма равна: %d", n);}
            else {
            for (int i = 1; i <= n; i++)
            {
                sum+=i;
            }
            System.out.printf("Cумма равна: %d", sum);
            }
        }
    
        static void Task2() {
    
            /*
            Вычислить n! (произведение чисел от 1 до n)
             */
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число n: ");
            int n = in.nextInt();
            in.close();
            int factorial = 1;
            if (n<0) {  System.out.println("Введено отрицательное число");}
            else if (n == 0 || n == 1) {  System.out.printf("%d! равен 1", n);}
            else
            {
            for (int i = 2; i <= n; i++)
            {
                factorial*=i;
            }
            System.out.printf("%d! равен %d", n, factorial);
            }
        }
    
        static void Task3() {

            /*
            Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
             */
            int n = 1000;
            int[] arr = IntStream.rangeClosed(0, n).toArray();
            arr[1] = 0; // Вычеркиваем 1, потому что 1 не считается простым числом
            double sqrt = Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                for (int j = i * i; j < arr.length; j = j + i) // Вычеркиваем из массива числа кратные i начиная с i^2
                {
                    arr[j] = 0;
                }
            }
            int count = 0; // 66-82 Убираем нули из массива через создание нового
            for (int i = 0; i <= n; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }
            int[] newArr = new int[count];
            int j = 0;
            for (int i = 0; i <= n; i++) {
                if (arr[i] != 0) {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            String res = Arrays.toString(newArr);
            System.out.printf(res);
        }
        
        static void Task4() {
    
            /*
            Реализовать простой калькулятор (введите первое число, введите второе число, 
            введите требуемую операцию, ответ)
             */
            Scanner in = new Scanner(System.in);
            
            System.out.println("a =  ");
            double a = in.nextDouble();

            System.out.println("Опеация: + / - / * / : ");
            String value = in.next();

            System.out.println("b =  ");
            double b = in.nextDouble();
            in.close();

            double res=0;
            switch (value) {
            case "+":
            res = a + b;
            break;
            case "-":
            res = a - b;
            break;
            case "*":
            res = a * b;
            break;
            case ":":
            res = a / b;
            break;

            default:
            res = 0;
            break;
            }

            System.out.printf("Ответ: %s", res);  
        }
    
    
}

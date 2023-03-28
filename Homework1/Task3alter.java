/**
 * Task3alter
 */
public class Task3alter {

    public static void main(String[] args) {
        int n = 1000;
		System.out.println(2);
		int count =1;
		for (int i =2; i<=n; i++)
		{
		    int j =2;
		    while (true)
		    {
		        if (i%j==0) {break;}
		        j++;
		        if (j>Math.sqrt(i))
		        {
		            System.out.println(i);
		            count++;
		            break;
		        }
		    }
		    
		}
        System.out.printf("Число простых = %d ", count); // Для проверки; число простых чисел до 1000 равно 168 
    }
}
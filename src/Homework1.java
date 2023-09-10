import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// Створюємо інструмент для зчитування Scanner
        System.out.println("Розмірність матриці: ");
        System.out.print("n = ");
        int n = in.nextInt();//Вводимо кількість рядків
        System.out.print("m = ");
        int m = in.nextInt();//Вводимо кількість стовпців
        long  A[][] = new long [n][];//Виділяємо пам'ять під матриці А, В та результуючу матрицю C
        for(int i = 0; i < n; i++)
        {
          A[i] = new long [m];
        }
        long  B[][] = new long [n][];
        for(int i = 0; i < n; i++)
        {
          B[i] = new long [m];
        }
        long  C[][] = new long [n][];
        for(int i = 0; i < n; i++)
        {
          C[i] = new long [m];
        }
        System.out.println("\n A:");
        for(int i = 0; i < A.length; i++)
        {
          for(int j = 0; j < A[i].length; j++)
          {
            A[i][j] = (long) (Math.random()*35-10);//Заповнюємо матрицю А випадковими числами типу long та виводимо його 
            System.out.print(A[i][j] +" ");
          }
          System.out.println();
        }
        System.out.println("\n B:");
        for(int i = 0; i < B.length; i++)
        {
          for(int j = 0; j < B[i].length; j++)
          {
            B[i][j] = (long) (Math.random()*35-10);//Заповнюємо матрицю B випадковими числами типу long та виводимо його
            System.out.print(B[i][j] +" ");
          }
          System.out.println();
        }
        System.out.println("\n C:");
        for(int i = 0; i < C.length; i++)
        {
          for(int j = 0; j < C[i].length; j++)
          {
            C[i][j] = A[i][j]+B[i][j];//Виконуємо + між матрицями А та В
            System.out.print(C[i][j] +" ");
          }
          System.out.println();
        }
        long rez = 0;//змінна для пошуку суми найменших елементів у кожному рядку
        long min;//Змінна для пошуку найменших елемента в рядку
        for(int i = 0; i < C.length; i++)
        {
        	min = C[i][0];
        	for(int j = 1; j < C[i].length; j++)
        	{
        		if (min > C[i][j])
        		{
        			min = C[i][j];//Пошук мінімального значення у кожному рядку
        		}
        	}
        	rez += min;//Сума найменших елементів у кожному рядку 
        }
        System.out.print("Rezult = " +rez);
	}
}

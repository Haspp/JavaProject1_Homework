import java.util.Scanner;

public class homework1_task1 {
    // Запуск поиска Треугольного числа
    /*
     * 1. Ввод n!
     * 2. Принимаем n! и находим треугольное число
     */ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        // Вычисляем n-ое треугольное число
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("n-ое треугольное число: " + triangleNumber);

        // Вычисляем n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! = " + factorial);
    }
}

import java.util.Scanner;

public class homework1_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        double b = scanner.nextInt();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = a + b; 
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b == 0){
                    System.out.println("Деление на ноль невозможно!");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Операция неверна!");
                break;
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);
        scanner.close();

    }
}

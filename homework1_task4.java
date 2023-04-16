import java.util.Scanner;

// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

// Получилось только так, дальше делать времени нет
public class homework1_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение: ");
        String exmaple  = scanner.nextLine();
        solveEquation(exmaple);
      }
    
      private static void solveEquation(String equation) {
        for (int q = 0; q <= 9; q++) {
          for (int w = 0; w <= 9; w++) {
            String e = equation.replace("?", String.valueOf(q)).replace("?", String.valueOf(w));
            if (isValidEquation(e)) {
              System.out.println("Решение: " + e);
              return;
            }
          }
        }
        System.out.println("Решение не найдено");
      }
    
      private static boolean isValidEquation(String equation) {
        String[] parts = equation.split(" = ");
        if (parts.length != 2) {
          return false;
        }
        int left = 0;
        for (String part : parts[0].split(" \\+ ")) {
          if (!part.matches("\\d+")) {
            return false;
          }
          left += Integer.parseInt(part);
        }
        int right;
        try {
          right = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
          return false;
        }
        return left == right;
      }
}

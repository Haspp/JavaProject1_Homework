import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class homework1_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt(); 

        for(int i = 2; i <= number; ++i){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
        if(isPrime){
            System.out.print(i + " ");
        }
        }
    }
}

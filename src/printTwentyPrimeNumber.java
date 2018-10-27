import java.util.Scanner;

public class printTwentyPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 2; i > 0; i++){
            boolean prime = true;
            for (int j = 2; j < i;j++){
                if (i % j == 0){
                    prime = false;
                }
            }
            if (prime){
                System.out.println(i);
                count = count + 1;
            }
            if (count == number){
                break;
            }
        }
    }
}

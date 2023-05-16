import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Zadanie4_2 {
    public void solve() {
        try {
            File file = new File("liczby.txt");
            Scanner scanner = new Scanner(file);

            List<Integer> result = new ArrayList<>();

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();


                int sum = 0;
                int temp = number;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += factorial(digit);
                    temp /= 10;
                }


                if (number == sum) {
                    result.add(number);
                }
            }

            System.out.println("Liczby równe sumie silni swoich cyfr:");
            for (int number : result) {
                System.out.println(number);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

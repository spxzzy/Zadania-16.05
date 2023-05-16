import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Zadanie4_1 {
    public void solve() {
        try {
            File file = new File("liczby.txt");
            Scanner scanner = new Scanner(file);

            int count = 0;

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();


                if (isPowerOfThree(number)) {
                    count++;
                }
            }

            System.out.println("Liczba potęg liczby 3: " + count);

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private boolean isPowerOfThree(int number) {
        while (number > 1) {
            if (number % 3 != 0) {
                return false;
            }
            number /= 3;
        }
        return number == 1;
    }
}
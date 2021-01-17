import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SecretMessages {
    public static void begin() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в приложении \"Шифрование шифром цезаря\".");
        System.out.println("Введите строку, которую необходимо зашифровать или расшифровать при помощи шифра цезаря(для усложнения расшифровки строка сначала перевернётся, а потом зашифруется)");
        String message1 = s.nextLine();
        char[] array = message1.toCharArray();
        String message = "";
        for (int i = array.length - 1; i >= 0; i--) {
            message = message + array[i];
        }
        String out = "";
        System.out.println("Перевёнутая строка: " + message);
        System.out.println("Введите сдвиг(Для Русского от -32 до 32, а для Английского - от -25 до 25):");
        int keyVal = Integer.parseInt(s.nextLine());
        char key = (char) (((char) keyVal) % 32);
        for (int i = 0; i < message.length(); i++) {
            char inp = message.charAt(i);
            if ((inp >= 'А' && inp <= 'Я') || (inp >= 'а' && inp <= 'я')) {
                inp += key;
                if (inp > 'Я') {
                    inp -= 32;
                }
                if (inp < 'А') {
                    inp += 32;
                }
                if (inp > 'я') {
                    inp -= 32;
                }
                if (inp < 'а') {
                    inp += 32;
                }
            } else if (inp >= 'A' && inp <= 'Z') {
                inp += key;
                if (inp > 'Z') {
                    inp -= 26;
                }
                if (inp < 'A') {
                    inp += 26;
                }
            } else if (inp >= 'a' && inp <= 'z') {
                inp += key;
                if (inp > 'z') {
                    inp -= 26;
                }
                if (inp < 'a') {
                    inp += 26;
                }
            } else if (inp >= '0' && inp <= '9') {
                inp += (keyVal % 10);
                if (inp > '9') {
                    inp -= 10;
                }
                if (inp < '0') {
                    inp += 10;
                }
            }
            out += inp;
        }
        System.out.println(out);
        Main.Admin();
    }
}

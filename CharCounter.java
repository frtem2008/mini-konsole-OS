import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarOutputStream;
import java.util.stream.Stream;

public class CharCounter {
    public static void begin() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в приложении \"подсчёт символов в строке\"");
        System.out.println("Хотите ли вы подсчитать количество только выбранного вами символа или количество каждого символа в строке(1/2)");
        int action = s. nextInt();
        if (action == 1) {
            schet();
        } else if (action == 2) {
            parseString();
        }
    }

    public static void schet() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку, в которой необходимо посчитать кол-во символов");
        String str = s.nextLine();
        System.out.println("Введите желаемый символ");
        char c = s.nextLine().charAt(0);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                res += 1;
            }
        }
        if (res > 0) {
            System.out.println("В этой строке " + res + " символов \"" + c + "\".");
        }
        if (res == 0) {
            System.out.println("В этой строке нет символов \"" + c + "\".");
        }
        Main.Admin();

    }

    public static void parseString() throws InterruptedException, IOException {
        System.out.println("Авторские права на это приложение принадлежат пользователю RedPatrick. Взято с https://www.cyberforum.ru/java-j2se/thread1743716.html. Все права защищены. ");
        System.out.println("Введите строку, в которой необходимо подсчитать количество символов:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<String, Integer> values = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String t = (s.substring(i, i + 1));
            values.computeIfPresent(t, (k, v) -> v + 1);
            values.putIfAbsent(t, 1);
        }

        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equals(" ")) {
                System.out.println("Символ пробела есть в строке " + value + " раз.");
            } else {
                System.out.println("Символ " + key + " появляется в строке " + value + " раз.");
            }
        }
        System.out.println("Вы можете поблагодарить создателя этого метода в личном сообщении на https://www.cyberforum.ru/members/747463.html (для отправки личного сообщения необходимо зарегистрироваться или авторизироваться на сайте)");
        Main.Admin();
    }
}
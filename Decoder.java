import java.util.Scanner;

public class Decoder {
    public static void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в приложении \"Декодер\"");
        System.out.println("Введите строку, у которой необходимо поменять раскладку клавиатуры:");
        String toDecode = s.nextLine();
        decode(toDecode);
    }

    public static void decode(String toDecode) {
        Scanner s = new Scanner(System.in);
        char[] englishLetters = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '\'', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '/', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '{', '}', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ':', '"', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', '<', '>', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '?', ' '};
        char[] russianLetters = {'й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ъ', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о', 'л', 'д', 'ж', 'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', 'Й', 'Ц', 'У', 'К', 'Е', 'Н', 'Г', 'Ш', 'Щ', 'З', 'Х', 'Ъ', 'Ф', 'Ы', 'В', 'А', 'П', 'Р', 'О', 'Л', 'Д', 'Ж', 'Э', 'Я', 'Ч', 'С', 'М', 'И', 'Т', 'Ь', 'Б', 'Ю', '!', '"', '№', ';', '%', ':', '?', '*', '(', ')', ',', ' '};
        StringBuilder res = new StringBuilder("");
        System.out.println("С какой расскладки на какую поменять? (Из Английского в Русский/Из Русского в Английский(1/2))");
        String activity = s.nextLine();
        if (activity.equals("1") || activity.equals("Из Английского в Русский")) {
            for (int i = 0; i < toDecode.length(); i++) {
                for (int j = 0; j < englishLetters.length; j++) {
                    if (toDecode.charAt(i) == englishLetters[j]) {
                        res.append(russianLetters[j]);
                    }
                }
            }
            System.out.println(res);
        }
        if (activity.equals("2") || activity.equals("Из Русского в Английский")) {
            for (int i = 0; i < toDecode.length(); i++) {
                for (int j = 0; j < russianLetters.length; j++) {
                    if (toDecode.charAt(i) == russianLetters[j]) {
                        res.append(englishLetters[j]);
                    }
                }
            }
            System.out.println(res);
        }
    }
}

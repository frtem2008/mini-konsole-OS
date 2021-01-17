import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static Scanner s = new Scanner(System.in);

    public static void init() throws IOException, InterruptedException {
        String[] modes = {"Обычный калькулятор", "Калькулятор приведённой брони", "Перевод единиц измерения", "Калькуляторы перестановок", "НОК и НОД чисел"};
        System.out.println("Приветствуем вас в приложении калькулятор");
        System.out.println("Выберите режим работы из списка:");
        int n = 0;
        for (int i = 0; i < modes.length - 1; i++) {
            n = i;
            System.out.println((i + 1) + ") " + modes[i] + ", ");
        }
        System.out.println((n + 2) + ") " + modes[n + 1]);
        String mode = s.nextLine();
        if (mode.equals("Обычный калькулятор") || mode.equals("1")) {
            System.out.println("Сорян, пока в разработке :(");
            Main.vxod();
        } else if (mode.equals("Калькулятор приведённой брони") || mode.equals("2")) {
            Calculator_Broni.calc();
        } else if (mode.equals("Перевод единиц измерения") || mode.equals("3")) {
            fromAtoB();
        } else if (mode.equals("Калькуляторы перестановок") || mode.equals("4")) {
            changes();
        } else if (mode.equals("НОК и НОД чисел")|| mode.equals("5")){
            NoKAndNoD.start();
        }


    }

    public static void simpleCalc() {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] operations = {'+', '-', '*', '/'};
        String inp = s.nextLine();
        String[] n = {"", "", "", "", ""};
        int a = 0;
        for (int i = 0; i < 4; i++) {
            while (inp.charAt(a) != operations[0] && inp.charAt(a) != operations[1] && inp.charAt(a) != operations[2] && inp.charAt(a) != operations[3]) {
                n[i] += inp.charAt(a);
                a++;
            }
            a += 2;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static void fromAtoB() {
        String[] fromTo = {"Км/ч -> м/c", "М/с -> км/ч", "Минуты в часы", "Секунды в часы", "Часы в минуты", "Часы в секунды", "Секунды  в минуты", "Минуты в секунды"};
        System.out.println("Выберите ваш вариант:");
        int n = 0;
        for (int i = 0; i < fromTo.length - 1; i++) {
            n = i;
            System.out.println((i + 1) + ") " + fromTo[i] + ", ");
        }
        System.out.println((n + 2) + ") " + fromTo[n + 1]);
        String mode = s.nextLine();
        if (mode.equals("Км/ч -> м/c") || mode.equals("1")) {
            System.out.println("Введите км/ч: ");
            double a = s.nextDouble();
            String res = new DecimalFormat("#0.0000").format(kmPerHtoMPerSec(a, true));
            System.out.println(a + " км/ч =" + res + "м/с");
        } else if (mode.equals("М/с -> км/ч") || mode.equals("2")) {
            System.out.println("Введите м/с:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.0000").format(kmPerHtoMPerSec(b, false));
            System.out.println(b + " м/с = " + res + "км/ч");
        } else if (mode.equals("Минуты в часы") || mode.equals("3")) {
            System.out.println("Введите минуты:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.000").format(minSecHours(b, 1));
            System.out.println(b + " минут = " + res + " часов");
        } else if (mode.equals("Секунды в часы") || mode.equals("4")) {
            System.out.println("Введите секунды:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.00").format(minSecHours(b, 2));
            System.out.println(b + " секунд = " + res + " часа");
        } else if (mode.equals("Часы в минуты") || mode.equals("5")) {
            System.out.println("Введите часы:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.00").format(minSecHours(b, 3));
            System.out.println(b + " часов = " + res + " минут");
        } else if (mode.equals("Часы в секунды") || mode.equals("6")) {
            System.out.println("Введите часы:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.0").format(minSecHours(b, 4));
            System.out.println(b + " часов = " + res + " секунд");
        } else if (mode.equals("Секунды в минуты") || mode.equals("7")) {
            System.out.println("Введите секунды:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.00").format(minSecHours(b, 5));
            System.out.println(b + " секунд = " + res + " минут");
        } else if (mode.equals("Минуты в секунды") || mode.equals("8")) {
            System.out.println("Введите минуты:");
            double b = s.nextDouble();
            String res = new DecimalFormat("#0.00").format(minSecHours(b, 6));
            System.out.println(b + " минут = " + res + " секунд");
        }

    }

    public static void changes() {
        String[] changes = {"C из N по K", "A из N по K", "P из N по K"};
        System.out.println("Выберите ваш вариант:");
        int a = 0;
        for (int i = 0; i < changes.length - 1; i++) {
            a = i;
            System.out.println((i + 1) + ") " + changes[i] + ", ");
        }
        System.out.println((a + 2) + ") " + changes[a + 1]);
        String mode = s.nextLine();
        if (mode.equals("C из N по K") || mode.equals("1")) {
            System.out.println("Введите K:");
            int k = s.nextInt();
            System.out.println("Введите N:");
            int n = s.nextInt();
            while (n < k) {
                System.out.println("N не может быть меньше K");
                System.out.println("Введите N:");
                n = s.nextInt();
            }
            System.out.println("C из N по K при K = " + k + " и N = " + n + " равняется " + cNK(n, k));
        } else if (mode.equals("A из N по K") || mode.equals("2")) {
            System.out.println("Введите K:");
            int k = s.nextInt();
            System.out.println("Введите N:");
            int n = s.nextInt();
            while (n < k) {
                System.out.println("N не может быть меньше K");
                System.out.println("Введите N:");
                n = s.nextInt();
            }
            System.out.println("A из N по K при K = " + k + " и N = " + n + " равняется " + aNK(n, k));
        } else if (mode.equals("P из N по K") || mode.equals("3")) {
            System.out.println("Введите N");
            int n = s.nextInt();
            System.out.println("Количество перестановок из " + n + " элементов равно " + factorial(n));
        }
    }


    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i < n + 1; i++) {
            res *= i;
        }
        return res;
    }

    public static int cNK(int n, int k) {
        return factorial(n) / (factorial(n - k) * factorial(k));
    }

    public static int aNK(int n, int k) {
        return factorial(n) / factorial(n - k);
    }

    public static double kmPerHtoMPerSec(double km, boolean b) {
        //b == true ==> км/ч в м/с
        //b == false ==> м/с в км/ч
        if (b) {
            return km / 3.6;
        } else {
            return km * 3.6;
        }
    }

    public static double minSecHours(double n, int c) {
        //с == 1 ==> минуты в часы
        //с == 2 ==> секунды в часы
        //с == 3 ==> часы в минуты
        //с == 4 ==> часы в секунды
        //с == 5 ==> секунды в минуты
        //с == 6 ==> минуты в секунды
        if (c == 1) {
            return n / 60;
        } else if (c == 2) {
            return n / 3600;
        } else if (c == 3) {
            return n * 60;
        } else if (c == 4) {
            return n * 3600;
        } else if (c == 5) {
            return n / 60;
        } else if (c == 6) {
            return n * 60;
        } else {
            return -1;
        }
    }
}


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Консольная операционная система.");
        vxod();
    }

    public static void vxod() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        String Admin_Password = "1";
        String uchenicPassword = "2";
        System.out.println("Выберите пользователя(Админ/Ученик/Новая учётка).");
        String user = s.nextLine();
        boolean truePassword = false;
        System.out.println("Учётная запись: " + user);

        while (!truePassword) {
            if (user.equals("Админ")) {
                System.out.println("Введите пароль");
                String password = s.nextLine();

                if (password.equals(Admin_Password)) {
                    truePassword = true;
                    Admin();
                } else {
                    System.out.println("Неверный пароль!!!");
                }
            } else if (user.equals("Ученик")) {
                System.out.println("Введите пароль:");
                String password = s.nextLine();
                if (password.equals(uchenicPassword)) {
                    truePassword = true;
                    //uchenic();
                } else {
                    System.out.println("Неверный пароль!!!");
                }
            } else if (user.equals("Новая учётка")) {
                System.out.println("Пока в разработке(Кто знает, как сделать, напишите пж на ungazhiv2008@yandex.ru!!!)");
                vxod();
            } else {
                System.out.println("Такой учётной записи не существует!!!");
                user = s.nextLine();
            }
        }
    }


    public static void Admin() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        String[] apps = {"МакДоставка", "Угадай Число", "Графический Редактор-1.0", "Калькулятор приведённой брони", "Подсчёт сиволов в строке", "Лабиринт Лосося", "Шифрование шифром цезаря", "Декодер", "Число в текст", "Калькулятор"};
        System.out.println("Добро пожаловать, Админ!!!");
        System.out.println("Выберите действие(ЗапускПриложения/Очистить консоль/ВыходИзУчётки/ВыходИзСистемы)");
        String activity = s.nextLine();
        if (activity.equals("ВыходИзУчётки") || activity.equals("3")) {
            System.out.println("Выход...");
            Main.vxod();
        } else if (activity.equals("Очистить консоль") || activity.equals("2")) {
            for (int i = 0; i < 23; i++) {
                System.out.println("");
            }
            System.out.println("Очищено");
            Admin();
        } else if (activity.equals("ВыходИзСистемы") || activity.equals("-1") || activity.equals("4")) {
            System.out.println("Выход из системы...");
            Thread.sleep(150);
            s.close();
            System.exit(0);
        } else if (activity.equals("ЗапускПриложения") || activity.equals("1")) {
            System.out.println("Выберите приложение:");
            int j = 0;
            for (int i = 0; i < apps.length - 1; i++) {
                j = i;
                System.out.println(i + 1 + ")" + apps[i] + ", ");
            }
            System.out.println(j + 2 + ")" + apps[j + 1]);
            String runApp = s.nextLine();
            if (runApp.equals("Угадай Число") || runApp.equals("2")) {
                GuessNumber.guess();
            }

            if (runApp.equals("МакДоставка") || runApp.equals("1")) {
                MakDostavka.MakDostavka();
            }

            if (runApp.equals("Графический Редактор-1.0") || runApp.equals("3")) {
                System.out.println("Приложение запущено в отдельном окне (внизу в панели приложений).");
                BubllePixelDraw.run();
            }
            if (runApp.equals("Калькулятор приведённой брони") || runApp.equals("4")) {
                Calculator_Broni.calc();
            }
            if (runApp.equals("Подсчёт символов в строке") || runApp.equals("5")) {
                CharCounter.begin();
            }
            if (runApp.equals("Лабиринт Лосося") || runApp.equals("6")) {
                System.out.println("Авторские права на эту игру принадлежат Максиму Липскому, ученику 7-м класса ЛНМО. Все права защищены. Скопировано с его разрешения.");
                Thread.sleep(1000);
                System.out.println("Предупреждение: после закрытия приложения ОС завершит работу, тк приложение не лицензионное.");
                Thread.sleep(1000);
                System.out.println("Приложение запущено в отдельном окне (внизу в панели приложений).");
                Thread.sleep(1000);
                LipovskyGame.run();
                System.exit(20);

            }
            if (runApp.equals("Шифрование шифром цезаря") || runApp.equals("7")) {
                SecretMessages.begin();
            }
            if (runApp.equals("Декодер") || runApp.equals("8")) {
                Decoder.run();
            }
            if (runApp.equals("Число в текст") || runApp.equals("9")) {
                numberToText.start();
            }
            if (runApp.equals("10") || runApp.equals("Калькулятор")){
                Calculator.init();
            }

            Admin();
        } else {
            System.out.println("Такого действия не существует!!!");
            Admin();
        }
    }

    /*public static void uchenic() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        File file = new File("C:\\Users\\Дом\\IdeaProjects\\KonsoleOperationSystem\\StudentApps.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file.getAbsoluteFile());

        Scanner fileScanner = new Scanner(new File("C:\\Users\\Дом\\IdeaProjects\\KonsoleOperationSystem\\StudentApps"));
        boolean first = fileScanner.hasNextLine();
        String[] allapps = {"МакДоставка", "Угадай Число", "Графический Редактор-1.0", "Калькулятор приведённой брони", "Подсчёт сиволов в строке", "Лабиринт Лосося", "Шифрование шифром цезаря", "Декодер"};
        String[] apps = new String[allapps.length];
        System.out.println("Добро пожаловать, Ученик!!!");
        System.out.println("Выберите действие(ЗапускПриложения/Очистить консоль/ВыходИзУчётки/ВыходИзСистемы)");
        String activity = s.nextLine();
        if (activity.equals("ВыходИзУчётки") || activity.equals("3")) {
            System.out.println("Выход...");
            Main.vxod();
        } else if (activity.equals("Очистить консоль") || activity.equals("2")) {
            for (int i = 0; i < 20; i++) {
                System.out.println(" ");
            }
            System.out.println("Очищено");
            uchenic();
        } else if (activity.equals("ВыходИзСистемы") || activity.equals("-1") || activity.equals("4")) {
            System.out.println("Выход из системы...");
            Thread.sleep(150);
            s.close();
            System.exit(0);
        } else if (activity.equals("ЗапускПриложения") || activity.equals("1")) {
            if (!first) {
                System.out.println("У вас сейчас нет установленных приложений");
                System.out.println("Хотите установить?");
                String download = s.nextLine();
                if (download.equals("Да") || download.equals("1")) {
                    System.out.println("Выберите приложения:");
                    int j = 0;
                    for (int i = 0; i < allapps.length - 1; i++) {
                        j = i;
                        System.out.println(i + 1 + ")" + allapps[i] + ", ");
                    }
                    System.out.println(j + 2 + ")" + allapps[j + 1]);
                    System.out.println("Введите количество приложений, которые Вы хотите установить");
                    int walue = s.nextInt();
                    for (int i = 0; i < walue + 1; i++) {
                        String app = s.nextLine();
                        for (int k = 0; k < allapps.length; k++) {

                        }
                        apps[i] = app;
                    }
                    for (int i = 0; i < apps.length; i++) {
                        System.out.println(apps[i]);
                        if (apps[i] != null) {
                            for (int k = 0; k < apps[i].length(); k++) {
                                writer.write(apps[i].charAt(k));
                            }
                        }
                    }
                }
            }
        }
    }
*/
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
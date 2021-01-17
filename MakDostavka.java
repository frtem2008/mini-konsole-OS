import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MakDostavka {


    public static void MakDostavka() throws InterruptedException, IOException {

        Scanner s = new Scanner(System.in);
        String[] food = {"бигБеларусМак", "картошкаФри", "нагеттсыКуриные", "чикенБургер", "салатЦезарь", "котВасилий"};
        String[] numbersOfFood = {"1", "2", "3", "4", "5", "6"};
        double[] prisesOfFood = {1.25, 0.75, 0.95, 1.2, 1.5, 0.0};
        String[] drinkings = {"спрайт", "кока-кола", "фанта", "водаСоЛьдом"};
        String[] numbersOfDrinkings = {"1", "2", "3", "4"};
        double[] prisesOfDrinkings = {0.45, 0.65, 0.5, 0.25,};
        String[] otherThings = {"киндер-сюрприз", "стакан", "пакет"};
        String[] numbersOfOthers = {"1", "2", "3"};
        double[] prisesOfOther = {1.05, 0.03, 0.15};
        double sum = 0.0;
        boolean cont = true;
        double cashback;
        double money;

        System.out.println("Приветствуем Вас в приложении МакДоставка");

        do {
            System.out.println("Выберите действие:(Заказ/Чек/ВыходИзПриложения)");
            String activity = s.nextLine();
            if (activity.equals("Заказ") || activity.equals("1")) {
                System.out.println("Выберите категорию заказываемой еды(еда/напитки/другое)");
                String category = s.nextLine();
                if (category.equals("еда") || category.equals("1")) {
                    System.out.println("Выберите блюдо:)");
                    for (int i = 0; i < food.length; i++) {
                        System.out.println(food[i]);
                    }
                    String foodStuff = s.nextLine();
                    for (int i = 0; i < food.length; i++) {

                        if (foodStuff.equals(food[i]) || foodStuff.equals(numbersOfFood[i])) {
                            sum += prisesOfFood[i];
                        }

                    }
                    System.out.println("Сейчас ваш заказ стоит " + sum);
                }
                if (category.equals("напитки") || category.equals("2")) {
                    System.out.println("Выберите напиток:)");
                    for (int i = 0; i < drinkings.length; i++) {
                        System.out.println(drinkings[i]);
                    }
                    String drink = s.nextLine();
                    for (int i = 0; i < drinkings.length; i++) {
                        if (drink.equals(drinkings[i]) || drink.equals(numbersOfDrinkings[i])) {
                            sum += prisesOfDrinkings[i];
                        }

                    }
                    System.out.println("Сейчас ваш заказ стоит " + sum);
                }
                if (category.equals("другое") || category.equals("3")) {
                    System.out.println("Выберите другое:)");
                    for (int i = 0; i < otherThings.length; i++) {
                        System.out.println(otherThings[i]);
                    }
                    String other = s.nextLine();
                    for (int i = 0; i < otherThings.length; i++) {
                        if (other.equals(otherThings[i]) || other.equals(numbersOfOthers[i])) {
                            sum += prisesOfOther[i];
                        }

                    }
                    System.out.println("Сейчас ваш заказ стоит " + sum);
                }

            }
            if (activity.equals("Чек") || activity.equals("2")) {
                cont = false;
                System.out.println("Заплатите " + sum + " белорусских рублей(Число с плавающей запятой)");
                money = s.nextDouble();
                double paznica = sum - money;
                while (money < sum) {
                    System.out.println("Доплатите ещё " + paznica + " белорусских рублей");
                    money += s.nextDouble();

                }
                cashback = (float) money - sum;
                System.out.println("Ваш заказ и сдача:" + cashback + " белорусских рублей.");
                System.out.println("Ждём вас снова");
                cont = false;
                break;
            }
            if (activity.equals("ВыходИзПриложения") || activity.equals("3")) {
                if (sum > 0) {
                    System.out.println("Вы не закончили заказ. Вы уверены, что хотите выйти?(да/нет)");
                    String CONTINUE = s.nextLine();
                    if (CONTINUE.equals("да") || CONTINUE.equals("1")) {
                        Main.Admin();
                    }
                    if (CONTINUE.equals("нет") || CONTINUE.equals("2")) {
                        activity = "Заказ";
                    }
                } else {
                    Main.Admin();
                }
            }
        } while (cont);
    }
}

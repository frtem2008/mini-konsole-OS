import java.io.IOException;
import java.util.Scanner;

public class GuessNumber{
    public static void guess() throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в приложении \"Угадай число\"");
        String playAgain = "";
        do{
            int number = (int)(Math.random() * 100 + 1);
            int guess = 0;
            while (guess!= number){
                System.out.println("Введите номер от 1 до 100");
                guess = s.nextInt();
                if (guess == 10101){
                    System.out.println(number);
                }else if(guess < number){
                    System.out.println("Это число больше, чем " + guess);
                }else if(guess > number){
                    System.out.println("Это число меньше, чем " + guess);
                }else if (guess == number){
                    System.out.println("Вы угадали! " + guess);
                }
            }
            System.out.println("Играть ещё (1/2)");
            playAgain = s.next();
        }while (playAgain.equals("1"));
        System.out.println("Спасибо за игру!");
        Main.Admin();
    }
}
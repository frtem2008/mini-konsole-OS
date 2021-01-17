import java.util.Scanner;

public class NoKAndNoD {
    public static void start() {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в приложении \"Нахождение наибольшего общего делителя и наименьшего общего кратного (1/2)\"");
        String activity = s.nextLine();
        if (activity.equals("1")){
            System.out.println("Введите 2 числа, у которых нужно найти НоД");
            long a = s.nextLong();
            long b = s.nextLong();
            System.out.println("НОК от " + a + " и " + b + " равен " + NoD(a,b));
        }else if (activity.equals("2")){
            System.out.println("Введите 2 числа, у которых нужно найти НоК");
            long a = s.nextLong();
            long b = s.nextLong();
            System.out.println("НОК от " + a + " и " + b + " равен " + NoK(a,b));
        }
    }

    public static long NoD(long a, long b) {
        if (a == 0){
            return b;
        } else if (a == b){
            return a;
        }else if (b == 0){
            return a;
        }else{
            if (a >= b){
                return NoD(a%b,b);
            }else if (b >= a){
                return NoD(b%a,a);
            }
        }
        return 100;
    }

    public static long NoK(long a, long b) {
        return (a*b)/NoD(a,b);
    }
}

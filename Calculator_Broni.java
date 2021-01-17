
import java.util.*;

public class Calculator_Broni {
    public static void calc() {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в калькуляторе приведённой брони");
        System.out.println("Угол, по толщине бронелиста и нужной вам толщине или толщина по исходной толщине и угу (1/2)");
        int variant = s.nextInt();
        boolean CONT = true;
        while (CONT) {
            if (variant == 1) {
                boolean cont = true;
                do {
                    System.out.println("введите толщину бронелиста");
                    int a = s.nextInt();
                    if (a < 0) {
                        break;
                    }
                    System.out.println("Введите нужную вам толщину");
                    double corner = s.nextInt();
                    double sinA = a / corner;
                    double res1 = Math.asin(sinA);
                    double res = (int) (Math.toDegrees(res1));
                    System.out.println("Угол в градусах равен " + res);
                    System.out.println("Считать ещё?(1 или 0)");
                    int Do = s.nextInt();
                    if (Do != 1) {
                        break;
                    }
                } while (cont);
                break;
            } else {
                boolean cont = true;
                do {
                    System.out.println("Введите толщину бронелиста");
                    int a = s.nextInt();
                    System.out.println("Введите угол наклона");
                    double corner = s.nextInt();
                    if (corner < 0) {

                        break;
                    }
                    double CORNER = Math.toRadians(corner);
                    double sin = Math.sin(CORNER);
                    double res = (int) (a * (1 / sin));
                    System.out.println("Приведённая броня в миллиметрах равна " + res);
                    System.out.println("Считать ещё?(1 или 0)");
                    int Do = s.nextInt();
                    if (Do != 1) {
                        break;
                    }
                } while (cont);
                break;
            }
        }
    }
}

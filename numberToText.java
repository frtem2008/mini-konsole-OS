import java.util.Scanner;

public class numberToText {
    public static void start() {
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствуем вас в приложении \"Число в текст\"");
        System.out.println("Введите число:");
        String x = s.nextLine();
        String[] n = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] numbersFromOneToTen = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numbersFromTenToNineteen = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "ten",};
        String[] thirtyFortyEts = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String res = "";
        for (int i = 0; i < x.length(); i++) {
            if (i == 0 && x.length() == 1) {
                for (int j = 0; j < 9; j++) {
                    if (x.equals(n[j])) {
                        res += numbersFromOneToTen[j];
                    }
                }
            }
            if (i == 0 && x.length() == 2 && Integer.parseInt(x) < 20) {
                for (int j = 0; j < 10; j++) {
                    if (Integer.parseInt(String.valueOf(x.charAt(1))) == Integer.parseInt(n[j])) {
                        res += numbersFromTenToNineteen[j];
                        break;
                    }
                }
            }
            if (i == 0 && x.length() == 2 && Integer.parseInt(x) > 19 && Integer.parseInt(x) < 100) {
                for (int j = 0; j < 9; j++) {
                    if (Integer.parseInt(String.valueOf(x.charAt(0))) == Integer.parseInt(n[j])) {
                        res += thirtyFortyEts[j];
                        for (int k = 0; k < 10; k++) {
                            if (Integer.parseInt(String.valueOf(x.charAt(1))) == 0) {

                            } else if (Integer.parseInt(String.valueOf(x.charAt(1))) == Integer.parseInt(n[k])) {
                                res += " " + numbersFromOneToTen[k];
                            }

                        }
                    }
                }
            }
            if (i == 0 && x.length() == 3) {
                for (int j = 0; j < 9; j++) {
                    if (Integer.parseInt(String.valueOf(x.charAt(0))) == Integer.parseInt(n[j])) {
                        res += numbersFromOneToTen[j] + " hundred ";
                        for (int k = 0; k < 9; k++) {
                            if (x.charAt(1) != '0') {
                                if (Integer.parseInt(String.valueOf(x.charAt(1))) == Integer.parseInt(n[k])) {
                                    if (x.charAt(1) != '1') {
                                        res += thirtyFortyEts[k];
                                        for (int a = 0; a < 10; a++) {
                                            if (Integer.parseInt(String.valueOf(x.charAt(2))) == 0) {

                                            } else if (Integer.parseInt(String.valueOf(x.charAt(2))) == Integer.parseInt(n[a])) {
                                                res += " " + numbersFromOneToTen[a];
                                            }
                                        }
                                    } else {
                                        for (int a = 0; a < 10; a++) {
                                            if (Integer.parseInt(String.valueOf(x.charAt(2))) == Integer.parseInt(n[a])) {
                                                res += numbersFromTenToNineteen[a];
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (int a = 0; a < 10; a++) {
                                    if (Integer.parseInt(String.valueOf(x.charAt(2))) == 0) {

                                    } else if (Integer.parseInt(String.valueOf(x.charAt(2))) == Integer.parseInt(n[a])) {
                                        res += numbersFromOneToTen[a];
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
            if (i == 0 && x.length() == 4) {
                for (int j = 0; j < 9; j++) {
                    if (Integer.parseInt(String.valueOf(x.charAt(0))) == Integer.parseInt(n[j])) {
                        res += numbersFromOneToTen[j] + " thousand ";
                        for (int a = 0; a < 10; a++) {
                            if (x.charAt(1) != '0') {
                                if (Integer.parseInt(String.valueOf(x.charAt(1))) == Integer.parseInt(n[a])) {
                                    res += numbersFromOneToTen[a] + " hundred ";
                                    for (int k = 0; k < 10; k++) {
                                        if (x.charAt(2) != '0') {
                                            if (Integer.parseInt(String.valueOf(x.charAt(2))) == Integer.parseInt(n[k])) {
                                                if (x.charAt(1) != '1') {
                                                    res += thirtyFortyEts[k];
                                                    for (int b = 0; b < 10; b++) {
                                                        if (Integer.parseInt(String.valueOf(x.charAt(3))) == 0) {

                                                        } else if (Integer.parseInt(String.valueOf(x.charAt(3))) == Integer.parseInt(n[b])) {
                                                            res += " " + numbersFromOneToTen[b];
                                                        }
                                                    }
                                                } else {
                                                    for (int z = 0; z < 10; z++) {
                                                        if (Integer.parseInt(String.valueOf(x.charAt(1))) == Integer.parseInt(n[z])) {
                                                            res += numbersFromTenToNineteen[z];
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        } else {
                                            for (int b = 0; b < 10; b++) {
                                                if (Integer.parseInt(String.valueOf(x.charAt(3))) == 0) {

                                                } else if (Integer.parseInt(String.valueOf(x.charAt(3))) == Integer.parseInt(n[b])) {
                                                    res += numbersFromOneToTen[b];
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            } else {
                                for (int k = 0; k < 10; k++) {
                                    if (x.charAt(2) != '0') {
                                        if (Integer.parseInt(String.valueOf(x.charAt(2))) == Integer.parseInt(n[k])) {
                                            res += thirtyFortyEts[k];
                                            for (int b = 0; b < 10; b++) {
                                                if (Integer.parseInt(String.valueOf(x.charAt(3))) == 0) {

                                                } else if (Integer.parseInt(String.valueOf(x.charAt(3))) == Integer.parseInt(n[b])) {
                                                    res += " " + numbersFromOneToTen[b];
                                                }
                                            }
                                        }
                                    } else {
                                        for (int b = 0; b < 10; b++) {
                                            if (Integer.parseInt(String.valueOf(x.charAt(3))) == 0) {

                                            } else if (Integer.parseInt(String.valueOf(x.charAt(3))) == Integer.parseInt(n[b])) {
                                                res += numbersFromOneToTen[b];
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }

        }
        System.out.println(res);
    }
}

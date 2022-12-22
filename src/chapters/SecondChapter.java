package chapters;

import java.util.Scanner;

public class SecondChapter extends FirstChapter {
    static int answer;
    static int number = getRandom();

    public static void go() {
        Scanner input = new Scanner(System.in);
        switch (number) {
            case 9:
                System.out.println("Первая загадка");
                answer = input.nextInt();
                if (answer == 1) {
                    System.out.println("Верно");
                } else {
                    System.out.println("Вы мертвы");
                }
                break;
            case 4:
                System.out.println("Вторая загадка");
                answer = input.nextInt();
                if (answer == 2) {
                    System.out.println("Верно");
                } else {
                    System.out.println("Вы мертвы");
                }
                break;
            case 1:
                System.out.println("Третья загадка");
                answer = input.nextInt();
                if (answer == 3) {
                    System.out.println("Верно");
                } else {
                    System.out.println("Вы мертвы");
                }
                break;
            default:
                System.out.println("Первая загадка");
                answer = input.nextInt();
                if (answer == 1) {
                    System.out.println("Верно");
                } else {
                    System.out.println("Вы мертвы");
                    break;
                }

                System.out.println("Вторая загадка");
                answer = input.nextInt();
                if (answer == 2) {
                    System.out.println("Верно");
                } else {
                    System.out.println("Вы мертвы");
                    break;
                }

                System.out.println("Третья загадка");
                answer = input.nextInt();
                if (answer == 3) {
                    System.out.println("Верно");
                } else {
                    System.out.println("Вы мертвы");
                    break;
                }
                break;
        }
    }
}

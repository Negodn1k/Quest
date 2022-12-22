package chapters;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondChapter extends FirstChapter {
    static int answer;
    static boolean deathCheck = true;

    public static void go() {
        try {
            FileWriter writer = new FileWriter("Second chapter save.txt");
            Scanner input = new Scanner(System.in);
            while (deathCheck) {
                int number = getRandom();
                switch (number) {
                    case 9:
                        System.out.println("Первая загадка");
                        answer = input.nextInt();
                        if (answer == 1) {
                            System.out.println("Верно");
                            deathCheck = false;
                            writer.write("Вторая глава. Ответ на загадку верный");
                            writer.close();
                        } else {
                            System.out.println("Вы мертвы");
                            writer.write("Ответ неверный");
                        }
                        break;
                    case 4:
                        System.out.println("Вторая загадка");
                        answer = input.nextInt();
                        if (answer == 2) {
                            System.out.println("Верно");
                            deathCheck = false;
                            writer.write("Вторая глава. Ответ на загадку верный");
                            writer.close();
                        } else {
                            System.out.println("Вы мертвы");
                            writer.write("Ответ неверный");
                        }
                        break;
                    case 1:
                        System.out.println("Третья загадка");
                        answer = input.nextInt();
                        if (answer == 3) {
                            System.out.println("Верно");
                            deathCheck = false;
                            writer.write("Вторая глава. Ответ на загадку верный");
                            writer.close();
                        } else {
                            System.out.println("Вы мертвы");
                            writer.write("Ответ неверный");
                        }
                        break;
                    default:
                        System.out.println("Первая загадка");
                        answer = input.nextInt();
                        if (answer == 1) {
                            System.out.println("Верно");
                            writer.write("Вторая глава. Ответ на первую загадку верный");
                        } else {
                            System.out.println("Вы мертвы");
                            writer.write("Ответ неверный");
                            break;
                        }

                        System.out.println("Вторая загадка");
                        answer = input.nextInt();
                        if (answer == 2) {
                            System.out.println("Верно");
                            writer.write("Вторая глава. Ответ на вторую загадку верный");
                        } else {
                            System.out.println("Вы мертвы");
                            writer.write("Ответ неверный");
                            break;
                        }

                        System.out.println("Третья загадка");
                        answer = input.nextInt();
                        if (answer == 3) {
                            System.out.println("Верно");
                            deathCheck = false;
                            writer.write("Вторая глава. Ответ на третью загадку верный");
                            writer.close();
                        } else {
                            System.out.println("Вы мертвы");
                            writer.write("Ответ неверный");
                            break;
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

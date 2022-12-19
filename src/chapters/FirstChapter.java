package chapters;

import systems.Randomize;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FirstChapter extends Randomize {
    static int firstChoice;
    static int secondChoice;
    static boolean firstChoiceCheck = true;        //Проверка правильности выбора для зацикливания выбора, при неправильном выборе цикл повторится
    static boolean secondChoiceCheck = true;

    public static void go() {
        try {
            FileWriter writer = new FileWriter("Save.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("");                             //Начало сюжета

            System.out.println("1. Ержан проснулся\n2. Ержан упал с кровати\n3. Ержан умер во сне");
            while (firstChoiceCheck) {
                firstChoice = input.nextInt();
                switch (firstChoice) {
                    case (1):
                        System.out.println("1");                //Развитие сюжета после первой развилки(Первый выбор)
                        firstChoiceCheck = false;
                        writer.write("Первый выбор:");
                        while (secondChoiceCheck) {
                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (1):
                                    System.out.println("1");        // Развитие сюжета после второй развилки(первый выбор)
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор");
                                    writer.close();
                                    break;
                                case (2):
                                    System.out.println("2");        // Развитие сюжета после второй развилки(второй выбор)
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор");
                                    writer.close();
                                    break;
                                default:
                                    System.out.println("Такой выбор не возможен! Повторите попытку");
                                    secondChoiceCheck = true;
                                    writer.write("Ошибка выбора");
                                    break;
                            }
                        }
                        break;
                    case (2):
                        System.out.println("2");                // Развитие сюжета после первой развилки(второй выбор)
                        firstChoiceCheck = false;
                        writer.write("Первый выбор:");
                        while (secondChoiceCheck) {
                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (1):
                                    System.out.println("1");        // Развитие сюжета после второй развилки(первый выбор)
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор");
                                    writer.close();
                                    break;
                                case (2):
                                    System.out.println("2");        // Развитие сюжета после второй развилки(Второй выбор)
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор");
                                    writer.close();
                                    break;
                                default:
                                    System.out.println("Такой выбор не возможен! Повторите попытку");
                                    secondChoiceCheck = true;
                                    writer.write("Ошибка выбора");
                                    break;
                            }
                        }
                        break;
                    case (3):
                        System.out.println("3");                // Развитие сюжета после первой развилки(третий выбор)
                        firstChoiceCheck = false;
                        writer.write("Первый выбор:");
                        writer.close();
                        break;
                    default:
                        System.out.println("Такой выбор не возможен! Повторите попытку");
                        writer.write("Ошибка выбора");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
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
            FileWriter writer = new FileWriter("First chapter saveSave.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("\n899 год н. э.. Деревушка Штейгер. Главный герой этой истории был Ержан," +
                    " обычный парень из небогатой семьи. " +
                    "\nНедавно в наследство от умершей матери ему досталась земля и изба." +
                    "\nРодственников у него больше не было, а друзей было немного." +
                    "\nУтром он проснулся, протер глаза и поднялся с печи, в которой уже давно погас огонь." +
                    "\nОн сходил на улицу умыться, как вдруг услышал звук цокающих копыт за спиной.\n " +
                    "\n–Этого мне ещё не хватало...\n " +
                    "\nКогда он обернулся, то увидел как с нему скачет поборник в сопровождении кавалерии." +
                    "\nПоборник остановил скакуна, слез с него и подходит к главному герою.\n" +
                    "\nПриветствую Ержан. Полагаю вы догадываетесь зачем мы пожаловали к вам.\n" +
                    "\n–К сожалению догадываюсь...\n" +
                    "\n–Тогда надеюсь наши мысли сходятся и вы сделаете всё как надо." +
                    "\n В противном случае вас ждёт жестокое наказание.\n");                             //Начало сюжета

            while (firstChoiceCheck) {
                System.out.println("1. Заплатить\n2. Убежать\n3. Не платить");
                firstChoice = input.nextInt();
                switch (firstChoice) {
                    case (1):
                        System.out.println("\nЕржан заплатил поборнику, но у него больше нет денег." +
                                "\nИх надо было заработать, поэтому он пошёл в лес за грибами.");                //Развитие сюжета после первой развилки(Первый выбор)
                        firstChoiceCheck = false;
                        writer.write("Первая глава.\nПервый выбор: Заплатить\n");
                        System.out.println("Приходя через лес, он через какое то время нашёл среди деревьев раненого волка." +
                                "\nЕржан подходит к нему и говорит.\n" +
                                "\n–Что же с тобой стало зверь…" +
                                "\nОн думал как ему быть.\n" +
                                "\n1. Помочь\n2. Убить");
                        while (secondChoiceCheck) {
                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (1):
                                    System.out.println("\nЕржан выливает ему в пасть флягу воды." +
                                            "\nВолк убегает в глубь леса");
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Помочь");
                                    writer.close();
                                    System.out.println("Ержан продолжил идти по лесу, ноу него начала болеть голова." +
                                            "\nОт этого он потерял сознание и упал на землю.\n \n \n");
                                    break;
                                case (2):
                                    System.out.println("\nЕржан берёт нож с пояса и убивает волка.");        // Развитие сюжета после второй развилки(второй выбор)

                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Убить");
                                    writer.close();

                                    System.out.println("Ержан продолжил идти по лесу, ноу него начала болеть голова." +
                                            "\nОт этого он потерял сознание и упал на землю.\n \n \n");
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
                        System.out.println("\nЕржан убежал так быстро как мог в лес, не видя куда именно." +
                                "\nПоборник и кавалерия остались позади и не смогли пройти в лес из за большого количества деревьев." +
                                "\nЕржан скрылся в лесу.\n");                // Развитие сюжета после первой развилки(второй выбор)

                        firstChoiceCheck = false;
                        writer.write("Первый выбор: Убежать");

                        System.out.println("\nПриходя через лес, он через какое то время нашёл среди деревьев раненого волка." +
                                "\nЕржан подходит к нему и говорит.\n" +
                                "\n–Что же с тобой стало зверь…" +
                                "\nОн думал как ему быть.\n" +
                                "\n1. Помочь\n2. Убить");

                        while (secondChoiceCheck) {
                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (1):
                                    System.out.println("\nЕржан выливает ему в пасть флягу воды." +
                                            "\nВолк убегает в глубь леса");        // Развитие сюжета после второй развилки(первый выбор)
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Помочь");
                                    writer.close();

                                    System.out.println("Ержан продолжил идти по лесу, ноу него начала болеть голова." +
                                            "\nОт этого он потерял сознание и упал на землю.\n \n \n");
                                    break;
                                case (2):
                                    System.out.println("\nЕржан берёт нож с пояса и убивает волка.");                    // Развитие сюжета после второй развилки(Второй выбор)

                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Убить");
                                    writer.close();

                                    System.out.println("Ержан продолжил идти по лесу, ноу него начала болеть голова." +
                                            "\nОт этого он потерял сознание и упал на землю.\n \n \n");
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
                        System.out.println("\nЕржан не заплатил и поэтому поборник приказал кавелирии арестовать его.\n" +
                                "Ержан умер в темнице." +
                                "\n\nПовторите попытку");                // Развитие сюжета после первой развилки(третий выбор)
                        writer.write("Первый выбор: Не платить");
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
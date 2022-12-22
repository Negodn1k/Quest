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
            System.out.println("""

                    899 год н. э.. Деревушка Штейгер. Главный герой этой истории был Ержан, обычный парень из небогатой семьи.\s
                    Недавно в наследство от умершей матери ему досталась земля и изба.
                    Родственников у него больше не было, а друзей было немного.
                    Утром он проснулся, протер глаза и поднялся с печи, в которой уже давно погас огонь.
                    Он сходил на улицу умыться, как вдруг услышал звук цокающих копыт за спиной.
                    \s
                    –Этого мне ещё не хватало...
                    \s
                    Когда он обернулся, то увидел как с нему скачет поборник в сопровождении кавалерии.
                    Поборник остановил скакуна, слез с него и подходит к главному герою.

                    Приветствую Ержан. Полагаю вы догадываетесь зачем мы пожаловали к вам.

                    –К сожалению догадываюсь...

                    –Тогда надеюсь наши мысли сходятся и вы сделаете всё как надо.
                     В противном случае вас ждёт жестокое наказание.
                    """);                             //Начало сюжета

            while (firstChoiceCheck) {
                System.out.println("1. Заплатить\n2. Убежать\n3. Не платить");
                firstChoice = input.nextInt();
                switch (firstChoice) {
                    case (1):
                        System.out.println("""

                                Ержан заплатил поборнику, но у него больше нет денег.
                                Их надо было заработать, поэтому он пошёл в лес за грибами.""");                //Развитие сюжета после первой развилки(Первый выбор)
                        firstChoiceCheck = false;
                        writer.write("Первая глава.\nПервый выбор: Заплатить\n");
                        System.out.println("""
                                Приходя через лес, он через какое то время нашёл среди деревьев раненого волка.
                                Ержан подходит к нему и говорит.

                                –Что же с тобой стало зверь…
                                Он думал как ему быть.

                                1. Помочь
                                2. Убить""");
                        while (secondChoiceCheck) {
                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (1):
                                    System.out.println("""

                                            Ержан выливает ему в пасть флягу воды.
                                            Волк убегает в глубь леса""");
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Помочь");
                                    writer.close();
                                    System.out.println("""
                                            Ержан продолжил идти по лесу, ноу него начала болеть голова.
                                            От этого он потерял сознание и упал на землю.
                                            \s
                                            \s
                                            """);
                                    break;
                                case (2):
                                    System.out.println("\nЕржан берёт нож с пояса и убивает волка.");        // Развитие сюжета после второй развилки(второй выбор)

                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Убить");
                                    writer.close();

                                    System.out.println("""
                                            Ержан продолжил идти по лесу, ноу него начала болеть голова.
                                            От этого он потерял сознание и упал на землю.
                                            \s
                                            \s
                                            """);
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
                        System.out.println("""

                                Ержан убежал так быстро как мог в лес, не видя куда именно.
                                Поборник и кавалерия остались позади и не смогли пройти в лес из за большого количества деревьев.
                                Ержан скрылся в лесу.
                                """);                // Развитие сюжета после первой развилки(второй выбор)

                        firstChoiceCheck = false;
                        writer.write("Первый выбор: Убежать");

                        System.out.println("""

                                Приходя через лес, он через какое то время нашёл среди деревьев раненого волка.
                                Ержан подходит к нему и говорит.

                                –Что же с тобой стало зверь…
                                Он думал как ему быть.

                                1. Помочь
                                2. Убить""");

                        while (secondChoiceCheck) {
                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (1):
                                    System.out.println("""

                                            Ержан выливает ему в пасть флягу воды.
                                            Волк убегает в глубь леса""");        // Развитие сюжета после второй развилки(первый выбор)
                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Помочь");
                                    writer.close();

                                    System.out.println("""
                                            Ержан продолжил идти по лесу, ноу него начала болеть голова.
                                            От этого он потерял сознание и упал на землю.
                                            \s
                                            \s
                                            """);
                                    break;
                                case (2):
                                    System.out.println("\nЕржан берёт нож с пояса и убивает волка.");                    // Развитие сюжета после второй развилки(Второй выбор)

                                    secondChoiceCheck = false;
                                    writer.write("Второй выбор: Убить");
                                    writer.close();

                                    System.out.println("""
                                            Ержан продолжил идти по лесу, ноу него начала болеть голова.
                                            От этого он потерял сознание и упал на землю.
                                            \s
                                            \s
                                            """);
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
                        System.out.println("""

                                Ержан не заплатил и поэтому поборник приказал кавелирии арестовать его.
                                Ержан умер в темнице.

                                Повторите попытку""");                // Развитие сюжета после первой развилки(третий выбор)
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
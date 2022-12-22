package chapters;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FinalChapter extends SecondChapter {
    static int firstChoice;
    static int secondChoice;
    static boolean endingItem;
    static boolean firstChoiceCheck = true;        //Проверка правильности выбора для зацикливания выбора, при неправильном выборе цикл повторится
    static boolean secondChoiceCheck = true;

    public static void go() {
        try {
            FileWriter writer = new FileWriter("Third chapter Save.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("""
                    Оставшись под впечатлением, Ержан пошёл дальше уже по тропинке,\s
                    в начале которой был указатель с надписью "Город Лирия".
                    Ержан очень хотел есть и поэтому побыстрее зашагал к городу.
                    Спустя какое то время он среди деревьев увидел очертания города.
                    Ержан ускорил шаг и уже был у открытых ворот Лирии.
                    Он остановился у указателя на развилке.
                    """);

            while (firstChoiceCheck) {
                System.out.println("\n1. Спросить дорогу у стражников\n2. Пойти корчму\n3. Пойти на рынок");
                firstChoice = input.nextInt();
                switch (firstChoice) {
                    case (2):
                        System.out.println("""

                                Ержан пошёл в корчму по указателю и через какое то время оказался на месте.
                                Когда он вошёл туда, то услышал красивую музыку, весёлую обстановку и запах вкусных бургеров и шаурмы""");                //Развитие сюжета после первой развилки(Первый выбор)

                        firstChoiceCheck = false;
                        writer.write("Третья глава \nПервый выбор: Пойти в корчму");

                        while (secondChoiceCheck) {
                            System.out.println("\n1. Шаурма\n2. Бургер\n");

                            secondChoice = input.nextInt();
                            switch (secondChoice) {
                                case (2):
                                    System.out.println("""
                                            Ержан заказал бургер. Ему его приготовили и он принялся его поглощать.
                                            Почувствовав вкус бургера, Ержан проснулся в холодной темнице и рядом никого не было.
                                            Так и закончилась история""");        // Развитие сюжета после второй развилки(первый выбор)

                                    secondChoiceCheck = false;
                                    writer.write("\nВторой выбор: Бургер");
                                    writer.close();
                                    break;
                                case (1):
                                    System.out.println("""
                                            Он заказал шаурму. Ему её приготовили и он принялся её поглощать.
                                            Почувствовав вкус шаурмы, Ержан проснулся у себя дома и понял что это был всё сон.\s
                                            Он понял что ему нужно побольше работать чтобы было больше денег на все нужды""");        // Развитие сюжета после второй развилки(второй выбор)

                                    secondChoiceCheck = false;
                                    endingItem = true;
                                    writer.write("Второй выбор: Шаурма");
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
                        System.out.println("""
                                Голод взял верх над главным героем и он пошёл на рынок.
                                Там он увидел заведение Аль-шарк, но там был скудный выбор.
                                Были лишь шаурма и бургеры\s""");                // Развитие сюжета после первой развилки(второй выбор)
                        firstChoiceCheck = false;
                        writer.write("Третья глава\nПервый выбор:");

                        while (secondChoiceCheck) {

                            System.out.println("\n1. Шаурма\n2. Бургер\n");
                            secondChoice = input.nextInt();

                            switch (secondChoice) {
                                case (2):
                                    System.out.println("""
                                            Ержан заказал бургер. Ему его приготовили и он принялся его поглощать.
                                            Почувствовав вкус бургера, Ержан проснулся в холодной темнице и рядом никого не было.
                                            Так и закончилась история""");        // Развитие сюжета после второй развилки(первый выбор)

                                    secondChoiceCheck = false;
                                    writer.write("\nВторой выбор: Бургер");
                                    writer.close();
                                    break;
                                case (1):
                                    System.out.println("""
                                            Он заказал шаурму. Ему её приготовили и он принялся её поглощать.
                                            Почувствовав вкус шаурмы, Ержан проснулся у себя дома и понял что это был всё сон.\s
                                            Он понял что ему нужно побольше работать чтобы было больше денег на все нужды""");        // Развитие сюжета после второй развилки(второй выбор)

                                    secondChoiceCheck = false;
                                    endingItem = true;
                                    writer.write("Второй выбор: Шаурма");
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
                    case (1):
                        System.out.println("""
                                Ержан не стал доверять указателю и решил спросить дорогу у стражников.
                                Но как только он подошёл к ним, они тут же спросили его имя и не зная такого,
                                увели его с собой для разбирательств, но это ничего не дало.
                                Ержан так и сгнил в темнице...""");                // Развитие сюжета после первой развилки(третий выбор)

                        firstChoiceCheck = false;
                        writer.write("Третья глава\nПервый выбор: Спросить дорогу у стражников");
                        writer.close();
                        break;
                    default:
                        System.out.println("Такой выбор не возможен! Повторите попытку");

                        writer.write("\nОшибка выбора");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


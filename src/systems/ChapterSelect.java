package systems;

import chapters.FirstChapter;
import chapters.SecondChapter;
import chapters.FinalChapter;

import java.util.Scanner;

public class ChapterSelect extends FinalChapter {
    static String selectNum;

    public static void go(){
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите главу: \n1. Первая глава \n2. Вторая глава \n3. Финальная глава");
        selectNum = input.next();

        switch (selectNum) {
            case ("1"):
                FirstChapter.go();
                SecondChapter.go();
                FinalChapter.go();
                break;
            case ("2"):
                SecondChapter.go();
                FinalChapter.go();
                break;
            case ("3"):
                FinalChapter.go();
                break;
        }
    }
}

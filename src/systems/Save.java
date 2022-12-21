package systems;

import chapters.FinalChapter;
import chapters.FirstChapter;
import chapters.SecondChapter;
import chapters.ThirdChapter;

import java.util.Scanner;

public class Save extends FinalChapter {
    static String keyWord;

    public static void go(){
        Scanner input = new Scanner(System.in);
        keyWord = input.next();

        switch (keyWord) {
            case ("1"):
                FirstChapter.go();
                break;
            case ("2"):
                SecondChapter.go();
                break;
            case ("3"):
                ThirdChapter.go();
                break;
            case ("4"):
                FinalChapter.go();
                break;
        }
    }
}

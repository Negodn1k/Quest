package chapters;

import java.io.FileWriter;
import java.io.IOException;

public class FinalChapter extends ThirdChapter {
    public static void go() {
        try {
            FileWriter writer = new FileWriter("Final chapter save.txt");
            if (endingItem) {
                System.out.println();
                writer.write("Good ending");
            } else {
                System.out.println("Bad ending");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

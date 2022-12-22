package chapters;

import java.io.FileWriter;
import java.io.IOException;

public class FinalChapter extends ThirdChapter {
    public static void go() {
        try {
            FileWriter writer = new FileWriter("Final chapter save.txt");
            if (endingItem) {
                System.out.println("Good ending");
                writer.write("Good ending");
                writer.close();
            } else {
                System.out.println("Bad ending");
                writer.write("Bad ending");
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

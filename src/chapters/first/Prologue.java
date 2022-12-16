package chapters.first;

import java.util.Scanner;

public class Prologue {
    int firstChoice;
    int secondChoice;
    boolean firstChoiceCheck = true;
    boolean secondChoiceCheck = true;

    public void beginning() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println();

        firstChoice = input.nextInt();
        while (firstChoiceCheck) {
            switch (firstChoice) {
                case (1):
                    System.out.println("1");
                    firstChoiceCheck = false;
                    switch (secondChoice) {
                        case (1):
                            System.out.println("1");
                            secondChoiceCheck = true;
                            break;
                        case (2):
                            System.out.println("2");
                            secondChoiceCheck = true;
                            break;
                    }
                    break;
                case (2):
                    System.out.println("2");
                    firstChoiceCheck = false;
                    switch (secondChoice) {
                        case (1):
                            System.out.println("1");
                            secondChoiceCheck = true;
                            break;
                        case (2):
                            System.out.println("2");
                            secondChoiceCheck = true;
                            break;
                    }
                    break;
                case (3):
                    System.out.println("3");
                    firstChoiceCheck = false;
                    break;
            }
        }
    }
}

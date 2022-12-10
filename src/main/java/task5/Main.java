package task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.nextInt() != (1 | 2)) {
            showQuestion();
            if (scan.nextInt() == 1) {

            }

        }
    }

    private static void showQuestion() {
        System.out.println("What animal?\n1 - Cat?\n2 - Dog?\nAny-key - Exit");
    }



}
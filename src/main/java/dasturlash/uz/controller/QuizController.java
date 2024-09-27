package dasturlash.uz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class QuizController {
    @Autowired
    private Scanner scannerText;
    @Autowired
    private Scanner scannerNumber;
    @Autowired
    private Scanner scannerWord;

    public void start(){

        while (true) {
            show();
            switch (getAction()) {
                case 1:
                   // quiz();
                    break;
                case 2:
                   // insertWord();
                    break;
                case 3:
                  //  allWords();
                    break;
                case 0:
                    exit();
                    break;


            }

        }

    }
    private void show() {
        System.out.println("***      Menu      ***");
        System.out.println("1. Multiple choice");
        System.out.println("2. Insert Word");
        System.out.println("3. Update word");
        System.out.println("4. Delete word");
        System.out.println("5. Words List");
        System.out.println("0. Exit");

        System.out.println("Enter action");
    }

    private int getAction() {
        return scannerNumber.nextInt();
    }

    private void exit() {
        System.out.println("Your action has been completed. Thank you");
        System.exit(0);
    }

    private void insertWord(){

    }

}

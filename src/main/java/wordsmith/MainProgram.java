package wordsmith;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        EnglishToHindi transHindi = new EnglishToHindi();
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("       WELCOME to the simple Hindi Translator App            ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        boolean quit = false;

        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Please select an option from below.");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1) Learn a simple phrase in hindi");
            System.out.println("2) Animal names");
            System.out.println("3) Numbers");
            System.out.println("4) Colors");
            System.out.println("5) Quit");
            System.out.println();
            System.out.print("Enter choice [1-5]: ");

            int user_select = s.nextInt();
            if (user_select == 1) {
                System.out.println(transHindi.learnWord());
            }

            else if(user_select == 2){

                    String wordEntered;
                    System.out.println("Enter a animal name");
                    System.out.println("-------------------------------");
                    wordEntered = s.next();

                    System.out.println(transHindi.animalTranslate(wordEntered));
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println();
                }

            else if(user_select == 3){

                int numEntered;
                System.out.println("Enter a number between 1-10");
                System.out.println("-------------------------------");
                numEntered = s.nextInt();

                System.out.println(transHindi.numberTranslate(numEntered));
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println();
            }

            else if(user_select == 4){

                String colorEntered;
                System.out.println("Enter a color name");
                System.out.println("-------------------------------");
                colorEntered = s.next();

                System.out.println(transHindi.colorTranslate(colorEntered));
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println();
            }

            else if(user_select == 5){
                quit = true;
                System.out.println("Good Bye!");
                break;
            }

        }while (!quit);







  //==========================================================
    }
}

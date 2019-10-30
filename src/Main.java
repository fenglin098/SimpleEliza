import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good day. What is your problem? Enter your response here or Q to to quit: ");
        boolean badMood=true;
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().toLowerCase();
        if (!userInput.equals("I am feeling great")){
            System.out.println(userInput+"\n>>>END");
        }else if (userInput.equals("q")){
            System.out.println(">>>END");
        }else{
            System.out.println(userInput);
        }
    }

}



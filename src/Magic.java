import java.util.Scanner;

public class Magic {

    public static void main(String[]args){
        //declare
        Scanner apex;
        int value;
        String question;

        //initialize
        apex = new Scanner(System.in);

        System.out.println("Welcome to Magic8Ball. What is your question?");
        question = apex.nextLine();
        System.out.println("Please enter a number between 1 and 100.");
        value = apex.nextInt();

        //statements
        if(value<10){
            System.out.println("As I see it, yes.");
        }
        else if(value<20){
            System.out.println("Outlook is not so good.");
        }
        else if(value<30){
            System.out.println("Reply hazy. Try again later.");
        }
        else if(value<40){
            System.out.println("Without a doubt.");
        }
        else if(value<50){
            System.out.println("You may rely on it.");
        }
        else if(value<60){
            System.out.println("Odds aren't good.");
        }
        else if(value<70){
            System.out.println("Signs point to yes.");
        }
        else if(value<80){
            System.out.println("Cannot predict now.");
        }
        else if(value<90){
            System.out.println("Don't count on it.");
        }
        else if(value<101){
            System.out.println("My reply is no.");
        }









    }
}

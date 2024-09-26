import java.util.Scanner;

public class App {
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //prompts user for input
        System.out.println("Enter a word to be reversed: ");
        String input = scan.nextLine();

        //reverses the sting and prints results
        String output = reverse(input);
        System.out.println("Your word reversed is: " + output);

        scan.close();

 }
}
/**
 * Wrapper class for Scanner, creating the inputUser object allows for easier input from user.
 */
import java.util.Scanner;
public class inputUser
{
    private static Scanner input;

    public inputUser()
    {
        input = new Scanner(System.in);
    }

    public String stringFromUser(String question)
    {
        input = new Scanner(System.in); //clearing the buffer to receive strings if a int or else was asked before.
        System.out.println(question);
        String user_string = input.nextLine();

        return user_string;
    }
    public int intFromUser(String question)
    {
        System.out.println(question);
        int user_int = input.nextInt();
        return user_int;
    }
    public double doubleFromUser(String question)
    {
        System.out.println(question);
        double user_double = input.nextDouble();
        return user_double;
    }
}
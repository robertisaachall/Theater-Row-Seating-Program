/**
 * Tester programs for the theaterTickets.java class. Prompts user for purchasing tickets, inquiring about tickets, and lets user stop program.
 */
public class theaterTicketsTester
{
    public static void main(String[] args)
    {
        theaterTickets tickets = new theaterTickets();
        inputUser userInput = new inputUser();
        

        int input = 0;
        do
        {
            System.out.println();
            tickets.display();
            System.out.println();
            System.out.println("Welcome to the ticket machine where you can buy tickets for the show! Here are your options: ");
            System.out.println("1. Purchase by row and seat number.");
            System.out.println("2. Inquire about select spots by price");
            System.out.println("3. Quit");
            try
            {
                input = userInput.intFromUser("Please enter your answer");
            }catch(Exception e)
            {
                System.out.println("Please enter a number not a string!!! Restart the program!");
                return;
            }
            if(input == 1)
            {
                boolean purchased = false;
                do
                {
                    System.out.println();
                    int row = userInput.intFromUser("Please enter the row to purchase!");
                    int seat = userInput.intFromUser("Please enter the seat to purchase!");
                    purchased = tickets.selectSeat(row, seat);
                }while(purchased == false);
                
            }
            else if (input == 2)
            {
                boolean avaliableAtPrice = false;
                do
                {
                    System.out.println();
                    int price = userInput.intFromUser("Please eneter the price to see if there are any seats avaliable");
                    avaliableAtPrice = tickets.selectSeatByPrice(price);
                }while(avaliableAtPrice == false);
            }
            else if(input == 3)
            {
                System.out.println();
                System.out.println("Thank you for purchasing tickets. Be Safe!");
                System.out.println("Here are the remaining tickets: ");
                System.out.println();
                tickets.display();

                System.out.println();
                
            }
            else if(input == 4)
            {
                System.out.println("Invalid input! Try another value, the ones avaliable are: 1 , 2 , and 3 .");
            }
            else
            {
                System.out.println("Please enter numbers : 1 , 2 or 3.");
            }


        }while(input != 3);



    }


}
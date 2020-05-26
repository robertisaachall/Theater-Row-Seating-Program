/**
 * Required for lab 10. Holds a 2-d integer array with ticket prices. User can use functions to purchase, or inquiry about seats.
 */
public class theaterTickets
{
    int[][] seatingChart;

    public theaterTickets()
    {
        this.seatingChart = new int[9][10];
        for(int i = 0; i < 10; i++)
        {
            seatingChart[0][i] = 10;
            seatingChart[1][i] = 10;  //first three rows.
            seatingChart[2][i] = 10;
        }
        for(int i = 0; i < 10; i++)
        {
            if(i >= 2 && i <= 7)
            {
                seatingChart[3][i] = 20;
                seatingChart[4][i] = 20;
                seatingChart[5][i] = 20; //next three rows.
            }
            else
            {
                seatingChart[3][i] = 10;
                seatingChart[4][i] = 10; //same three rows.
                seatingChart[5][i] = 10;
            }
        }
        seatingChart[6][0] = 20;
        seatingChart[6][1] = 20;
        seatingChart[6][2] = 30;
        seatingChart[6][3] = 30; //very sloppy
        seatingChart[6][4] = 40;
        seatingChart[6][5] = 40;
        seatingChart[6][6] = 30;
        seatingChart[6][7] = 30;
        seatingChart[6][8] = 20;
        seatingChart[6][9] = 20;

        seatingChart[7][0] = 20;
        seatingChart[7][1] = 30;
        seatingChart[7][2] = 30;
        seatingChart[7][3] = 40;
        seatingChart[7][4] = 50;
        seatingChart[7][5] = 50;
        seatingChart[7][6] = 40;
        seatingChart[7][7] = 30;
        seatingChart[7][8] = 30;
        seatingChart[7][9] = 20;

        seatingChart[8][0] = 30;
        seatingChart[8][1] = 40;
        seatingChart[8][2] = 50;
        seatingChart[8][3] = 50;
        seatingChart[8][4] = 50;
        seatingChart[8][5] = 50;
        seatingChart[8][6] = 50;
        seatingChart[8][7] = 50;
        seatingChart[8][8] = 40;
        seatingChart[8][9] = 30;
        
    }
    public void display()
    {
        for (int i = 0; i < 9; i++) 
        { 
            for (int j = 0; j < 10; j++) 
            { 
                System.out.print(seatingChart[i][j] + " "); 
            } 
  
            System.out.println(); 
        }
    }

    public boolean selectSeat(int row, int seatNumber)
    {
        if (seatingChart[seatingChart.length - row][seatNumber - 1] != 0)
        {
            System.out.println("Thank you for purchasing row: " + row + " , seat: " + seatNumber + " , at price: " + (seatingChart[seatingChart.length - row][seatNumber - 1]));
            seatingChart[seatingChart.length - row][seatNumber - 1] = 0;
            
            return true;
        }
        else
        {
            System.out.println();
            System.out.println("Seat currently taken, please try another seat.");
            System.out.println();
            return false;
        }
       
    }
    public boolean selectSeatByPrice(int price)
    {
        boolean foundPrice = false;
        for(int i = 0; i < seatingChart.length; i++)
        {
            for(int j = 0; j < seatingChart[i].length; j++)
            {
                if(seatingChart[i][j] == price)
                {
                    
                    System.out.println("Found a seat at price: " + price + ". Seat avaliable: Row " + (seatingChart.length - i) + ", Seat " + (j + 1));
                    foundPrice = true;
                }
                else
                {
                    continue;
                }
            }
        }
        if(foundPrice = false)
        {
            System.out.println();
            System.out.println("Did not find a seat at that price please try again.");
            System.out.println();
            return false;
        }
        else
        {
            return true;
        }
    }


}
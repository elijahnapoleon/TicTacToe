import java.lang.String;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe 
{
    private char [][] board;
    private int full;
    private char w;

    public TicTacToe()
    {
        full = 0;
        w = ' ';
       board = new char[][]{ {32,32,32},
                             {32,32,32},
                             {32,32,32}};
       
    }

    public void ComPlay(int player)
    {
//If a winning move is available, take it.
if(board[0][0] == board[0][1] && board[0][0] == 'X' && player == 1 && rCheck(3) == true) //Top row
{
    System.out.println("Player 1 (computer) chooses position 3");
    Play(3,'x' );
}
else if(board[0][2] == board[0][1] && board[0][2] == 'X' && player == 1 && rCheck(1) == true) //Top row
{
    System.out.println("Player 1 (computer) chooses position 1");
    Play(1,'x' );
}
else if(board[0][0] == board[0][2] && board[0][0] == 'X' && player == 1 && rCheck(2) == true) //Top row
{
    System.out.println("Player 1 (computer) chooses position 2");
    Play(2,'x' );
}
else if(board[1][1] == board[1][0] && board[1][1] == 'X' && player == 1 && rCheck(6) == true) //Middle row
{
    System.out.println("Player 1 (computer) chooses position 6");
    Play(6,'x' );
}
else if(board[1][1] == board[1][2] && board[1][1] == 'X' && player == 1 && rCheck(4) == true) //Middle row 
{
    System.out.println("Player 1 (computer) chooses position 4");
    Play(4,'x' );
}
else if(board[1][0] == board[1][2] && board[1][0] == 'X' && player == 1 && rCheck(5) == true) //Middle row
{
    System.out.println("Player 1 (computer) chooses position 5");
    Play(5,'x' );
}
else if(board[2][1] == board[2][0] && board[2][1] == 'X' && player == 1 && rCheck(9) == true ) //Bottom row
{
    System.out.println("Player 1 (computer) chooses position 9");
    Play(9,'x' );
}
else if(board[2][1] == board[2][2] && board[2][1] == 'X' && player == 1 && rCheck(7) == true) //Bottom row
{
    System.out.println("Player 1 (computer) chooses position 7");
 Play(7,'x' );
}
else if(board[2][0] == board[2][2] && board[2][0] == 'X' && player == 1 && rCheck(8) == true) //Bottom row
{
    System.out.println("Player 1 (computer) chooses position 8");
    Play(8,'x' );
}
else if(board[1][0] == board[0][0] && board[1][0] == 'X' && player == 1 && rCheck(7) == true) //Left column
{
    System.out.println("Player 1 (computer) chooses position 7");
    Play(7,'x' );
}
else if(board[1][0] == board[2][0] && board[1][0] == 'X' && player == 1 && rCheck(1) == true) //Left column
{
    System.out.println("Player 1 (computer) chooses position 1");
    Play(1,'x' );
}
else if(board[0][0] == board[2][0] && board[0][0] == 'X' && player == 1 && rCheck(4) == true) //Left column 
{
    System.out.println("Player 1 (computer) chooses position 4");
    Play(4,'x' );
}
else if(board[1][1] == board[0][1] && board[1][1] == 'X' && player == 1 && rCheck(8) == true) //Middle column
{
    System.out.println("Player 1 (computer) chooses position 8");
    Play(8,'x' );
}
else if(board[1][1] == board[2][1] && board[1][1] == 'X' && player == 1 && rCheck(2) == true) //Middle column
{
    System.out.println("Player 1 (computer) chooses position 2");
    Play(2,'x' );
}
else if(board[0][1] == board[2][1] && board[0][1] == 'X' && player == 1 && rCheck(5) == true) //Middle column
{
    System.out.println("Player 1 (computer) chooses position 5");
    Play(5,'x' );
}
else if(board[1][2] == board[0][2] && board[1][2] == 'X' && player == 1 && rCheck(9) == true) //Right column
{
    System.out.println("Player 1 (computer) chooses position 9");
    Play(9,'x' );
}
else if(board[1][2] == board[2][2] && board[1][2] == 'X' && player == 1 && rCheck(3) == true) //Right column
{
    System.out.println("Player 1 (computer) chooses position 3");
    Play(3,'x' );
}
else if(board[0][2] == board[2][2] && board[0][2] == 'X' && player == 1 && rCheck(6) == true) //Right column
{
    System.out.println("Player 1 (computer) chooses position 6");
    Play(6,'x' );
}
else if(board[1][1] == board[0][0] && board[1][1] == 'X' && player == 1 && rCheck(9) == true) //Diagnol1
{
    System.out.println("Player 1 (computer) chooses position 9");
 Play(9,'x' );
}
else if(board[1][1] == board[2][2] && board[1][1] == 'X' && player == 1 && rCheck(1) == true) //Diagnol1
{
    System.out.println("Player 1 (computer) chooses position 1");
    Play(1,'x' );
}
else if(board[0][0] == board[2][2] && board[0][0] == 'X' && player == 1 && rCheck(5) == true) //Diagnol1
{
    System.out.println("Player 1 (computer) chooses position 5");
 Play(5,'x' );
}
else if(board[1][1] == board[0][2] && board[1][1] == 'X' && player == 1 && rCheck(7) == true) //Diagnol2
{
    System.out.println("Player 1 (computer) chooses position 7");
    Play(7,'x');
}
else if(board[1][1] == board[2][0] && board[1][1] == 'X' && player == 1 && rCheck(3) == true) //Diagnol2
{
    System.out.println("Player 1 (computer) chooses position 3");
    Play(3,'x' );
}
else if(board[0][2] == board[2][0] && board[0][2] == 'X' && player == 1 && rCheck(5) == true) //Diagnol2
{
    System.out.println("Player 1 (computer) chooses position 5");
 Play(5,'x' );
}
if(board[0][0] == board[0][1] && board[0][0] == 'O' && player == 1 && rCheck(3) == true) //Top row
{
    //If the opponent is threatening a winning play, block it. 
    //(Note that if the opponent has two winning plays, only one can be blocked).
    System.out.println("Player 1 (computer) chooses position 3");
    Play(3,'x' );
}
else if(board[0][2] == board[0][1] && board[0][2] == 'O' && player == 1 && rCheck(1) == true) //Top row
{
    System.out.println("Player 1 (computer) chooses position 1");
    Play(1,'x' );
}
else if(board[0][0] == board[0][2] && board[0][0] == 'O' && player == 1 && rCheck(2) == true) //Top row
{
    System.out.println("Player 1 (computer) chooses position 2");
    Play(2,'x' );
}
else if(board[1][1] == board[1][0] && board[1][1] == 'O' && player == 1 && rCheck(6) == true) //Middle row
{
    System.out.println("Player 1 (computer) chooses position 6");
    Play(6,'x' );
}
else if(board[1][1] == board[1][2] && board[1][1] == 'O' && player == 1 && rCheck(4) == true) //Middle row 
{
    System.out.println("Player 1 (computer) chooses position 4");
    Play(4,'x' );
}
else if(board[1][0] == board[1][2] && board[1][0] == 'O' && player == 1 && rCheck(5) == true) //Middle row
{
    System.out.println("Player 1 (computer) chooses position 5");
    Play(5,'x' );
}
else if(board[2][1] == board[2][0] && board[2][1] == 'O' && player == 1 && rCheck(9) == true ) //Bottom row
{
    System.out.println("Player 1 (computer) chooses position 9");
    Play(9,'x' );
}
else if(board[2][1] == board[2][2] && board[2][1] == 'O' && player == 1 && rCheck(7) == true) //Bottom row
{
    System.out.println("Player 1 (computer) chooses position 7");
 Play(7,'x' );
}
else if(board[2][0] == board[2][2] && board[2][0] == 'O' && player == 1 && rCheck(8) == true) //Bottom row
{
    System.out.println("Player 1 (computer) chooses position 8");
    Play(8,'x' );
}
else if(board[1][0] == board[0][0] && board[1][0] == 'O' && player == 1 && rCheck(7) == true) //Left column
{
    System.out.println("Player 1 (computer) chooses position 7");
    Play(7,'x' );
}
else if(board[1][0] == board[2][0] && board[1][0] == 'O' && player == 1 && rCheck(1) == true) //Left column
{
    System.out.println("Player 1 (computer) chooses position 1");
    Play(1,'x' );
}
else if(board[0][0] == board[2][0] && board[0][0] == 'O' && player == 1 && rCheck(4) == true) //Left column
{
    System.out.println("Player 1 (computer) chooses position 4");
    Play(4,'x' );
}
else if(board[1][1] == board[0][1] && board[1][1] == 'O' && player == 1 && rCheck(8) == true) //Middle column
{
    System.out.println("Player 1 (computer) chooses position 8");
    Play(8,'x' );
}
else if(board[1][1] == board[2][1] && board[1][1] == 'O' && player == 1 && rCheck(2) == true) //Middle column
{
    System.out.println("Player 1 (computer) chooses position 2");
    Play(2,'x' );
}
else if(board[0][1] == board[2][1] && board[0][1] == 'O' && player == 1 && rCheck(5) == true) //Middle column
{
    System.out.println("Player 1 (computer) chooses position 5");
    Play(5,'x' );
}
else if(board[1][2] == board[0][2] && board[1][2] == 'O' && player == 1 && rCheck(9) == true) //Right column
{
    System.out.println("Player 1 (computer) chooses position 9");
    Play(9,'x' );
}
else if(board[1][2] == board[2][2] && board[1][2] == 'O' && player == 1 && rCheck(3) == true) //Right column
{
    System.out.println("Player 1 (computer) chooses position 3");
    Play(3,'x' );
}
else if(board[0][2] == board[2][2] && board[0][2] == 'O' && player == 1 && rCheck(6) == true) //Right column
{
    System.out.println("Player 1 (computer) chooses position 6");
    Play(6,'x' );
}
else if(board[1][1] == board[0][0] && board[1][1] == 'O' && player == 1 && rCheck(9) == true) //Diagnol1
{
    System.out.println("Player 1 (computer) chooses position 9");
 Play(9,'x' );
}
else if(board[1][1] == board[2][2] && board[1][1] == 'O' && player == 1 && rCheck(1) == true) //Diagnol1
{
    System.out.println("Player 1 (computer) chooses position 1");
    Play(1,'x' );
}
else if(board[0][0] == board[2][2] && board[0][0] == 'O' && player == 1 && rCheck(5) == true) //Diagnol1
{
    System.out.println("Player 1 (computer) chooses position 5");
 Play(5,'x' );
}
else if(board[1][1] == board[0][2] && board[1][1] == 'O' && player == 1 && rCheck(7) == true) //Diagnol2
{
    System.out.println("Player 1 (computer) chooses position 7");
    Play(7,'x');
}
else if(board[1][1] == board[2][0] && board[1][1] == 'O' && player == 1 && rCheck(3) == true) //Diagnol2
{
    System.out.println("Player 1 (computer) chooses position 3");
    Play(3,'x' );
}
else if(board[0][2] == board[2][0] && board[0][2] == 'O' && player == 1 && rCheck(5) == true) //Diagnol2
{
    System.out.println("Player 1 (computer) chooses position 5");
 Play(5,'x' );
}
else if(rCheck(5) && player == 1) //If the center square is available, take it
{
    System.out.println("Player 1 (computer) chooses position 5");
    Play(5,'x' );
}
 else if (player == 1) //Else choose randomly between any remaining squares
{
    
 Random ran = new Random();
 int k = 5;
 while(!rCheck(k))
 {
k = ran.nextInt(9- 1 + 1) + 1;
 }
 System.out.println("Player 1 (computer) chooses position " + k);
 Play(k, 'x');
}

//If a winning move is available, take it.
if(board[0][0] == board[0][1] && board[0][0] == 'O' && player == 2 && rCheck(3) == true) //Top row
{
    System.out.println("Player 2 (computer) chooses position 3");
    Play(3,'o' );
}
else if(board[0][2] == board[0][1] && board[0][2] == 'O' && player == 2 && rCheck(1) == true) //Top row
{
    System.out.println("Player 2 (computer) chooses position 1");
    Play(1,'o' );
}
else if(board[0][0] == board[0][2] && board[0][0] == 'O' && player == 2 && rCheck(2) == true) //Top row
{
    System.out.println("Player 2 (computer) chooses position 2");
    Play(2,'o' );
}
else if(board[1][1] == board[1][0] && board[1][1] == 'O' && player == 2 && rCheck(6) == true) //Middle row
{
    System.out.println("Player 2 (computer) chooses position 6");
    Play(6,'o' );
}
else if(board[1][1] == board[1][2] && board[1][1] == 'O' && player == 2 && rCheck(4) == true) //Middle row
{
    System.out.println("Player 2 (computer) chooses position 4");
    Play(4,'o' );
}
else if(board[1][0] == board[1][2] && board[1][0] == 'O' && player == 2 && rCheck(5) == true) //Middle row
{
    System.out.println("Player 2 (computer) chooses position 5");
    Play(5,'o' );
}
else if(board[2][1] == board[2][0] && board[2][1] == 'O' && player == 2 && rCheck(9) == true ) //Bottom row
{
    System.out.println("Player 2 (computer) chooses position 9");
    Play(9,'o' );
}
else if(board[2][1] == board[2][2] && board[2][1] == 'O' && player == 2 && rCheck(7) == true) //Bottom row
{
    System.out.println("Player 2 (computer) chooses position 7");
 Play(7,'o' );
}
else if(board[2][0] == board[2][2] && board[2][0] == 'O' && player == 2 && rCheck(8) == true) //Bottom row
{
    System.out.println("Player 2 (computer) chooses position 8");
    Play(8,'o' );
}
else if(board[1][0] == board[0][0] && board[1][0] == 'O' && player == 2 && rCheck(7) == true) //Left column
{
    System.out.println("Player 2 (computer) chooses position 7");
    Play(7,'o' );
}
else if(board[1][0] == board[2][0] && board[1][0] == 'O' && player == 2 && rCheck(1) == true) //Left column
{
    System.out.println("Player 2 (computer) chooses position 1");
    Play(1,'o' );
}
else if(board[0][0] == board[2][0] && board[0][0] == 'O' && player == 2 && rCheck(4) == true) //Left column
{
    System.out.println("Player 2 (computer) chooses position 4");
    Play(4,'o' );
}
else if(board[1][1] == board[0][1] && board[1][1] == 'O' && player == 2 && rCheck(8) == true) //Middle column
{
    System.out.println("Player 2 (computer) chooses position 8");
    Play(8,'o' );
}
else if(board[1][1] == board[2][1] && board[1][1] == 'O' && player == 2 && rCheck(2) == true) //Middle column
{
    System.out.println("Player 2 (computer) chooses position 2");
    Play(2,'o' );
}
else if(board[0][1] == board[2][1] && board[0][1] == 'O' && player == 2 && rCheck(5) == true) //Middle column
{
    System.out.println("Player 2 (computer) chooses position 5");
    Play(5,'o' );
}
else if(board[1][2] == board[0][2] && board[1][2] == 'O' && player == 2 && rCheck(9) == true) //Right column
{
    System.out.println("Player 2 (computer) chooses position 9");
    Play(9,'o' );
}
else if(board[1][2] == board[2][2] && board[1][2] == 'O' && player == 2 && rCheck(3) == true) //Right column
{
    System.out.println("Player 2 (computer) chooses position 3");
    Play(3,'o' );
}
else if(board[0][2] == board[2][2] && board[0][2] == 'O' && player == 2 && rCheck(6) == true) //Right column
{
    System.out.println("Player 2 (computer) chooses position 6");
    Play(6,'o' );
}
else if(board[1][1] == board[0][0] && board[1][1] == 'O' && player == 2 && rCheck(9) == true) //Diagnol1
{
    System.out.println("Player 2 (computer) chooses position 9");
 Play(9,'o' );
}
else if(board[1][1] == board[2][2] && board[1][1] == 'O' && player == 2 && rCheck(1) == true) //Diagnol1
{
    System.out.println("Player 2 (computer) chooses position 1");
    Play(1,'o' );
}
else if(board[0][0] == board[2][2] && board[0][0] == 'O' && player == 2 && rCheck(5) == true) //Diagnol1
{
    System.out.println("Player 2 (computer) chooses position 5");
 Play(5,'o' );
}
else if(board[1][1] == board[0][2] && board[1][1] == 'O' && player == 2 && rCheck(7) == true) //Diagnol2
{
    System.out.println("Player 2 (computer) chooses position 7");
    Play(7,'o');
}
else if(board[1][1] == board[2][0] && board[1][1] == 'O' && player == 2 && rCheck(3) == true) //Diagnol2
{
    System.out.println("Player 2 (computer) chooses position 3");
    Play(3,'o' );
}
else if(board[0][2] == board[2][0] && board[0][2] == 'O' && player == 2 && rCheck(5) == true) //Diagnol2
{
    System.out.println("Player 2 (computer) chooses position 5");
 Play(5,'o' );
}
else if(board[0][0] == board[0][1] && board[0][0] == 'X' && player == 2 && rCheck(3) == true) //Top row
{
    System.out.println("Player 2 (computer) chooses position 3");
    Play(3,'o' );
}
else if(board[0][2] == board[0][1] && board[0][2] == 'X' && player == 2 && rCheck(1) == true) //Top row
{
    System.out.println("Player 2 (computer) chooses position 1");
    Play(1,'o' );
}
else if(board[0][0] == board[0][2] && board[0][0] == 'X' && player == 2 && rCheck(2) == true) //Top row
{
    System.out.println("Player 2 (computer) chooses position 2");
    Play(2,'o' );
}
else if(board[1][1] == board[1][0] && board[1][1] == 'X' && player == 2 && rCheck(6) == true) //Middle row
{
    System.out.println("Player 2 (computer) chooses position 6");
    Play(6,'o' );
}
else if(board[1][1] == board[1][2] && board[1][1] == 'X' && player == 2 && rCheck(4) == true) //Middle row
{
    System.out.println("Player 2 (computer) chooses position 4");
    Play(4,'o' );
}
else if(board[1][0] == board[1][2] && board[1][0] == 'X' && player == 2 && rCheck(5) == true) //Middle row
{
    System.out.println("Player 2 (computer) chooses position 5");
    Play(5,'o' );
}
else if(board[2][1] == board[2][0] && board[2][1] == 'X' && player == 2 && rCheck(9) == true ) //Bottom row
{
    System.out.println("Player 2 (computer) chooses position 9");
    Play(9,'o' );
}
else if(board[2][1] == board[2][2] && board[2][1] == 'X' && player == 2 && rCheck(7) == true) //Bottom row
{
    System.out.println("Player 2 (computer) chooses position 7");
 Play(7,'o' );
}
else if(board[2][0] == board[2][2] && board[2][0] == 'X' && player == 2 && rCheck(8) == true) //Bottom row
{
    System.out.println("Player 2 (computer) chooses position 8");
    Play(8,'o' );
}
else if(board[1][0] == board[0][0] && board[1][0] == 'X' && player == 2 && rCheck(7) == true) //Left column
{
    System.out.println("Player 2 (computer) chooses position 7");
    Play(7,'o' );
}
else if(board[1][0] == board[2][0] && board[1][0] == 'X' && player == 2 && rCheck(1) == true) //Left column
{
    System.out.println("Player 2 (computer) chooses position 1");
    Play(1,'o' );
}
else if(board[0][0] == board[2][0] && board[0][0] == 'X' && player == 2 && rCheck(4) == true) //Left column
{
    System.out.println("Player 2 (computer) chooses position 4");
    Play(4,'o' );
}
else if(board[1][1] == board[0][1] && board[1][1] == 'X' && player == 2 && rCheck(8) == true) //Middle column
{
    System.out.println("Player 2 (computer) chooses position 8");
    Play(8,'o' );
}
else if(board[1][1] == board[2][1] && board[1][1] == 'X' && player == 2 && rCheck(2) == true) //Middle column
{
    System.out.println("Player 2 (computer) chooses position 2");
    Play(2,'o' );
}
else if(board[0][1] == board[2][1] && board[0][1] == 'X' && player == 2 && rCheck(5) == true) //Middle column
{
    System.out.println("Player 2 (computer) chooses position 5");
    Play(5,'o' );
}
else if(board[1][2] == board[0][2] && board[1][2] == 'X' && player == 2 && rCheck(9) == true) //Right column
{
    System.out.println("Player 2 (computer) chooses position 9");
    Play(9,'o' );
}
else if(board[1][2] == board[2][2] && board[1][2] == 'X' && player == 2 && rCheck(3) == true) //Right column
{
    System.out.println("Player 2 (computer) chooses position 3");
    Play(3,'o' );
}
else if(board[0][2] == board[2][2] && board[0][2] == 'X' && player == 2 && rCheck(6) == true) //Right column
{
    System.out.println("Player 2 (computer) chooses position 6");
    Play(6,'o' );
}
else if(board[1][1] == board[0][0] && board[1][1] == 'X' && player == 2 && rCheck(9) == true) //Diagnol1
{
    System.out.println("Player 2 (computer) chooses position 9");
 Play(9,'o' );
}
else if(board[1][1] == board[2][2] && board[1][1] == 'X' && player == 2 && rCheck(1) == true) //Diagnol1
{
    System.out.println("Player 2 (computer) chooses position 1");
    Play(1,'o' );
}
else if(board[0][0] == board[2][2] && board[0][0] == 'X' && player == 2 && rCheck(5) == true) //Diagnol1
{
    System.out.println("Player 2 (computer) chooses position 5");
 Play(5,'o' );
}
else if(board[1][1] == board[0][2] && board[1][1] == 'X' && player == 2 && rCheck(7) == true) //Diagnol2
{
    System.out.println("Player 2 (computer) chooses position 7");
    Play(7,'o');
}
else if(board[1][1] == board[2][0] && board[1][1] == 'X' && player == 2 && rCheck(3) == true) //Diagnol2
{
    System.out.println("Player 2 (computer) chooses position 3");
    Play(3,'o' );
}
else if(board[0][2] == board[2][0] && board[0][2] == 'X' && player == 2 && rCheck(5) == true) //Diagnol2
{
    System.out.println("Player 2 (computer) chooses position 5");
 Play(5,'o' );
}
else if(rCheck(5) == true && player == 2) //If the center square is available, take it
{
    System.out.println("Player 2 (computer) chooses position 5");
    Play(5,'o' );
}
else if(player == 2) //Else choose randomly between any remaining squares
{
 Random ran = new Random();
 int k = 5;
 while(!rCheck(k))
 {
k = ran.nextInt(9- 1 + 1) + 1;
 }
 System.out.println("Player 2 (computer) chooses position " + k);
 Play(k, 'o');
}
}


    public boolean rCheck(int n)
    {
if(GetAtPos(n)!=' ')
{
    return false;
}
else
{
    return true;
}
    }

    public char GetAtPos(int k)
    {
if(k == 1)
{
    return board[0][0];
}
if(k == 2)
{
    return board[0][1];
}
if(k == 3)
{
    return board[0][2];
}
if(k==4)
{
    return board[1][0];
}
if(k==5)
{
    return board[1][1];
}
if(k==6)
{
    return board[1][2];
}
if(k == 7)
{
    return board[2][0];
}
if(k==8)
{
    return board[2][1];
}
if(k==9)
{
    return board[2][2];
}
return board[0][0];

    }

   public int GetFull()
    {
        return full;
    }

    public char GetW()
    {
        return w;
    }

   public void print() 
   {
System.out.println("Game Board:           Postions:");
System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "             1 | 2 | 3" );
System.out.println("-----------           -----------");
System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "             4 | 5 | 6" );
System.out.println("-----------           -----------");
System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "             7 | 8 | 9" );
    }

public void Play(int n, char c) //Put X or O on the board
    {
if(n == 1 && c == 'x')
{
    board[0][0] = 'X';
}
if(n == 2 && c == 'x')
{
    board[0][1] = 'X';
}
if(n == 3 && c == 'x')
{
    board[0][2] = 'X';
}
if(n == 4 && c == 'x')
{
    board[1][0] = 'X';
}
if(n == 5 && c == 'x')
{
    board[1][1] = 'X';
}
if(n == 6 && c == 'x')
{
    board[1][2] = 'X';
}
if(n == 7 && c == 'x')
{
    board[2][0] = 'X';
}
if(n == 8 && c == 'x')
{
    board[2][1] = 'X';
}
if(n == 9 && c == 'x')
{
    board[2][2] = 'X';
}
if(n == 1 && c == 'o')
{
    board[0][0] = 'O';
}
if(n == 2 && c == 'o')
{
    board[0][1] = 'O';
}
if(n == 3 && c == 'o')
{
    board[0][2] = 'O';
}
if(n == 4 && c == 'o')
{
    board[1][0] = 'O';
}
if(n == 5 && c == 'o')
{
    board[1][1] = 'O';
}
if(n == 6 && c == 'o')
{
    board[1][2] = 'O';
}
if(n == 7 && c == 'o')
{
    board[2][0] = 'O';
}
if(n == 8 && c == 'o')
{
    board[2][1] = 'O';
}
if(n == 9 && c == 'o')
{
    board[2][2] = 'O';
}
full++;
    }

   public boolean Win()
    {
        if(board[0][0] == board[0][1] && board[0][2] == board[0][1] && board[0][0] != ' ') //top row
        {
            w = board[0][0];
return true;
        }
        if(board[1][0] == board[1][1] && board[1][2] == board[1][1] && board[1][0] != ' ') //middle row
        {
            w = board[1][0];
return true;
        }
        if(board[2][0] == board[2][1] && board[2][2] == board[2][1] && board[2][0] != ' ') //bottom row
        {
            w = board[2][0];
return true;
        }
        if(board[0][0] == board[1][0] && board[2][0] == board[1][0] && board[1][0] != ' ') //left column
        {
            w = board[0][0];
return true;
        }
        if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') //middle column
        {
            w = board[0][1];
return true;
        }
        if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ') //right column
        {
            w = board[0][2];
return true;
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') //diagnol1
        {
            w = board[0][0];
return true;
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') //diagnol2
        {
            w = board[0][2];
return true;
        }
return false;
    }

  
  public boolean Check(int k) //Function for error checking
    {
       if(k < 1 || k > 9)
       {
        System.out.println("Enter a move(1-9)");
        return false;
       }

        if(k == 1 && board[0][0] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 2 && board[0][1] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 3 && board[0][2] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 4 && board[1][0] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 5 && board[1][1] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 6 && board[1][2] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 7 && board[2][0] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 8 && board[2][1] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
        if(k == 9 && board[2][2] != ' ')
       {
        System.out.println("Position already filled");
        return false;
       }
       return true;
    }



   public static void main(String[] args)
   {

if(args.length == 1 && !args[0].equals("-c"))
{
System.out.println("Usage: java TicTacToe [-c [1|2]]");
System.exit(0);
}
if(args.length == 2 && !args[1].equals("1") && !args[1].equals("2"))
{
    System.out.println("Usage: java TicTacToe [-c [1|2]]");
    System.exit(0);
}

    Scanner s = new Scanner(System.in);
TicTacToe t = new TicTacToe();


if(args.length == 2)
{
if(args[0].equals("-c") && args[1].equals("1"))
{
    t.print();

while(!t.Win() && t.GetFull()!= 9)
{
  t.ComPlay(1);
  t.print();

  if(!t.Win() && t.GetFull()!=9)
  {
     System.out.println("Player 2, please enter a move (1-9):");
  int k = s.nextInt();
  while(!t.Check(k))
  {
    k = s.nextInt();
  }
  t.Play(k,'o');
  t.print();
}
}
}
else if(args[0].equals("-c") && args[1].equals("2"))
{
while(!t.Win() && t.GetFull()!= 9)
{
    t.print();
    System.out.println("Player 1, please enter a move (1-9):");
    int k = s.nextInt();
    while(!t.Check(k))
    {
        k = s.nextInt();
    }
    t.Play(k,'x');
    t.print();
    
    if(!t.Win() && t.GetFull()!= 9)
    {
        t.ComPlay(2);
        t.print();
    }
}
}
}
else if(args.length == 1 && args[0].equals("-c"))
{
    t.print();

    while(!t.Win() && t.GetFull()!= 9)
    {
         if(!t.Win() && t.GetFull()!=9)
         {
        t.ComPlay(1);
        t.print();
         }

        if(!t.Win() && t.GetFull()!=9)
        {
            t.ComPlay(2);
            t.print();
        }
    }
}
else
{
    t.print();

while(!t.Win() && t.GetFull()!=9)
{

System.out.println("Player 1, please enter a move (1-9):");

int k = s.nextInt();

while(!t.Check(k))
{
    k = s.nextInt();
}

t.Play(k, 'x');

t.print();

if(!t.Win() && t.GetFull()!=9)
{
System.out.println("Player 2, please enter a move (1-9):");

int o = s.nextInt();

while(!t.Check(o))
{
    o = s.nextInt();
}

t.Play(o, 'o');

t.print();
}
}
}

if(t.GetW() == 'X')
{
    System.out.println("Player 1 has won");
}

if(t.GetW() == 'O')
{
    System.out.println("Player 2 has won");
}

if(!t.Win())
{
System.out.println("Draw");
}


s.close();




}
}

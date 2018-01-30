import java.util.Arrays;
import java.util.Scanner;

public class lu_dylan{

	static char[][] board = new char[3][3];
	static char player1Piece;
	static char player2Piece;
	static Scanner sc = new Scanner(System.in);
	static int row;
	static int column;
	static boolean player1sTurn = true;
	static char winner;
	static String border = "|--------|";
	static int moveCounter = 1;
	
	public static void main(String args[]){
		
		
		System.out.println("Would you like to be X or O?");
		char tempPiece = sc.next().trim().charAt(0);
		
		if(tempPiece == 'X' || tempPiece == 'x'){
			player1Piece = 'X';
			player2Piece = 'O';
		} else {
			player1Piece = 'O';
			player2Piece = 'X';
		}
		
		
		updateBoard(); //Showing the empty board to the player
		while(!hasSomeoneWon() && moveCounter < 10){ //Loop until a player gets 3 in a row or the board is full.
			placeTurn();
			moveCounter++;
		}
		if(moveCounter > 9){
			System.out.print("Draw! Well that was a waste of time.");
		} else {
			if(!player1sTurn){
				System.out.print("YAY! The winner is player 1 with \"" + winner + "\" Congratulations!");
			} else {
				System.out.print("YAY! The winner is player 2 with \"" + winner + "\" Congratulations!");
			}
		}
		sc.close();
	}

	static public void placeTurn(){
		if(player1sTurn){
			System.out.println("Player 1's turn. You are " + player1Piece);
		} else {
			System.out.println("Player 2's turn. You are " + player2Piece);
		}
		do {
			System.out.println("Where would you like to place your piece?");
			System.out.println("Please enter a row position from 1-3.");
			row = sc.nextInt()-1;
			System.out.println("Please enter a column position from 1-3.");
			column = sc.nextInt()-1;
		} while (!validMove(row, column));
		
		if(player1sTurn){
				
			board[row][column] = player1Piece;
				
		} else {
				
			board[row][column] = player2Piece;
				
		}
		if(player1sTurn){ //Switch turn after each move
			player1sTurn = false;
		} else {
			player1sTurn = true;
		}
		
		updateBoard();
	}
	
	public static boolean isItFree(int row, int column){
		
		if(board[row][column] == 0){
			return true;
		}
		
		return false;
		
	}
	
	public static boolean hasSomeoneWon(){
		
		if((board[0][0] == ('X') && board[0][1] == ('X') && board[0][2] == ('X')) || (board[0][0] == ('X') && board[1][1] == ('X') && board[2][2] == ('X')) || (board[0][0] == ('X') && board[1][0] == ('X') && board[2][0] == ('X')) || (board[1][0] == ('X') && board[1][1] == ('X') && board[1][2] == ('X')) || (board[0][1] == ('X') && board[1][1] == ('X') && board[2][1] == ('X')) || (board[0][2] == ('X') && board[1][2] == ('X') && board[2][2] == ('X')) || (board[0][2] == ('X') && board[1][1] == ('X') && board[2][0] == ('X')) || (board[2][0] == ('X') && board[2][1] == ('X') && board[2][2] == ('X'))){
			winner = 'X';
			return true;
		} else if((board[0][0] == ('O') && board[0][1] == ('O') && board[0][2] == ('O')) || (board[0][0] == ('O') && board[1][1] == ('O') && board[2][2] == ('O')) || (board[0][0] == ('O') && board[1][0] == ('O') && board[2][0] == ('O')) || (board[1][0] == ('O') && board[1][1] == ('O') && board[1][2] == ('O')) || (board[0][1] == ('O') && board[1][1] == ('O') && board[2][1] == ('O')) || (board[0][2] == ('O') && board[1][2] == ('O') && board[2][2] == ('O')) || (board[0][2] == ('O') && board[1][1] == ('O') && board[2][0] == ('O')) || (board[2][0] == ('O') && board[2][1] == ('O') && board[2][2] == ('O'))){
			winner = 'O';
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public static void updateBoard(){
		System.out.println(border);
		for (char[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }
		System.out.println(border);
		
	}
	
	public static boolean validMove(int row, int column){
		if((column >= 0 && column <= 2) && (row >= 0 && row <= 2) && isItFree(row, column)){
			return true;	
		} else {
			System.out.println("ERROR! Out of game bounds or the space is occupied. Remeber the board is a 3x3. A row is left to right and a column is top to bottom.");
			return false;
		}	

	}
	
	
}

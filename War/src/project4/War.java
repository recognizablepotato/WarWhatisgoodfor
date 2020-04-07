package project4;

import java.util.Scanner;



public class War {
/**
 * Program Calls method from Card1 and generates Player and Computers card as a new object.
 * Calls deal method to Print out the cards. Then Calls Compared method to compare the cards and tells 
 * who won the game. Updates the score count for Computer, Player, or Tie. Asks if you would like to play again.
 * if yes plays again.If any letter but yes it closes with a statement on who won the game of war.
 * 
 * 1 Declare local variables
 * 2 generate and new object of Class Card
 * 3 print class and project title along with developers name
 * 4 Ask user for there name
 * 5 read users name
 * 6 print user name and tell user you are going to war
 * 7 print shuffle shuffle shuffle
 * 8 call deal card method
 * 9 call compare card method in switch statement while evaluating the Count of wins
 * 10 Switch cases add up 1 for player if they win and 1 for computer if he wins or 1 to tie, and if Ace of Spades they get double
 * 11 print out the winning amounts per player, computer, and tie
 * 12 ask player if they would like to play again
 * 13 scan answer in keyboard
 * 14 evaluate the answer with a while boolean expression for a lower case y or Uppercase Y rerun the Do statement if other proceed to out to next line of code
 * 15 Evaluates if while statement is not reactivated with any letter no equal to a lowercase or uppercase y
 * 16 if statement evaluating if tie was greater that computer count and player count
 * 17 Print statement regarding tie count win if it is the greatest count
 * 18 if statement evaluating if player count is higher than computer count
 * 19 if Player count is high than computer count print statement that pertains to the player count winning
 * 20 if statement evaluating if computer count is high than player count
 * 21 if Computer count is high than computer count print statement that pertains to the computer count winning
 * @author Brandi Lauria
 * @Version 3/18/2017
 * @param args
 */
	public static void main(String[] args) {
		//Local Variable Declared
		String YesorNo;
		int PlayerWinsCount= 0;
		int ComputerWinsCount = 0;
		int TieCount = 0;
		int DoublePlayerWinsCount = 0;
		int DoubleComputerWinsCount =0;
		//Do This Code while the while statement is true
		do{
			//generates Class object
		Card1 PlayersCard;
		PlayersCard = new Card1();
		String NameofPlayer;
		
		//Keyboard Scanner for Player name input
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		// System define class ask for name and output name and prompt user for War
		System.out.println("COP2551: Project 4 - Brandi Lauria");
		System.out.print("What is your name? ");
		NameofPlayer = keyboard.next();
		System.out.println();
		System.out.println("Okay "+ NameofPlayer + ", let's go to War! ");
		System.out.println();
		//print line for shuffle
		System.out.println("Here we go <shuffle> <shuffle> <shuffle>");
		//deal players card and computers
		PlayersCard.dealCard();
		
		//Compare players card and computers also does a count for wins
				switch (PlayersCard.compareCards()){
				case -1: ComputerWinsCount++;
				break;
				case 1: PlayerWinsCount++;
				break;
				case 0: TieCount++;
				break;
				case 2: DoublePlayerWinsCount= DoublePlayerWinsCount + 2;
				break;
				case -2: DoubleComputerWinsCount=DoubleComputerWinsCount + 2;
				break;
				
		}
				//prints out count for who is winning also updates
				System.out.println("\tThe score is: Computer " + (ComputerWinsCount+DoubleComputerWinsCount) + " " + NameofPlayer+ " "+ (PlayerWinsCount+DoublePlayerWinsCount) + " Ties " + TieCount );
		//ask user if they would like to play again
				System.out.println("Want to play again (Y/N)?");
		YesorNo = keyboard.next();
	}
		//evaluates players input from keyboard if they would like to play again
	while (YesorNo.toUpperCase().equals("Y"));
		//if they wouldn't like to play again the following code is read
		if (!YesorNo.toUpperCase().equals("Y"));
		if(TieCount > ComputerWinsCount && TieCount > PlayerWinsCount)// if they have a larger amount of ties print the following
		System.out.println("Thanks for playing War. We both live to fight another day!");
		if(ComputerWinsCount<PlayerWinsCount)//if the Computer has a larger amount of wins print the following
			System.out.println("Thanks for playing War. You won the war, but I'll get you next time!");
		if(ComputerWinsCount>PlayerWinsCount)//if the Player has a larger amount of wins print the following
			System.out.println("Thanks for playing War. I accept your surrender, Ah ha ha ha!");
	}

}


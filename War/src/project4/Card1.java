package project4;
import java.util.Random;
public class Card1 
	{
	/**
	 * This class does the work for the War Class. The program has a constructor that sets a card to the two of clubs. Void DealCard Method generates two cards with
	 * the random generator so they are completely different (and they are sent to the War class to be printed so the player can see the cards generated) deal card has
	 * the print out of the cards as well. Compare Card method Compares the cards values in and suit values to determine the winner with if statements and prints if statement
	 * that applies also all returns have a value returned (for war class counters). Get suit rank method gets the integer value of the card. Get card rank gets the integer value of the
	 * suit via deal card method. getSuitName has a switch statement to retrieve the name of the suit. get RankName has a switch statement to retrieve the name of the Rank.
	 *   To string method lets us get a string for print out in deal card of "rank of suit". Boolean expression evaluates the suit name and rank name to tell if they equal card.
	 *   
	 * 1 Declare variables used private type
	 * 2 Method for constructor - card suit initialized at 1(Clubs), card rank initialized at 2 (Duce)
	 * 3 Method deal card card suit redefined as suit and card rank redefined as rank
	 * 4 constructing a pseudorandum generator for dealing card1 with card suit set to 1-4
	 * 5 constructing a pseudorandum generator for dealing card1 with card suit set to 2-13
	 * 6 print out the random generated number from to string method
	 * 7constructing a pseudorandum generator for dealing card2 with card suit set to 1-4
	 * 8 constructing a pseudorandum generator for dealing card2 with card suit set to 2-13
	 * 9 print out the random generated number from to string method
	 * 10 method compare card with if statements to compare the cards
	 * 11 if statement when someone has an ace of spades and gets double
	 * 12 if statement if player wins with higher card return 1 print message of player win
	 * 13 if statement if computer wins with higher card return -1 print message of computers win
	 * 14 if statement if tie card return 0 print tie statement
	 * 15 get suit card integer value from generator
	 * 16 get rank of card integer value from generator
	 * 17 get suit name from get method with a switch statement to match integer value to each suit value avaliable
	 * 18 get rank name from get method with a switch statement evaluates integer value to each rank value name avaliable.
	 * 19 to string method gets the Suit name and Rank name puts it to a statement of "Rank of Suit"
	 * 20 Boolean expression evaluates if suit name and rank name match variables of suitname and rankname. 
	 * 
	 */
	//Variable Declared
		private int cardSuit;
		private int cardRank;
		private int suit;
		private int rank;
		private String RankName;
		private String SuitName;
		private int playerCardSuit;
		private int playerCardRank;
		private int computerCardSuit;
		private int computerCardRank;

		//Constructor
		public Card1()
		{ 	cardSuit = 1;
			cardRank = 2;
			
		}
			
			//SetTryAgain selects a randomized value between 1 and 4 for suit and between 2 and 14 for rank.	
			public void dealCard() {
				// TODO Auto-generated method stub
				cardSuit = suit;
				cardRank = rank;
				
				
				Random generator = new Random();
				cardSuit = (generator.nextInt(4)+1);
				cardRank = (2)+(int)(Math.random()*13);
				//Random generator for Player card
				playerCardSuit = cardSuit;
				playerCardRank = cardRank;
				//print the line of players card
				System.out.println("\tYour card is the " + toString());
				//Random generator for Computer Card
				Random generator1 = new Random();
				cardSuit = (generator1.nextInt(4)+1);
				cardRank = (2)+(int)(Math.random()*13);
				//print the line of computers card
				computerCardSuit = cardSuit;
				computerCardRank = cardRank;
				System.out.println("\tMy card is the " + toString());
				return;
				
			}
			//Compare Cards method 
			public int compareCards(){
//if statement identifying a double win for computer return -2
				{if(computerCardRank == 14 && computerCardSuit == 4){
					
					System.out.println("\tThe computer wins double!");
				return -2;}
				//if statement identifying a double win for player return 2
				if(playerCardRank == 14 && playerCardSuit == 4){
					
					System.out.println("\tYou win double!");
				return 2;}
				//if statement identifying a win for computer return 1
				if (computerCardRank > playerCardRank){
					
					System.out.println("\tThe computer wins!");
				return -1;}
				//if statement identifying a win for player return 1
				if (computerCardRank < playerCardRank){
					
					System.out.println("\tYou win!");
				return 1;}
				//if statement identifying a win for computer return 1
				if (computerCardRank == playerCardRank && computerCardSuit>playerCardSuit){
					
					System.out.println("\tThe computer win!");
					return -1;}		
				//if statement identifying a win for player return 1
				if (computerCardRank == playerCardRank &&  computerCardSuit < playerCardSuit){
					
					System.out.println("\tYou win!");
					return 1;}
						//if statement identifying a tie win
				if (computerCardRank == playerCardRank &&computerCardSuit == playerCardSuit){
					
						 System.out.println("\tIt's a tie, nobody wins.");
				return 0;
				}
				}
				return 0;}
			//gets suit rank
			int getSuitRank(){
				return cardSuit;}
			// gets the cards  rank
			int getCardRank(){return cardRank;}
			//gets the SuitName
			public String getSuitName()
			 {
				switch (cardSuit){
				case 1: SuitName = "Clubs";
				break;
				case 2: SuitName = "Diamonds";
				break;
				case 3: SuitName = "Hearts";
				break;
				case 4: SuitName = "Spades";
				break;
				}
				return SuitName;}
			//gets the RankName
			public String getRankName()
			{
				switch (cardRank){
			case 2: RankName = "Duce";
			break;
			case 3: RankName = "Three";
			break;
			case 4: RankName= "Four";
			break;
			case 5: RankName= "Five";
			break;
			case 6: RankName= "Six";
			break;
			case 7: RankName = "Seven";
			break;
			case 8: RankName = "Eight";
			break;
			case 9: RankName = "Nine";
			break;
			case 10: RankName = "Ten";
			break;
			case 11: RankName= "Jack";
			break;
			case 12: RankName= "Queen";
			break;
			case 13: RankName = "King";
			break;
			case 14: RankName = "Ace";
			break;
			}return(RankName);}
		//The to String for output of player and computer card in dealcard
			public String toString()
			{
			return (getRankName() +" of " + getSuitName());	
				}
			// boolean expressions to evaluate suit and rank name equals
public boolean isThisCard(String RankName, String SuitName){
	boolean correct;
		if ((getRankName()) == SuitName && (getSuitName())==RankName)
		return correct = true;
		else
			return correct = false;}}
			

import java.util.*;
public class Player {
	private String name1;
	private int chips1;
	private int bet;
	private ArrayList<Card> oneRoundCard;
	private int addAll;
	public Player(String name, int chips) {
	name1= name;
	chips1= chips;
	}	
	public String getName() {
	return name1;
	}
	public int makeBet() {
		if (chips1<=0) {
		return 0;
		//"NO money, can't bet";
		}
		bet=bet*1;
		chips1 =chips1-bet;
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard=cards ;
		addAll = 0;
		for(Card value:oneRoundCard) {
			addAll = addAll + value.getRank();
		}
	}
	public boolean hitMe() {
		
		if(addAll<=16){
			return true;
		}
		else {
			return false;
		}
	}
	public int getTotalValue() {
		return addAll;
	}
	
	public int getCurrentChips() {
		return chips1;
	}
	public void increaseChips (int diff) {
		chips1 = diff + chips1;
	}
	public void sayHello() {
		System.out.println("Hello, I am " + name1 + ".");
	    System.out.println("I have " + chips1 + " chips.");
	}
}


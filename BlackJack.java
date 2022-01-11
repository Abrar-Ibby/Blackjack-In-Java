import java.util.Scanner;

public class BlackJack {
public static void main(String[] args) throws InterruptedException {
int newRound = 1;
int wins = 0;
int losses = 0;
boolean bust = false;

while (newRound==1){
    Deck deck = new Deck();
 Scanner scnr = new Scanner(System.in);
 int houseTotal =  deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
 int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);

 System.out.println("The house is showing " +houseTotal);
 while(playerTotal<22){
System.out.println("Players total is: " + playerTotal);
System.out.println("Would you like to hit or stand? \n\tEnter 1 for hit or 0 for stand");
int choice = scnr.nextInt();
if (choice==0){
       break;   
} else if (choice==1){
    Card nextCard = deck.drawCard();
    Thread.sleep(500);
    System.out.println("The player  has been dealt the " +nextCard.declareCard());
    playerTotal += nextCard.getValue(true);
} else {
System.out.println("Invalid Option Try again.");
}
 }
if (playerTotal> 21) {
    System.out.println("The player has " + playerTotal);
    System.out.println("The player has busted! You lose :(");
    losses +=1;
    bust = true;
} else {

    System.out.println("\nThe player stands with " + playerTotal  );

    System.out.println("The House will play next. \n");
}
while (houseTotal < 17){
    System.out.println("The house has " +houseTotal);
    System.out.println("The house takes another card");
    Thread.sleep(500);
    Card nextHouseCard = deck.drawCard();
    System.out.println("The house has been dealt " +nextHouseCard.declareCard());
houseTotal += nextHouseCard.getValue(true);
}
if (bust)
if (houseTotal>=17 && houseTotal<=21){
System.out.println("The House sits with " + houseTotal);
}
System.out.println("");
System.out.println("Game Results");
if (playerTotal> houseTotal && playerTotal<22){
    System.out.println("Congratulations you are the winner!");
    wins +=1;
}
else if (houseTotal> playerTotal && houseTotal <=21){
    System.out.println("The house wins");
    losses += 1;
}
else  if (playerTotal==houseTotal) {
    System.out.println("The result is a tie");
}
else if (houseTotal>=22){
    System.out.println("The House has busted with " +houseTotal);
    System.out.println("Congratulations you are the winner!");
    wins +=1;
}
else if (bust = true){
    System.out.println("You have busted and lost");
}
System.out.println("If you would like to play another round enter 1, if not enter 0");
newRound = scnr.nextInt();
}
System.out.println("The amount of times you won: " + wins);
System.out.println("The amount of times you lost: " + losses);

}
}


public class Deck {
    public Card drawCard(){
    int value = (int)(Math.random() * 13) +1;
    int suitNumber = (int)(Math.random() * 3)+1;
String suit;
if (suitNumber == 1){
    suit="Spades"; 

}
else if (suitNumber == 2){
suit="Clubs";
}
else if (suitNumber==3) {
    suit="Hearts";
}
else {
    suit="Diamonds";
}
        return new Card(value, suit);
    }
}

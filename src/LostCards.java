import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * You once had a nice deck of cards.
 *
 * The cards in the decal had the following values:
 *  Ace = 1
 *  2 = 2
 *  3 = 3
 *  ... etc ...
 *  10 = 10
 *  Jack = 11
 *  Queen = 12
 *  King = 13
 *
 * The symbols for the suits are:
 *
 *  Clubs = ♣
 *  Diamonds = ♢
 *  Hearts = ♡
 *  Spades = ♠
 *
 * Unfortunately you've lost the following cards:
 *  - King of Spades
 *  - All of the 3s except 3 of Diamonds
 *
 * All of the cards that are divisible by 3 and have a suit that is red have been torn.
 *
 * All of the face cards (ace, jack, queen, king) in the hearts and clubs suits have been water damaged.
 *
 * Any card whose value is the same as the number of letters in the card's suit (in plural form) is face down. All other
 * cards are face up. For example, the 6 of Hearts would be face down because "Hearts" is 6 letters long and the value
 * of the card is 6.
 *
 * Your task is to describe your deck of cards:
 *
 * Output the cards in ascending order by value, grouped by suit, in alphabetical order.
 *  - Ace of Clubs, 2 of clubs, 3 of clubs ... etc ... queen of spades, king of spades.
 *
 * For face cards output the first letter of the card. IE: A, J, Q, or K.
 *
 * For 10s output "t".
 *
 * For all other cards output the value of the card. IE: 2, 3, 4...., or 9.
 *
 * Cards in good shape are output like this: [A♢], [9♠], [t♣], etc.
 *
 * Cards that are torn are output like this: -A♢-, -9♠-, -t♣-, etc.
 *
 * Cards that are water damaged are output like this: ~A♢~, ~9♠~, ~t♣~ etc
 *
 * Cards that are torn AND water damaged are output like this: -~A♢~-, -~9♠~-, -~t♣~- etc
 *
 * Cards that are face down are output with asterisks instead of the card's value and suit. For example, [**], -**-, or ~**~.
 *
 * Output one card per line.
 *
 * Lastly, output the number of cards you have in your deck on its own line.
 *
 */
public class LostCards {

    public static void main(String[] args) {

        boolean missingCard = false;

        //create a list of suit values that go from 1 to 4, incrementing
        for (int suitValue = 1; suitValue <= 4; suitValue++) {

            //define suitSymbol as a variable that will represent suit symbol
            String suitSymbol = new String();

            //if suitIdentifier is generated as 1, assign a ♣
            if (suitValue == 1) {
                //assign a ♣
                suitSymbol = "♣";}

            if (suitValue == 2) {
                suitSymbol = "♢";}

            if (suitValue == 3) {
                suitSymbol = "♡";}

            if (suitValue == 4) {
                suitSymbol = "♠";}


            //create a list of card values that go from 1 to 13, incrementing
            for (int cardValue = 1; cardValue <= 13; cardValue++) {
                //creates a string 'cardSymbol' and initializes it
                String cardSymbol = new String();
                //following: assigns cardSymbols to respective integers
                //*this may not work as we move forward into assigning conditions to groups of cards
                if (cardValue == 1) {
                    cardSymbol = "A";
                    System.out.println(cardValue + " of " + suitSymbol);
                    continue;

                } else if (cardValue == 2) {
                    cardSymbol = "2";
                    continue;

                } else if (cardValue == 3) {
                    cardSymbol = "3";
                    continue;

                } else if (cardValue == 4) {
                    cardSymbol = "4";
                    continue;

                } else if (cardValue == 5) {
                    cardSymbol = "5";
                    continue;

                } else if (cardValue == 6) {
                    cardSymbol = "6";
                    continue;

                } else if (cardValue == 7) {
                    cardSymbol = "7";
                    continue;

                } else if (cardValue == 8) {
                    cardSymbol = "8";
                    continue;

                } else if (cardValue == 9) {
                    cardSymbol = "9";
                    continue;

                } else if (cardValue == 10) {
                    cardSymbol = "t";
                    continue;

                } else if (cardValue == 11) {
                    cardSymbol = "J";
                    continue;

                } else if (cardValue == 12) {
                    cardSymbol = "Q";
                    continue;

                } else if (cardValue == 13) {
                    cardSymbol = "K";
                    continue;
                }

                /**
                 * Let's see if we can't use math to denote card condition
                 */


                /*
                 * Make a loop that removes completely King of Spades, 3 of Clubs, 3 of Diamonds, 3 of Hearts.
                 */






            }//for (int cardValue = 1; cardValue <= 13; cardValue++) {

        } //for (int suitIdentifier = 1; suitIdentifier <= 4; suitIdentifier++) {

    } //public static void main(String[] args) {

} //class LostCards {

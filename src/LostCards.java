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

        int cardIterations = 0;

        //create a list of suit values that go from 1 to 4, incrementing
        for (int suitValue = 1; suitValue <= 4; suitValue++) {


            //define suitSymbol as a variable that will represent suit symbol
            String suitSymbol = new String();

            //if suitIdentifier is generated as 1, assign a ♣
            if (suitValue == 1) {
                //assign a ♣
                suitSymbol = "♣";
            } else if (suitValue == 2) {
                suitSymbol = "♢";
            } else if (suitValue == 3) {
                suitSymbol = "♡";
            } else if (suitValue == 4) {
                suitSymbol = "♠";
            }



                //create a list of card values that go from 1 to 13, incrementing
                for (int cardValue = 1; cardValue <= 13; cardValue++) {
                    //creates a string 'cardSymbol' and initializes it
                    String cardSymbol = new String();
                    //following: assigns cardSymbols to respective integers


                    //****this section can be pared down****
                    //use string.valueOf()
                    if (cardValue == 1) {
                        cardSymbol = "A";

                    } else if (cardValue == 2) {
                        cardSymbol = "2";


                    } else if (cardValue == 3) {
                        cardSymbol = "3";

                    } else if (cardValue == 4) {
                        cardSymbol = "4";

                    } else if (cardValue == 5) {
                        cardSymbol = "5";

                    } else if (cardValue == 6) {
                        cardSymbol = "6";

                    } else if (cardValue == 7) {
                        cardSymbol = "7";


                    } else if (cardValue == 8) {
                        cardSymbol = "8";


                    } else if (cardValue == 9) {
                        cardSymbol = "9";


                    } else if (cardValue == 10) {
                        cardSymbol = "t";

                    } else if (cardValue == 11) {
                        cardSymbol = "J";

                    } else if (cardValue == 12) {
                        cardSymbol = "Q";

                    } else if (cardValue == 13) {
                        cardSymbol = "K";
                    }



                    //define booleans so that we can manipulate output of 'outlier' cards
                    //false is default card; true is an outlier card

                    boolean missingCard = false;
                    boolean tornCard = false;
                    boolean waterDamaged = false;
                    boolean faceDown = false;
                    boolean faceCard = false;


                    //these remove missing cards
                    if (cardSymbol.equals("K") && suitSymbol.equals("♠")) {
                        continue;
                    }
                    if (cardSymbol.equals("3") && suitSymbol.equals("♣")) {
                        continue;
                    }
                    if (cardSymbol.equals("3") && suitSymbol.equals("♡")) {
                        continue;
                    }
                    if (cardSymbol.equals("3") && suitSymbol.equals("♠")) {
                        continue;
                    }

                    //Counts how many cards program runs through; beneath the if loops above as they are removed from the deck
                    if (cardIterations < 50){
                        cardIterations++;
                    }

                    //here we determine how many characters are in each suit's word

                    //initialize a new string containing the suit word
                    String clubs = "clubs";
                    //set an integer equal to the suit word string run through a length method
                    int clubsLength = clubs.length();

                    String diamonds = "diamonds";
                    int diamondsLength = diamonds.length();

                    String hearts = "hearts";
                    int heartsLength = hearts.length();

                    String spades = "spades";
                    int spadesLength = spades.length();


                    if (suitSymbol.equals("♣") && cardValue == clubsLength) {
                        faceDown = true;
                    }
                    if (suitSymbol.equals("♢") && cardValue == diamondsLength) {
                        faceDown = true;
                    }
                    if (suitSymbol.equals("♡") && cardValue == heartsLength) {
                        faceDown = true;
                    }
                    if (suitSymbol.equals("♠") && cardValue == spadesLength) {
                        faceDown = true;
                    }
                    if (faceDown != false) {
                        String faceDownCardSuit = "**";

                        if (cardSymbol.equals("A") || cardSymbol.equals("J") || cardSymbol.equals("Q") || cardSymbol.equals("K")) {
                            faceCard = true;
                        }
                        if ((cardValue % 3 == 0) && (suitSymbol.equals("♡") || suitSymbol.equals("♢"))) {
                            tornCard = true;
                        }

                        //if the card is a face card AND its suit is EITHER heart or clubs, then it is water damaged
                        if ((faceCard != false) && (suitSymbol.equals("♡") || suitSymbol.equals("♣"))) {
                            waterDamaged = true;
                        }

                        if (tornCard != false && waterDamaged != false) {
                            System.out.println("-~" + cardSymbol + suitSymbol + "~-");
                        }
                        //then we check if a card is not torn (false) ; it is torn (true), then then it is output as such and the program returns to the start

                        else if (tornCard != false && faceDown != false) {
                            System.out.println("-" + faceDownCardSuit + "-");
                            continue;
                        } else if (tornCard != false) {
                            System.out.println("-" + cardSymbol + suitSymbol + "-");
                            continue;
                        }//now we check if a card is not water damaged (false); it is water damaged (true); program outputs the result if true and returns

                        else if (waterDamaged != false && faceDown != false) {
                            System.out.println("~" + faceDownCardSuit + "~");
                            continue;
                        } else if (waterDamaged != false) {
                            System.out.println("~" + cardSymbol + suitSymbol + "~");
                            continue;
                        }


                        if (missingCard != true && tornCard != true && waterDamaged != true && faceDown != false) {
                            System.out.println("[" + faceDownCardSuit + "]");
                            continue;
                        }
                    }


                    //this checks if a card is a face card (non-numeric)


                    if (cardSymbol.equals("A") || cardSymbol.equals("J") || cardSymbol.equals("Q") || cardSymbol.equals("K")) {
                        faceCard = true;
                    }

                    //this checks if a card is torn by checking if the card is divisible by 3 AND if the suit symbol is EITHER hearts or diamonds
                    if ((cardValue % 3 == 0) && (suitSymbol.equals("♡") || suitSymbol.equals("♢"))) {
                        tornCard = true;
                    }

                    //if the card is a face card AND its suit is EITHER heart or clubs, then it is water damaged
                    if ((faceCard != false) && (suitSymbol.equals("♡") || suitSymbol.equals("♣"))) {
                        waterDamaged = true;
                    }

                    if (tornCard != false && waterDamaged != false) {
                        System.out.println("-~" + cardSymbol + suitSymbol + "~-");
                    }
                    //then we check if a card is not torn (false) ; it is torn (true), then then it is output as such and the program returns to the start

                    else if (tornCard != false) {
                        System.out.println("-" + cardSymbol + suitSymbol + "-");
                        continue;
                    }//now we check if a card is not water damaged (false); it is water damaged (true); program outputs the result if true and returns

                    else if (waterDamaged != false) {
                        System.out.println("~" + cardSymbol + suitSymbol + "~");
                        continue;
                    }


                    if (missingCard != true && tornCard != true && waterDamaged != true) {
                        System.out.println("[" + cardSymbol + suitSymbol + "]");

                    }


                }//for (int cardValue = 1; cardValue <= 13; cardValue++) {


            } //for (int suitIdentifier = 1; suitIdentifier <= 4; suitIdentifier++) {
        System.out.println(cardIterations);
        } //public static void main(String[] args) {

    } //class LostCards {

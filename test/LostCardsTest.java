import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LostCardsTest extends OutputTest {

    @Test
    public void testOutput(){
        LostCards.main(null);

        assertThat(outputStream.toString(), is("~A♣~\n" +
                "[2♣]\n" +
                "[4♣]\n" +
                "[**]\n" +
                "[6♣]\n" +
                "[7♣]\n" +
                "[8♣]\n" +
                "[9♣]\n" +
                "[t♣]\n" +
                "~J♣~\n" +
                "~Q♣~\n" +
                "~K♣~\n" +
                "[A♢]\n" +
                "[2♢]\n" +
                "-3♢-\n" +
                "[4♢]\n" +
                "[5♢]\n" +
                "-6♢-\n" +
                "[7♢]\n" +
                "[**]\n" +
                "-9♢-\n" +
                "[t♢]\n" +
                "[J♢]\n" +
                "-Q♢-\n" +
                "[K♢]\n" +
                "~A♡~\n" +
                "[2♡]\n" +
                "[4♡]\n" +
                "[5♡]\n" +
                "-**-\n" +
                "[7♡]\n" +
                "[8♡]\n" +
                "-9♡-\n" +
                "[t♡]\n" +
                "~J♡~\n" +
                "-~Q♡~-\n" +
                "~K♡~\n" +
                "[A♠]\n" +
                "[2♠]\n" +
                "[4♠]\n" +
                "[5♠]\n" +
                "[**]\n" +
                "[7♠]\n" +
                "[8♠]\n" +
                "[9♠]\n" +
                "[t♠]\n" +
                "[J♠]\n" +
                "[Q♠]\n" +
                "48\n"));
    }
}
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;

public class GuessTheNumberGameTest {

    @Test
    @DisplayName("Deve retornar a mensagem para tentar um número mais alto")

    public void verifyIfGuessIsLow(){
        GuessTheNumberGame.targetNumber = 50;
        HumanPlayer human = Mockito.mock(HumanPlayer.class);
        Mockito.when(human.makeGuess()).thenReturn(10);
        GuessTheNumberGame.checkGuess(human);
        Mockito.verify(human, times(0)).setGuessed(true);
    }

    @Test
    @DisplayName("Deve retornar a mensagem para tentar um número mais baixo")

    public void verifyIfGuessIsHigh(){
        GuessTheNumberGame.targetNumber = 50;
        HumanPlayer human = Mockito.mock(HumanPlayer.class);
        Mockito.when(human.makeGuess()).thenReturn(99);
        GuessTheNumberGame.checkGuess(human);
        Mockito.verify(human, times(0)).setGuessed(true);
    }

    @Test
    @DisplayName("Deve retornar a mensagem que venceu")

    public void verifyIfGuessIsCorrect(){
        GuessTheNumberGame.targetNumber = 50;
        HumanPlayer human = Mockito.mock(HumanPlayer.class);
        Mockito.when(human.makeGuess()).thenReturn(50);
        GuessTheNumberGame.checkGuess(human);
        Mockito.verify(human, times(1)).setGuessed(true);
    }
}

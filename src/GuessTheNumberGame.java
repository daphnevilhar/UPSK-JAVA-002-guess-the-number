import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    static Random random = new Random();
    static int targetNumber = random.nextInt(100) + 1;

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de jogar! Tente adivinhar o número.");
        System.out.println("Mas primeiro digite seu nome:");
        String humanPlayerName = scanner.next();
        Player humanPlayer = new HumanPlayer(humanPlayerName);
        Player computerPlayer = new ComputerPlayer("Computador");

        Player currentPlayer = humanPlayer;

        while (true) {
            checkGuess(currentPlayer);
            if (currentPlayer.hasGuessed()){
                System.out.println("Fim de jogo!");
                System.out.println("O vencedor foi " + currentPlayer.getName() + " e seus palpites foram " + currentPlayer.getGuesses());
                break;
            }

            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
        }
    }

    public static void checkGuess (Player player) {
        int guess = player.makeGuess();

        if (guess > targetNumber) {
            System.out.println("Ainda não é esse, tente um número mais baixo");
        } else if (guess < targetNumber) {
            System.out.println("Ainda não é esse, tente um número mais alto");
        } else {
            player.setGuessed(true);
        }

    }
}

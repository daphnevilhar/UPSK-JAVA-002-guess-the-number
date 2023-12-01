import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Integer makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", qual o seu palpite?");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}

import java.util.Random;

public class ComputerPlayer extends Player{
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public Integer makeGuess() {
        Random random = new Random();
        int guess = random.nextInt(100) + 1;
        System.out.println(name + ", qual o seu palpite?");
        System.out.println(guess);
        guesses.add(guess);
        return guess;

    }
}

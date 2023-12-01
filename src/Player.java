import java.util.ArrayList;
import java.util.List;
public abstract class Player {

    protected String name;
    protected List<Integer> guesses;
    private boolean guessed;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
        this.guessed = false;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }

    public boolean hasGuessed() {
        return guessed;
    }

    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }

    public abstract Integer makeGuess();
}

package game;

public class NumericBet extends Bet {

    private final int playerNumber;

    private final int computerNumber;

    public NumericBet(int playerNumber, int computerNumber, int rewardMultiplayer) {
        super(rewardMultiplayer);
        this.playerNumber = playerNumber;
        this.computerNumber = computerNumber;
    }

    @Override
    public boolean isWinner() {
        return playerNumber == computerNumber;
    }
}

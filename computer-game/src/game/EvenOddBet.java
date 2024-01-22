package game;

public class EvenOddBet extends Bet {

    private final boolean isEven;

    private final int computerNumber;

    public EvenOddBet(boolean isEven, int computerNumber, int rewardMultiplayer) {
        super(rewardMultiplayer);
        this.isEven = isEven;
        this.computerNumber = computerNumber;
    }

    @Override
    public boolean isWinner() {
        if (isEven) {
            return computerNumber % 2 == 0;
        } else {
            return computerNumber % 2 == 1;
        }
    }
}

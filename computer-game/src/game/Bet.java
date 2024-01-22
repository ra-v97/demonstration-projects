package game;

public abstract class Bet {

    private final int rewardMultiplayer;

    public Bet(int rewardMultiplayer) {
        this.rewardMultiplayer = rewardMultiplayer;
    }

    public int calculateReward(int inputMoney) {
        return inputMoney * rewardMultiplayer;
    }

    public int calculateLoss(int inputMoney) {
        return inputMoney;
    }

    public abstract boolean isWinner();
}

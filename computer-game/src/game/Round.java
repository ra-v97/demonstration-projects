package game;

import java.util.Random;
import java.util.Scanner;

public class Round implements GameStage {

    @Override
    public void handleGameStage(Player player) {
        int computerNumber = new Random().nextInt(GuessNumberGame.MIN_NUMBER, GuessNumberGame.MAX_NUMBER);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Za ile grasz: ");
        int moneyToBet = scanner.nextInt();

        System.out.println(" Wybierz rodzaj zakladu: [1] numeryczny, [2] parzysty/nieparzysty: ");
        int betType = scanner.nextInt();

        Bet bet = null;
        if (betType == 1) {
            // Numeric bet
            System.out.println("Podaj swoją liczbe: ");
            int playerNumber = scanner.nextInt();

            bet = new NumericBet(playerNumber, computerNumber, 2);
        } else if (betType == 2) {
            // EvenOdd bet
            System.out.println("Czy obstawiasz liczbe parzysta [Y/N]: ");
            String isEven = scanner.next();

            bet = new EvenOddBet("Y".equals(isEven), computerNumber, 1);
        } else {
            System.out.println("Wybrano nieznany typ zaklad.");
            return;
        }

        System.out.println("Wylosowana przez komputer liczba to: " + computerNumber);
        System.out.println("Gracz zagrał za: " + moneyToBet);

        if (bet.isWinner()) {
            int reward = bet.calculateReward(moneyToBet);
            System.out.println("Wygrana: " + reward);
            player.addMoney(reward);
        } else {
            int loss = bet.calculateLoss(moneyToBet);
            System.out.println("Strata: " + loss);
            player.takeMoney(loss);
        }
    }
}

package game;

import java.util.ArrayList;
import java.util.List;

public class GuessNumberGame {

    public static final int MIN_NUMBER = 0;

    public static final int MAX_NUMBER = 10;

    public void play() {

        Player player = new Player("LuckyPlayer", 100);

        List<GameStage> gameFlow = new ArrayList<>();
        gameFlow.add(new StartGame());
        gameFlow.add(new Round());
        gameFlow.add(new Round());
        gameFlow.add(new StopGame());

        System.out.println("--- Gra zgadnij liczbe ---");
        System.out.println("Celem gry jest wygranie zakladu liczbowego z komputerem");

        for (GameStage gameStage : gameFlow) {
            gameStage.handleGameStage(player);
        }
    }
}

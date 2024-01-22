package game;

public class StopGame implements GameStage{

    @Override
    public void handleGameStage(Player player) {
        System.out.println("Gra skonczona. Stan konta gracza " + player.getName() + " to " + player.getMoney() + "PLN.");
    }
}

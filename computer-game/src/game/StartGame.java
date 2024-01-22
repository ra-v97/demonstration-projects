package game;

public class StartGame implements GameStage{

    @Override
    public void handleGameStage(Player player) {
        System.out.println("Gre rozpoczyna gracz " + player.getName() + " ze stanem konta " + player.getMoney() + "PLN.");
    }
}

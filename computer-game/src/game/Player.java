package game;

public class Player {

    private String name;

    private int money;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int reward) {
        money += reward;
    }

    public void takeMoney(int reward) {
        money -= reward;
    }

    public void showPlayerWallet() {
        System.out.println("Gracz " + name + " ma na koncie " + money + " PLN.");
    }
}

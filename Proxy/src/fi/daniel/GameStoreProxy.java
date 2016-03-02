package fi.daniel;

public class GameStoreProxy implements GameStore {

    private final int MIN_DEMAND_TO_START_SELLING = 5;
    private final GameStore gameStore;

    private int currentDemand = 0;
    private int maxDemand = 8;

    public GameStoreProxy(GameStore gameStore) {
        this.gameStore = gameStore;
    }

    @Override
    public PurchaseStatus buy(Console console) {
        System.out.println("Purchase attempt: " + ++currentDemand);
        if (currentDemand >= MIN_DEMAND_TO_START_SELLING && currentDemand < maxDemand) {
            return gameStore.buy(console);
        }
        return PurchaseStatus.FAIL;
    }
}

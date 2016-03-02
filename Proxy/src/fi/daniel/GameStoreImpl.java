package fi.daniel;

public class GameStoreImpl implements GameStore {

    @Override
    public PurchaseStatus buy(Console console) {
        return PurchaseStatus.SUCCESS;
    }
}

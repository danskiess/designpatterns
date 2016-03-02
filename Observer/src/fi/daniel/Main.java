package fi.daniel;

public class Main {

    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
        Customer playstationCustomer = new PlaystationCustomer();
        Customer xboxCustomer = new XboxCustomer();
        gameStore.addCustomer(playstationCustomer);
        gameStore.addCustomer(xboxCustomer);

        gameStore.newSale(Sale.MAHJONG_SALE);
        System.out.println("---");
        gameStore.newSale(Sale.XBOX_SALE);
        System.out.println("---");
        gameStore.newSale(Sale.PLAYSTATION_SALE);
    }
}

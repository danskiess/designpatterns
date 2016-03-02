package fi.daniel;

public class Main {

    public static void main(String[] args) {
        GameStore gameStore = new GameStoreImpl();
        GameStore gameStoreProxy = new GameStoreProxy(gameStore);
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
        System.out.println(gameStoreProxy.buy(new Xbox()));
    }
}

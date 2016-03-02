package fi.daniel;

public class PlaystationCustomer implements Customer {

    @Override
    public void notifySale(Sale sale) {
        if (sale == Sale.MAHJONG_SALE) {
            System.out.println(getClass().getSimpleName() + ", Okay... mahjong sale?");
        } else if (sale == Sale.PLAYSTATION_SALE){
            System.out.println(getClass().getSimpleName() + ", Here I am rockin......");
        } else if (sale == Sale.XBOX_SALE){
            System.out.println(getClass().getSimpleName() + ", np. Shania Twain - That Don't Impress Me Much");
        }
    }
}
